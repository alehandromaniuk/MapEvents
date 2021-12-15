package com.example.eventmap.data;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class UsersOfEvent {
    @Embedded
    public Event event;
    @Relation(
            parentColumn = "eventId",
            entityColumn = "userId",
            associateBy = @Junction(UserCrossEventRef.class)
    )
    public List<User> users;
}
