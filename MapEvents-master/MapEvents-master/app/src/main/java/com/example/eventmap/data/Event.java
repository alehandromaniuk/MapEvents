package com.example.eventmap.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "events")
public class Event {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "event_id")
    private long eventId;
    @NonNull
    private String name;
    @NonNull
    private Date date;
    private long userCreatorId;

    public Event(long eventId, @NonNull String name, @NonNull Date date, long userCreatorId) {
        this.eventId = eventId;
        this.name = name;
        this.date = date;
        this.userCreatorId = userCreatorId;
    }


    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public Date getDate() {
        return date;
    }

    public void setDate(@NonNull Date date) {
        this.date = date;
    }

    public long getUserCreatorId() {
        return userCreatorId;
    }

    public void setUserCreatorId(long userCreatorId) {
        this.userCreatorId = userCreatorId;
    }
}
