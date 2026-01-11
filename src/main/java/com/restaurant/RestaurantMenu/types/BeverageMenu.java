package com.restaurant.RestaurantMenu.types;

import org.springframework.stereotype.Component;

@Component
public class BeverageMenu implements Menu {
    public String getType() { return "BEVERAGE"; }
    public void showItems() {
        System.out.println("Beverages: Coffee, Tea, Juice");
    }
}
