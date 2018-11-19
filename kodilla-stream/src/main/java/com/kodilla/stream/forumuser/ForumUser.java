package com.kodilla.stream.forumuser;

import java.time.*;
import java.util.*;

public class ForumUser {
    private int id;
    private String userName;
    private char sex;
    private LocalDate birthDate;
    private int posts ;

    public ForumUser(int id, String userName, char sex, LocalDate birthDate, int posts) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return getId() == forumUser.getId() &&
                getSex() == forumUser.getSex() &&
                getPosts() == forumUser.getPosts() &&
                Objects.equals(getUserName(), forumUser.getUserName()) &&
                Objects.equals(getBirthDate(), forumUser.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUserName(), getSex(), getBirthDate(), getPosts());
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", posts=" + posts +
                '}';
    }
}
