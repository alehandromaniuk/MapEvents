package com.example.eventmap.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface EventCategoryDao {
    @Insert
    void insertAll(EventCategory... categories);

    @Delete
    void delete(EventCategory eventCategory);

    @Query("SELECT * FROM categories")
    List<EventCategory> getAll();
}
