package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theSelectedUsers = forum.getUsers().stream()
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.of(2000,3,13)))
                .filter(forumUser -> forumUser.getNumbOfPosts()>1)
                .filter(forumUser -> forumUser.getSex()=='M')
                .collect(Collectors.toMap(ForumUser::getId,forumUser -> forumUser));


        theSelectedUsers.entrySet().stream()
                .map(entry->entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
