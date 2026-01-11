package com.restaurant.RestaurantMenu;

import com.restaurant.RestaurantMenu.facade.RestaurantFacade;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/restaurant/")
public class MenuController {

    @Autowired
    private RestaurantFacade facade;

    @GetMapping("/menu/{type}")
    public ResponseEntity<?> getMenu(@PathVariable String type){
        facade.getMenu(type);
        return ResponseEntity.ok("Menu available in console");
    }
    @GetMapping("/menuByParam")
    public ResponseEntity<?> getMenuByParam(@RequestParam(name = "q ") String type){
        facade.getMenu(type);
        return ResponseEntity.ok("Using RequestParam Menu available in console");
    }

    @GetMapping("/menu")
    public ResponseEntity<?> getAllMenu(){
        facade.getAllMenu();
        return ResponseEntity.ok("Menu available in console");
    }
}
