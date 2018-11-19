package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.stream.*;


public class StreamMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();

        Forum forum = new Forum();

        forum.getUserList().stream()
                .forEach(System.out::println);

        Map<Integer,ForumUser> myList = forum.getUserList().stream()
                    .filter(s-> s.getSex()== 'M')
                    .filter(s-> ChronoUnit.YEARS.between( s.getBirthDate(),nowDate)>=20)
                    .filter(s-> s.getPosts()>0)
                    .collect(Collectors.toMap(ForumUser::getId,Forum->Forum));


        System.out.println("\n" + "# elements: " + myList.size() + "\n");

        myList.entrySet().stream()
                .forEach(System.out::println);

    }
    }



