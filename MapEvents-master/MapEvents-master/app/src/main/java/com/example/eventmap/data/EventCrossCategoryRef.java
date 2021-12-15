package com.example.eventmap.data;

import androidx.room.Entity;

@Entity(primaryKeys = {"categoryId", "eventId"})
public class EventCrossCategoryRef {
    public long categoryId;
    public long eventId;
}
