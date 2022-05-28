package com.example.forum_web_ver_2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "dbo_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    //Tài khoản đăng nhập kết nối với database
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "user_display_name",nullable = false)
    private String UserDisplayName;
    @Column(name = "password",nullable = false)
    private String Password;

    @Column(name = "creation_date",nullable = false)
    private String CreationDate;

    @Column(name = "role",nullable = false)
    private String Role;


    public User(String Email, String userDisplayName, String password, String creationDate, String role) {
        email = Email;
        UserDisplayName = userDisplayName;
        Password = password;
        CreationDate = creationDate;
        Role = role;
    }
}
