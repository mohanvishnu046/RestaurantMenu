package com.restaurant.RestaurantMenu.facade;

import com.restaurant.RestaurantMenu.MenuFactory;
import com.restaurant.RestaurantMenu.types.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RestaurantFacade {

    @Autowired
    private MenuFactory factory;
    public void getMenu(String type){
        Menu menu = factory.getMenu(type.toUpperCase());
        if(menu != null)
            menu.showItems();
        else System.out.println(" No valid menu type");
    }

    public void getAllMenu(){
        for(Menu menu : factory.getAllMenu())
            menu.showItems();
    }
}
