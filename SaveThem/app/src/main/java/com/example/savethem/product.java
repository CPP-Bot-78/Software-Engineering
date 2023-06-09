package com.example.savethem;

import java.util.ArrayList;

public class product
{
    protected String name;
    protected static int id;
    protected int stock;
    protected int price;
    protected String productedBy;
    protected String type;
    protected String mko;
    protected String slogan;
    protected int image;
    public product(String name,int id,int stock,int price,String productedBy,String type,String mko,String slogan,int image)
    {
        this.name=name;
        this.id=id;
        this.stock=stock;
        this.price=price;
        this.productedBy=productedBy;
        this.type=type;
        this.mko=mko;
        this.slogan=slogan;
        this.image=image;
    }
    public boolean stockCheck()
    {
        if (stock>0) return true;
        else return false;
    }
    public boolean hasSlogan()
    {
        if (slogan.equals("")) return false;
        else return true;
    }
    public String hasSloganFrom()
    {
        if(this.hasSlogan()) return mko;
        else return "";
    }
    public String getName(){return name;}
    public String getType(){return type;}
    public int getImage(){return image;}
}
