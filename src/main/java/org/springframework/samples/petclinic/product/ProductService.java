package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
    public List<Product> getAllProducts(){
		return productRepository.findAll();
    }

    public List<Product> getProductsCheaperThan(double price) {
        List<Product> p = this.productRepository.findByPriceLessThan(price);
		return p;
    }

    public ProductType getProductType(String typeName) {
    	return productRepository.findProductType(typeName);
    }
    
    public Product save(Product p) {
    	return productRepository.save(p);
    }

	public List<ProductType> findAllProductTypes() {
		List<ProductType> pt = productRepository.findAllProductTypes();
		return pt;
	}

    
}
