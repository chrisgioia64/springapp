package com.gioia.purchaseorder.service;

import com.gioia.purchaseorder.model.Part;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PartsServiceInMemory implements PartsService {

    private Map<Integer, Part> db;
    private int id = 4;

    public PartsServiceInMemory() {
        db = new HashMap<>();
        db.put(1, new Part(1, "Keyboard", 50.00));
        db.put(2, new Part(2, "Laptop", 799.00));
        db.put(3, new Part(3,"Power Chord", 25.00));
    }

    public Collection<Part> getAll() {
        return db.values();
    }

    public Part getPartById(int id) {
        return db.get(id);
    }

    public Part removePartById(int id) {
        return db.remove(id);
    }

    public Part createPart(Part part) {
        part.setId(id);
        db.put(id, part);
        id++;
        return part;
    }

}
