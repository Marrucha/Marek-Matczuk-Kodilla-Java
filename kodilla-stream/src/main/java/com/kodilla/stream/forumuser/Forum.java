package com.kodilla.stream.forumuser;

import java.time.*;
import java.util.*;

public final class Forum {

    public final List<ForumUser> getUserList (){
     List<ForumUser> users = new ArrayList<ForumUser>();
     Random random = new Random();

        for (int i = 1;i<20;i++) {
            // sex creation
            char sexId;
            if(random.nextInt(2) == 0)
                sexId = 'K';
            else sexId = 'M';

         // Local date random creation
            int year = random.nextInt(100)+ 1918;
            int month = random.nextInt(11)+1;
            int day = random.nextInt(27)+1;
            LocalDate ld = LocalDate.of(year,month,day );

            ForumUser fu = new ForumUser(random.nextInt(100000), "Kowalski" + i, sexId, ld, random.nextInt(100) );
            users.add(fu);
        }
        return users;
    }
}
