package com.gioia.purchaseorder.web;

import com.gioia.purchaseorder.service.PartsService;
import com.gioia.purchaseorder.service.PartsServiceInMemory;
import com.gioia.purchaseorder.model.Part;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MyRestController {

    private PartsService service;

    public MyRestController(PartsService service) {
        this.service = service;
    }

    // Cannot have an empty constructor because dependency injection
    // will use this constructor to instantiate
//    public MyRestController() {
//
//    }

    @GetMapping("/parts")
    public ResponseEntity<Collection<Part>> getParts() {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Access-Control-Allow-Origin", "*")
                .body(service.getAll());
    }

    @GetMapping("/parts/{id}")
    public Part getPart(@PathVariable int id) {
        Part part = service.getPartById(id);
        if (part != null) {
            return part;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/parts/{id}")
    public Part deletePart(@PathVariable int id) {
        Part part = service.removePartById(id);
        return part;
    }

    @PostMapping("/parts")
    public ResponseEntity createPart(@RequestBody @Valid Part part) {
        service.createPart(part);
        return ResponseEntity.ok("User is valid");
    }

}
