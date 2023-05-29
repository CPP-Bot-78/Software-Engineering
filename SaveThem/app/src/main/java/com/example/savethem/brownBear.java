package com.example.savethem;

public class brownBear extends species{
    private String bearCharacteristic1;
    private String bearCharacteristic2;
    public brownBear(int id, int popularity, String name, String description, String location, String animalType, String bearCharacteristic1, String bearCharacteristic2)
    {
        super(id, popularity, name, description, location, animalType);
        this.bearCharacteristic1=bearCharacteristic1;
        this.bearCharacteristic2=bearCharacteristic2;
    }
}
