package com.example.eventmap.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface EventDao {
    @Insert
    void insertAll(Event... events);

    @Delete
    void delete(Event event);

    @Query("SELECT * FROM events")
    List<Event> getAll();
}
