package com.alexisnavarro.gestion_productos.product.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre del producto no puede estar vacío.")
    @Size(max = 255, message = "El nombre del producto no debe exceder los 255 caracteres.")
    @Column(nullable = false, length = 255)
    private String name;

    @NotBlank(message = "La descripción no puede estar vacía.")
    @Size(max = 500, message = "La descripción no debe exceder los 500 caracteres.")
    @Column(nullable = false, length = 500)
    private String description;

    @NotNull(message = "El precio no puede ser nulo.")
    @Min(value = 0, message = "El precio debe ser un número positivo.")
    @Column(nullable = false)
    private Double price;

    @NotBlank(message = "El SKU no puede estar vacío.")
    @Size(max = 10, message = "El SKU no debe exceder los 10 caracteres.")
    @Column(nullable = false, length = 10, unique = true)
    private String skull;

    public Double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSkull() {
        return skull;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSkull(String skull) {
        this.skull = skull;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
