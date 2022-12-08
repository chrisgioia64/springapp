package com.gioia.purchaseorder.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("PARTS")
public class Part {

    public Part(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Part(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Part() {
    }

    @Id
    private Integer id;

    @NotEmpty
    private String name;

    private Double price;

}
