package com.example.savethem;

public class MKO_Authorities
{
     private String MKO_Name;
     private String Street;
     private int Number;
     private String City;
     private String Country;
     private int MKO_Code;

     public MKO_Authorities(String MKO_Name,String Street,int Number,String City,String Country,int MKO_Code)
     {
          this.MKO_Name=MKO_Name;
          this.Street=Street;
          this.Number=Number;
          this.City=City;
          this.Country=Country;
          this.MKO_Code=MKO_Code;
     }
     public void LoadMKO() {
          System.out.println("Content loaded.");
     }
}

