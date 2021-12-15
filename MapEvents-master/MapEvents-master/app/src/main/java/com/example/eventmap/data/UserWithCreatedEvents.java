package com.example.eventmap.data;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class UserWithCreatedEvents {
    @Embedded
    public User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "userCreatorId"
    )
    public List<Event> events;
}
