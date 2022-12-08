package com.gioia.purchaseorder.repository;

import com.gioia.purchaseorder.model.Part;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartRepository extends CrudRepository<Part, Integer> {

}
