package com.example.savethem;

public class MKO_authList
{

    private String MKO_Name;
    private int MKO_Code;
    private int[] MKO_List = new int[50];

public MKO_authList(String MKO_Name,int MKO_Code,int[] MKO_List)
    {
        this.MKO_Name=MKO_Name;
        this.MKO_Code=MKO_Code;
        this.MKO_List=MKO_List;
    }

    public void selectlTime() {}
    public void contentLoaded()
    {
        System.out.println("Content loaded.");
    }
    public String getMKO_Name() {return MKO_Name;}
    public int getMKO_Code() {return MKO_Code;}
    public int[] getMKO_List() {return MKO_List;}
    public void setMKO_Name() {this.MKO_Name=MKO_Name;}
    public void setMKO_Code() {this.MKO_Code=MKO_Code;}
    public void setMKO_List() {this.MKO_List=MKO_List;}
}

