package com.trainingprogram.swaraj.service;

import org.springframework.stereotype.Service;
import com.trainingprogram.swaraj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.trainingprogram.swaraj.entity.Product;
import java.util.List;


@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repo;

    public Product addProduct(Product product) {
        return repo.save(product);
    }


    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Product updateProduct(Long id, Product updatedProduct){
        Product existingProduct = repo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));

        if(existingProduct != null) {
            existingProduct.setProductName(updatedProduct.getProductName());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setCategory(updatedProduct.getCategory());
            existingProduct.setQuantity(updatedProduct.getQuantity());
            return repo.save(existingProduct);
        }
        throw new RuntimeException("Product not found");
    }

    public void deleteProduct(Long id) {
        repo.deleteById(id);
        if(!repo.existsById(id)) {
            System.out.println("Product deleted successfully");
        } else {
            System.out.println("Failed to delete product");
        }
    }

    public List<Product> getProductsByCategory(String category) {
        return repo.findByCategory(category);
    }

    public List<Product> saveProductList(List<Product> products) {
        return repo.saveAll(products);
    }
 
}
