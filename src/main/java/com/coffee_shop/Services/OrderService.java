package com.coffee_shop.Services;

import java.util.ArrayList;

import com.coffee_shop.Models.OrderModel;


public interface OrderService {


    boolean createOrder (OrderModel Orders);

    ArrayList<OrderModel> showOrders(); 

    void deleteOrder (String ProductName);

}
