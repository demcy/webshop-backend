package com.example.webshopbackend.service;

import com.example.webshopbackend.model.Item;
import com.example.webshopbackend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;
    //public ItemService(ItemRepository itemRepository) { }
    public List<Item> getItems(){
        return itemRepository.findAll();
    }
    public Optional<Item> getItem(Long id){
        return itemRepository.findById(id);
        //return itemRepository.getById(id);
    }
    public void getOneItem(Long id){
        itemRepository.findById(id);
    }
    public void addItem(Item item){
        itemRepository.save(item);
    }
    public void editItem(Item item){
        itemRepository.save(item);
    }
    public void deleteItem(Long id){
        itemRepository.deleteById(id);
    }
}
