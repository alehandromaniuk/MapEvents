package com.example.eventmap.data;

import androidx.room.Entity;

@Entity(primaryKeys = {"userId", "eventId"})
public class UserCrossEventRef {
    public long userId;
    public long eventId;
}

