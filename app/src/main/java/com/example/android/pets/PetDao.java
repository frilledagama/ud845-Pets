package com.example.android.pets;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface PetDao {
   @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertPet(Pet pet);

   @Update
    public void updatePet(Pet pet);

   @Delete
    public void deletePet(Pet pet);

   @Delete
    public void deleteAllPets(Pet... pets);
}
