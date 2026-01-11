package com.restaurant.RestaurantMenu.types;

import org.springframework.stereotype.Component;

@Component
public class NonVegMenu implements Menu {
    @Override
    public String getType() {
        return "NON-VEG";
    }
    @Override
    public void showItems() {
        System.out.println("Non-Veg Menu: Chicken Biryani, Mutton Biryani, and Tandoori");
    }
}
