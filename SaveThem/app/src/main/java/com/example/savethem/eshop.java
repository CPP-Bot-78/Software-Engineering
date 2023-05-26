package com.example.savethem;

public class eshop
{
    private int productId;
    private int[] wishlist; // product id will be added

    public eshop(int productId,int[] wishlist)
    {
        this.productId=productId;
        this.wishlist=wishlist;
    }
    public void updateStock()
    {
        //this should receive a message from a database
        System.out.println("Stock is updated!");
    }
    //getters
    public int getProductId() { return productId; }
    public int getWishlist() { return productId; }
    //setters
    public void setProductId(int productId) {this.productId=productId;}
    public void setWishlist(int[] wishlist) {this.wishlist=wishlist;}
}
