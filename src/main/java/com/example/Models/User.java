package com.example.Models;

class User {
    // Name, image, roles: customer or admin, address, mobile no., cart, product with catogory, order, payment

    // The below id set by default
    private long id = 0;

    private String name;

    private Role role = Role.CUSTOMER;

    private String address;

    private long phoneNo;

    // The below cart id is added later 
    // private Cart cart;

    // The below list of product is also add later
    // private List<Product> ownedProduct = new ArrayList<>();

    // The below order details also add later
    // private List<Order> myOrders = new ArrayList<>(); 

    // The below balance is added later when payment is added
    // private double balance; 

    // The below payment history also 
    // Add favoraties 


}

enum Role{
    ADMIN, 
    CUSTOMER
}