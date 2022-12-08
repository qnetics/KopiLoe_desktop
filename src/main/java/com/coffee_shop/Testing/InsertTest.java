package com.coffee_shop.Testing;

import com.coffee_shop.Models.OrderModel;
import com.coffee_shop.Repositories.OrderRepository;

public class InsertTest {
    
    public static void main (String[] args) throws Exception {

        OrderRepository OrderRepo = new OrderRepository();

        boolean CreateOrder = OrderRepo.createOrder(new OrderModel("susu", 1000, 8, "susu.jpg"));
        
        if ( CreateOrder ) {

            System.out.println(true);
        } else {

            System.out.println(false);
        }

    }

}
