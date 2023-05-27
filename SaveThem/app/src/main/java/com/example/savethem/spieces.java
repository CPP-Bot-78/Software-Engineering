package com.example.savethem;

abstract class spieces
{
    protected int id;
    protected int popularity;
    protected String name;
    protected String description;
    protected String location;
    protected String animalType;

    public spieces(int id, int popularity, String name, String description, String location, String animalType)
    {
        this.id=id;
        this.popularity=popularity;
        this.name=name;
        this.description=description;
        this.location=location;
        this.animalType=animalType;
    }

    public int getId() {return id;}
    public int getPopularity() {return popularity;}
    public String getName() {return name;}
    public String getDescription() {return description;}
    public String getLocation() {return location;}
    public String getAnimalType() {return animalType;}

}



