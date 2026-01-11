package com.restaurant.RestaurantMenu.types;

import org.springframework.stereotype.Component;

@Component
public class DessertMenu implements Menu {
    public String getType() { return "DESSERT"; }
    public void showItems() {
        System.out.println("Desserts: Ice Cream, Gulab Jamun");
    }
}
