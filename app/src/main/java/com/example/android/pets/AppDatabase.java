package com.example.android.pets;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Pet.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract PetDao petDao();
}
