package com.example.eventmap.data;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class CategoriesOfEvent {
    @Embedded
    public Event event;
    @Relation(
            parentColumn = "eventId",
            entityColumn = "categoryId",
            associateBy = @Junction(EventCrossCategoryRef.class)
    )
    public List<CategoriesOfEvent> categories;
}
