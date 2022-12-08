package com.coffee_shop.Repositories;


import java.util.ArrayList;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

import com.coffee_shop.Models.OrderModel;
import com.coffee_shop.Services.OrderService;
import com.coffee_shop.Configurations.DatabasesConfiguration;


public class OrderRepository implements OrderService {


    private Connection SQLiteConnection;
    private Statement  SQLiteStatement;


    public OrderRepository() {

        try {

            // calling databases configuration
            DatabasesConfiguration SQLiteConfig = new DatabasesConfiguration();

            // create sqlite connection
            this.SQLiteConnection = SQLiteConfig.SQLiteConfiguration();
            this.SQLiteStatement  = SQLiteConnection.createStatement();


        } catch (Exception ErrorMessage) { 
            
            ErrorMessage.printStackTrace();
        }

    }


    public boolean createOrder (OrderModel Orders) {

        try {

            String SQLiteQuery = "INSERT INTO UserOrder ( " + 
                
                "ProductName, ProductPrice, " +
                "ProductQuantity, ProductImage" +

            " ) VALUES ( " + 
                "'" + Orders.getProduct() + "'" + ", " +
                String.valueOf(Orders.getPrice()) + ", " +
                String.valueOf(Orders.getQuantity()) + ", " +
                "'" + Orders.getProductImage() + "'" +
            ");";

            this.SQLiteStatement.executeUpdate(SQLiteQuery);
            this.SQLiteStatement.close();

            return true;


        } catch (Exception ErrorMessage) {

            System.out.println(ErrorMessage);
            return false;

        }

    }


    public ArrayList<OrderModel> showOrders () {

        ArrayList<OrderModel> Orders = new ArrayList<OrderModel>();

        String SQLiteQuery = "SELECT * FROM UserOrder";

        try {

            ResultSet QueryResult = this.SQLiteStatement
                .executeQuery(SQLiteQuery);

            while ( QueryResult.next() ) {

                OrderModel Model = new OrderModel();

                // set product name
                Model.setProduct(QueryResult.getString("ProductName"));

                // set product price
                Model.setPrice(QueryResult.getInt("ProductPrice"));

                // set product quantity
                Model.setQuantity(QueryResult.getInt("ProductQuantity"));

                // set product image
                Model.setProductImage(QueryResult.getString("ProductImage"));

                Orders.add(Model);
            }

            this.SQLiteStatement.close();

        } catch (Exception ErrorMessage) {

            ErrorMessage.printStackTrace();

        }

        return Orders;

    }




    public void deleteOrder (String ProductName) {

        String SQLiteQuery = "DELETE FROM UserOrder WHERE ProductName='" + ProductName + "';";

        try {
         
            this.SQLiteStatement.executeUpdate(SQLiteQuery);
            this.SQLiteStatement.close();

            
        } catch (Exception ErrorMessage) {

            ErrorMessage.printStackTrace();
            
        }

    }

}
