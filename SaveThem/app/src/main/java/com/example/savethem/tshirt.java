package com.example.savethem;

enum Size {XS,S,M,L,XL,XXL;}
enum Sex {Man, Woman;}
public class tshirt extends product
{
    private String color;
    private Size size;
    private Sex sex;

    public tshirt(int id,int stock,int price,String productedBy,String type,String mko,String slogan,String color,Size size,Sex sex)
    {
        super(id,stock,price,productedBy,type,mko,slogan);
        this.color=color;
        this.size=size;
        this.sex=sex;
    }
    //getters
    public String getColor() { return color; }
    public Size getSize() { return size; }
    public Sex getSex() { return sex; }
    //setters
    public void setColor(String color) {this.color = color;}
    public void setSize(Size size) {this.size = size;}
    public void setSex(Sex sex) {this.sex = sex;}
}


