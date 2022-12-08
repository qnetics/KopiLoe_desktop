package com.coffee_shop.Models;


interface OrderModelBehaviours {


    void setProduct (String Product);
    String getProduct();

    void setPrice (int Price);
    int getPrice();

    void setQuantity(int Quantity);
    int getQuantity();

    void setProductImage(String ProductImage);
    String getProductImage();

}


public class OrderModel implements OrderModelBehaviours {
    

    private String Product;
    private int Price; 
    private int Quantity;
    private String ProductImage;

    public OrderModel() { }

    public OrderModel (String Product, int Price, int Quantity, String ProductImage) {

        this.Product  = Product;
        this.Price    = Price;
        this.Quantity = Quantity;
        this.ProductImage = ProductImage;

    }



    /**
     * 
     *  setter & getter product
     * 
     */

    // set product
    public void setProduct (String Product) {

        this.Product = Product;
    }

    // get product
    public String getProduct () { return this.Product; }



    /**
     * 
     *  setter & getter price
     * 
     */

    // set price
    public void setPrice (int Price) {

        this.Price = Price;
    }

    // get price
    public int getPrice () { return this.Price; }



    /**
     * 
     *  setter & getter quantity
     * 
     */

    // set price
    public void setQuantity (int Quantity) {

        this.Quantity = Quantity;
    }

    // get price
    public int getQuantity () { return this.Quantity; }



    /**
     * 
     *  setter & getter product image
     * 
     */

    // set product
    public void setProductImage (String ProductImage) {

        this.ProductImage = ProductImage;
    }

    // get product
    public String getProductImage () { return this.ProductImage; }

    
}