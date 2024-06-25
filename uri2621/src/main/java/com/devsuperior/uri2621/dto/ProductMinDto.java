package com.devsuperior.uri2621.dto;

import com.devsuperior.uri2621.projections.ProductMinProjection;

public class ProductMinDto {
    private String name;

    public ProductMinDto() {

    }

    public ProductMinDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ProductMinDto(ProductMinProjection projection) {
        name = projection.getName();
    }

    @Override
    public String toString() {
        return "ProductMinDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
