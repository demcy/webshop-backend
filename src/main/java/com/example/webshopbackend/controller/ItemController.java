package com.example.webshopbackend.controller;

import com.example.webshopbackend.model.Item;
import com.example.webshopbackend.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("items")
    public List<Item> getItems(){
        return itemService.getItems();
    }

    @PostMapping("items")
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }

    @DeleteMapping("items/{id}")
    public void deleteItem(@PathVariable Long id){
        itemService.deleteItem(id);
    }

    @GetMapping("items/{id}")
    public Optional<Item> getItem(@PathVariable Long id){
        return itemService.getItem(id);
    }

    @PostMapping("items")
    public void editItem(@RequestBody Item item) {
        itemService.editItem(item);
    }
}
