package com.restaurant.RestaurantMenu.types;

import org.springframework.stereotype.Component;
@Component
public class VegMenu implements Menu {
    public String getType() { return "VEG"; }
    public void showItems() {
        System.out.println("Veg Menu: Paneer, Veg Biryani");
    }
}
