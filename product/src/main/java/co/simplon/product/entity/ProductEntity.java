package co.simplon.product.entity;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NonNull;

import java.util.UUID;

public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NonNull
    @Column(length = 100, nullable = false)
    private String name;

    @NonNull
    @Column(length = 350, nullable = false)
    private String description;

    @NonNull
    @Column(length = 100, nullable = false)
    private String category;
}
