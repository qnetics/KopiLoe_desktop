/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee_shop.Handlers;

/**
 *
 * @author kiwog
 */

import com.coffee_shop.Views.ProductOrderPage;

public class ProductRedirect {

    
    public ProductRedirect(
        String ProductName, int ProductPrice,
        String ProductImage, int QuantityProductDefault,
        String BackFormat
    ) {
        

        ProductOrderPage OrderPage = new ProductOrderPage(
                ProductName, 
                ProductPrice, 
                ProductImage,
                QuantityProductDefault,
                BackFormat
        );
        
        OrderPage.setVisible(true);
        OrderPage.pack();
        OrderPage.setLocationRelativeTo(null);
        OrderPage.setDefaultCloseOperation(ProductOrderPage.EXIT_ON_CLOSE);
    }
    
}
