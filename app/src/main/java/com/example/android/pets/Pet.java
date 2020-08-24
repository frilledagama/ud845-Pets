package com.example.android.pets;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "pets", indices = {@Index(value = {"pet_id"}, unique = true)})
public class Pet {
    @PrimaryKey(autoGenerate = true)
    private int pet_id;

    private String pet_name;
    private String pet_breed;
    private int pet_gender;
    private int pet_weight;

    public Pet(int pet_id, String pet_name, String pet_breed, int pet_gender, int pet_weight) {
        this.pet_id = pet_id;
        this.pet_name = pet_name;
        this.pet_breed = pet_breed;
        this.pet_gender = pet_gender;
        this.pet_weight = pet_weight;
    }

    //get and set methods

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public String getPet_breed() {
        return pet_breed;
    }

    public void setPet_breed(String pet_breed) {
        this.pet_breed = pet_breed;
    }

    public int getPet_gender() {
        return pet_gender;
    }

    public void setPet_gender(int pet_gender) {
        this.pet_gender = pet_gender;
    }

    public int getPet_weight() {
        return pet_weight;
    }

    public void setPet_weight(int pet_weight) {
        this.pet_weight = pet_weight;
    }

}
