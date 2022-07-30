package com.example.practicalead.service;

import com.example.practicalead.entity.Product;
import com.example.practicalead.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    final ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }
    public Page<Product> findAll(int page, int limit){
        return productRepository.findAll(
                PageRequest.of(page-1, limit, Sort.Direction.ASC,"id"));
    }
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

}
