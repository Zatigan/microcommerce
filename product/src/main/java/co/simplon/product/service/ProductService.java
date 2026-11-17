package co.simplon.product.service;

import co.simplon.product.entity.ProductEntity;
import co.simplon.product.repository.ProductRepository;

public class ProductService {

    private final ProductRepository productRepository;

    ProductService(ProductRepository productRepositoryInjected) {
        this.productRepository = productRepositoryInjected;
    }

    public ProductEntity createProduct(ProductEntity productEntity) {
        ProductEntity savedProduct = productRepository.save(productEntity);

        //TODO Reprendre le repo microlibrary-exemple + SpringSecurity-library
        //TODO Client à configurer aussi

        return savedProduct;
    }
}
