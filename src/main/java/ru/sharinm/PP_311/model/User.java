package ru.sharinm.PP_311.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "Не указан логин")
    @Size(min=3, max=30, message = "Логин должен состоять от 3 до 30 символов")
    @Column(nullable = false)
    private String login;
    @NotEmpty(message = "Не указано имя")
    @Size(min=3, max=30, message = "Имя должно состоять от 3 до 30 символов")
    private String name;
    @NotEmpty(message = "Не указан адрес электронной почты")
    @Email(message = "Электронная почта не соответствует формату")
    private String email;

    public User() {
    }

    public User(int id, String login, String name, String email) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
