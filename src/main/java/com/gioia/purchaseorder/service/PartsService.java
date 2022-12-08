package com.gioia.purchaseorder.service;

import com.gioia.purchaseorder.model.Part;

import java.util.Collection;

public interface PartsService {

    Collection<Part> getAll();

    Part getPartById(int id);

    Part removePartById(int id);

    Part createPart(Part part);

}
