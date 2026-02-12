package com.example.itemapi.controller;

import com.example.itemapi.model.Item;
import com.example.itemapi.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    // Add a new item
    @PostMapping
    public ResponseEntity<?> addItem(@RequestBody Item item) {

        // Input validation
        if (item.getName() == null || item.getName().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Item name is required");
        }

        if (item.getDescription() == null || item.getDescription().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Item description is required");
        }

        if (item.getPrice() <= 0) {
            return ResponseEntity.badRequest().body("Item price must be greater than 0");
        }

        Item savedItem = itemService.addItem(item);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }

    // Get a single item by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getItemById(@PathVariable Long id) {

        Optional<Item> item = itemService.getItemById(id);

        if (item.isPresent()) {
            return ResponseEntity.ok(item.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Item not found with id: " + id);
        }
    }
}
