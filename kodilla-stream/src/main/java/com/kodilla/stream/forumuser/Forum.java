package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> users = new ArrayList <>();

    public Forum(){
        users.add(new ForumUser(1, "Max", 'M', LocalDate.of(2000,1,1),2));
        users.add(new ForumUser(2, "Max", 'F', LocalDate.of(2003,1,1),0));
        users.add(new ForumUser(3, "Max", 'F', LocalDate.of(2004,1,1),0));
        users.add(new ForumUser(4, "Max", 'M', LocalDate.of(2005,1,1),0));
        users.add(new ForumUser(5, "Max", 'M', LocalDate.of(1995,1,1),3));
        users.add(new ForumUser(6, "Max", 'F', LocalDate.of(1876,1,1),255));
        users.add(new ForumUser(7, "Max", 'M', LocalDate.of(2002,1,1),12));
        users.add(new ForumUser(8, "Max", 'F', LocalDate.of(1998,1,1),24));
        users.add(new ForumUser(9, "Max", 'F', LocalDate.of(2001,1,1),32));
        users.add(new ForumUser(10, "Max", 'M', LocalDate.of(2020,1,1),62));
        users.add(new ForumUser(11, "Max", 'F', LocalDate.of(200,1,1),72));
        users.add(new ForumUser(12, "Max", 'M', LocalDate.of(2005,1,1),12));
        users.add(new ForumUser(13, "Max", 'F', LocalDate.of(1989,1,1),62));
        users.add(new ForumUser(14, "Max", 'M', LocalDate.of(1999,1,1),92));
        users.add(new ForumUser(15, "Max", 'M', LocalDate.of(2000,1,1),9992));
        users.add(new ForumUser(16, "Max", 'F', LocalDate.of(2000,1,1),29));
        users.add(new ForumUser(17, "Max", 'F', LocalDate.of(2000,1,1),28));
    }

    public List<ForumUser> getUsers(){
        return new ArrayList <>(users);
    }
 }
