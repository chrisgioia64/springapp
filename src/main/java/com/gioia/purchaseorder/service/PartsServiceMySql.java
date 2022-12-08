package com.gioia.purchaseorder.service;

import com.gioia.purchaseorder.model.Part;
import com.gioia.purchaseorder.repository.PartRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Primary
public class PartsServiceMySql implements PartsService {

    private PartRepository partRepository;

    public PartsServiceMySql(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    @Override
    public Collection<Part> getAll() {
        List<Part> parts = new LinkedList<Part>();
        for (Part part : partRepository.findAll()) {
            parts.add(part);
        }
        return parts;
    }

    @Override
    public Part getPartById(int id) {
        return partRepository.findById(id).orElse(null);
    }

    @Override
    public Part removePartById(int id) {
        Optional<Part> part = partRepository.findById(id);
        if (part.isPresent()) {
            partRepository.delete(part.get());
            return part.get();
        } else {
            return null;
        }
    }

    @Override
    public Part createPart(Part part) {
        // this is done so that the JPA Entity manager creates rather than updates the entity
        part.setId(null);
        partRepository.save(part);
        return part;
    }
}
