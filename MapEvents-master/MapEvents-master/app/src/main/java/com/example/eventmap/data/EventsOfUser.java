package com.example.eventmap.data;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class EventsOfUser {
    @Embedded
    public User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "eventId",
            associateBy = @Junction(UserCrossEventRef.class)
    )
    public List<Event> events;
}
