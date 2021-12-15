package com.example.eventmap.data;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;
public class EventsOfCategory {
    @Embedded public EventCategory category;
    @Relation(
            parentColumn = "categoryId",
            entityColumn = "eventId",
            associateBy = @Junction(EventCrossCategoryRef.class)
    )
    public List<Event> events;
}
