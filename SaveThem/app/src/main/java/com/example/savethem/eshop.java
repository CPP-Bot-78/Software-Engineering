package com.example.savethem;

public class eshop
{
    private int productId;
    private List<int> wishList = new ArrayList<int>; // product id will be added

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
    public List<int> getWishlist() { return wishList; }
    //setters
    public void setProductId(int productId) {this.productId=productId;}
    public void addWishListItem(int productId) {this.wishlist.add(productId);}
}
