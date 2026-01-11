package com.restaurant.RestaurantMenu;

import com.restaurant.RestaurantMenu.types.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MenuFactory {

    static Map<String, Menu> menuMap = new HashMap<>();

    @Autowired
    public MenuFactory(List<Menu> menus) {
        for(Menu menu:menus)
            menuMap.put(menu.getType(), menu);
    }

    public Menu getMenu(String type){
        return menuMap.get(type);
    }

    public Collection<Menu> getAllMenu(){
        return menuMap.values();
    }
}
