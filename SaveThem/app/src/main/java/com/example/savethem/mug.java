package com.example.savethem;

public class mug extends product
{
    private String color;
    private int cupSize;
    private String mugType;

    public mug(String name,int id,int stock,int price,String productedBy,String type,String mko,String slogan,String color,String slogun,int cupSize,String mugType,int image)
    {
        super(name, id, stock, price, productedBy, type, mko,slogan,image);
        this.color = color;
        this.cupSize = cupSize;
        this.mugType = mugType;
    }
    //getters
    public String getColor() { return color; }
    public int getCupSize() { return cupSize; }
    public String getMugType() { return mugType; }
    //setters
    public void setColor(String color) {this.color = color;}
    public void setCupSize(int cupSize) {this.cupSize = cupSize;}
    public void setMugType(String mugType) {this.mugType = mugType;}
}
