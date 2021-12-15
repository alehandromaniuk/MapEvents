package com.example.eventmap.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "categories")
public class EventCategory {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "category_id")
    private long categoryId;
    @NonNull
    private String name;

    public EventCategory(int categoryId, @NonNull String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
