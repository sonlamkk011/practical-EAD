package com.example.practicalead.service;

import com.example.practicalead.entity.Product;
import com.example.practicalead.entity.Sale;
import com.example.practicalead.repository.ProductRepository;
import com.example.practicalead.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SaleService {
    final SaleRepository saleRepository;

    public Sale save(Sale sale) {
        return saleRepository.save(sale);
    }
    public Page<Sale> findAll(int page, int limit){
        return saleRepository.findAll(
                PageRequest.of(page-1, limit, Sort.Direction.ASC,"id"));
    }
    public Optional<Sale> findById(Long id) {
        return saleRepository.findById(id);
    }
    public void deleteById(Long id) {
        saleRepository.deleteById(id);
    }

}
