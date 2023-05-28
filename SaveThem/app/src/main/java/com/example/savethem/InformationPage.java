package com.example.savethem;

public class InformationPage

{
    private String MKO_Name;
    private int establishmentYear;
    private String founder;
    public InformationPage(String MKO_Name, int establishmentYear, String founder)
    {
    this.MKO_Name = MKO_Name;
    this.establishmentYear = establishmentYear;
    this.founder = founder;
    }

    public void writeEmail()
    {
    System.out.println("You can write email.");
    }
    public String getMKO_Name() {return MKO_Name;}
    public int getEstablishmentYear() {return establishmentYear;}
    public String getFounder() {return founder;}

    public void setMKO_Name(String MKO_Name) {this.MKO_Name=MKO_Name;}
    public void setEshtablishmentYear(int establishmentYear) {this.establishmentYear=establishmentYear;}
    public void setFounder(String founder) {this.founder=founder;}
}