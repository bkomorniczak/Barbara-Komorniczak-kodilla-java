package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int id;
    private String name;
    private char sex;
    private LocalDate birthDate;
    private int numbOfPosts;

    public ForumUser(int id, String name, char sex, LocalDate birthDate, int numbOfPosts) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.numbOfPosts = numbOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumbOfPosts() {
        return numbOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", sex=" + sex +
               ", birthDate=" + birthDate +
               ", numbOfPosts=" + numbOfPosts +
               '}';
    }
}
