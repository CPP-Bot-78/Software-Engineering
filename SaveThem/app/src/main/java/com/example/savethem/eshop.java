package com.example.savethem;

public class eshop
{
    private int[] wishList = new int[20]; // product id will be added
    private int[] productId = new int[20];
    private int w_index=0;
    private int p_index=0;
    public eshop(int[] productId,int[] wishList)
    {
        this.productId=productId;
        this.wishList=wishList;
    }
    public void updateStock()
    {
        //this should receive a message from a database
        System.out.println("Stock is updated!");
    }
    //getters
    public int[] getProductId() { return productId; }
    public int[] getWishlist() { return wishList; }
    //setters
    public void addWishListItem(int product)
    {
        int i = w_index++;
        productId[i]=product;
    }
    //setters
    public void setProductId(int product)
    {
        int i = p_index++;
        productId[i]=product;
    }

}
