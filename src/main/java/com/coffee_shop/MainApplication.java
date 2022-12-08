package com.coffee_shop;

/**
 *
 * @author al-fariqy raihan azhwar
 * @npm 202143501514
 * 
 */

//import com.coffee_shop.Views.LoginPage.LoginPage;
import com.coffee_shop.Views.ProductPage;
//import com.coffee_shop.Views.CartPage;

public class MainApplication {
    
    public static void main(String[] args) {
        
        
        // Starter Page
        ProductPage UserLoginPage = new ProductPage();
       
        UserLoginPage.setVisible(true);
        UserLoginPage.pack();
        UserLoginPage.setLocationRelativeTo(null);
        UserLoginPage.setDefaultCloseOperation(ProductPage.EXIT_ON_CLOSE);

        
        // CartPage cartPage = new CartPage();
        // cartPage.setVisible(true);
        // cartPage.pack();
        // cartPage.setLocationRelativeTo(null);
        // cartPage.setDefaultCloseOperation(CartPage.EXIT_ON_CLOSE);
    }
    
}
