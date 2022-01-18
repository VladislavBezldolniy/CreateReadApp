package com.vladyslav.CreateReadApp.resource;


import com.vladyslav.CreateReadApp.model.Item;
import com.vladyslav.CreateReadApp.model.Response;
import com.vladyslav.CreateReadApp.service.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Map;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemResource {

    private final ItemServiceImpl itemService;

    @GetMapping
    ResponseEntity<Response> getItems(){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("items", itemService.list()))
                        .message("Items retrieved")
                        .httpStatus(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @PostMapping("/save")
    ResponseEntity<Response> saveItems(@RequestBody @Valid Item item){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("item", itemService.create(item)))
                        .message("Item created")
                        .httpStatus(CREATED)
                        .statusCode(CREATED.value())
                        .build()
        );
    }

    @GetMapping("/get/{id}")
    ResponseEntity<Response> getItem(@PathVariable("id") Long id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("item", itemService.get(id)))
                        .message("Item retrieved")
                        .httpStatus(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Response> deleteItems(@PathVariable("id") Long id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("deleted", itemService.delete(id)))
                        .message("Item deleted")
                        .httpStatus(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

}
