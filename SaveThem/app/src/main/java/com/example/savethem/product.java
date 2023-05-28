package com.example.savethem;

public class product
{
    protected int id;
    protected int stock;
    protected int price;
    protected String productedBy;
    protected String type;
    protected String mko;
    protected String slogan;
    public product(int id,int stock,int price,String productedBy,String type,String mko,String slogan)
    {
        this.id=id;
        this.stock=stock;
        this.price=price;
        this.productedBy=productedBy;
        this.type=type;
        this.mko=mko;
        this.slogan=slogan;
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

}
