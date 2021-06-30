package com.kristinah.stylecarousel.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kristinah.stylecarousel.api.ShopifyService;
import com.kristinah.stylecarousel.dto.OptionDTO;
import com.kristinah.stylecarousel.dto.ProductDTO;
import com.kristinah.stylecarousel.dto.ResponseDTO;
import com.kristinah.stylecarousel.dto.VariantDTO;
import com.kristinah.stylecarousel.entity.Product;
import com.kristinah.stylecarousel.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
  
  @Autowired
  ProductRepository productRepository;
  
  @Inject
  ShopifyService shopifyService;

  @Override
  public void saveOrUpdate() {
    List<Product> products = new ArrayList<>();
    ResponseDTO responseDTO = shopifyService.getProducts();
    List<ProductDTO> productDTOs = responseDTO.getProducts();
    productDTOs.stream().forEach(p -> {
      Optional<Product> existingProduct = productRepository.findById(p.getId());
      
      Map<String, Integer> options = new HashMap<>();
      for(OptionDTO o : p.getOptions()) {
        options.put(o.getName(), o.getPosition());
      }
      
      for(VariantDTO v : p.getVariants()) {
        Map<String, String> mapVariants = getVariants(options, v);
        Product product = existingProduct.isPresent() ? existingProduct.get() : new Product();
        product.setProductId(p.getId());
        product.setTitle(p.getTitle());
        product.setColor(mapVariants.get("Color"));
        product.setSize(mapVariants.get("Size"));
        product.setQuantity(v.getInventory_quantity());
        products.add(product);
      }
    });
    System.out.println("size: " + products.size());
    productRepository.saveAll(products);
  }
  
  private Map<String, String> getVariants(Map<String, Integer> options, VariantDTO v){
    Map<String, String> variants = new HashMap<>();
    for(Map.Entry<String, Integer> entry : options.entrySet()) {
      if(entry.getValue() == 1) {
        variants.put(entry.getKey(), v.getOption1());
      } else if(entry.getValue() == 2) {
        variants.put(entry.getKey(), v.getOption2());
      } 
    }
    return variants;
  }
  
}
