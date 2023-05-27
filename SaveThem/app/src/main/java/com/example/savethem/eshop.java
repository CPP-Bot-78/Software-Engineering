package com.example.savethem;

public class eshop
{
<<<<<<< Updated upstream
    private int productId;
    private List<int> wishList = new ArrayList<int>; // product id will be added

    public eshop(int productId,int[] wishlist)
=======
    private int[] productId = new int [20];;
    private int[] wishlist=new int [20];
    public eshop(int[] productId,int[] wishlist)
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    public int getProductId() { return productId; }
    public List<int> getWishlist() { return wishList; }
    //setters
    public void setProductId(int productId) {this.productId=productId;}
    public void addWishListItem(int productId) {this.wishlist.add(productId);}
=======
    public int[] getProductId() { return productId; }
    public int[] getWishlist() { return productId; }
    //setters
    public void setProductId(int[] productId) {this.productId=productId;}
    public void setWishlist(int[] wishlist) {this.wishlist=wishlist;}
>>>>>>> Stashed changes
}
