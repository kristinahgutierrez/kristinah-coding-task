package com.kristinah.stylecarousel.web;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kristinah.stylecarousel.api.ShopifyService;
import com.kristinah.stylecarousel.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
  
  @Inject
  ShopifyService shopifyService;
  
  @Inject
  ProductService productService;
  
  //test load data from shopify API
  /*@GetMapping("/read")
  public ResponseEntity<ResponseDTO> loadProductDetails() {
    ResponseDTO response = shopifyService.getProducts();
    return new ResponseEntity<>(response, HttpStatus.OK);
  }*/

  @PostMapping("/sync-data")
  public ResponseEntity<Object> createProductData() {
    Map<String, String> body = new HashMap<>();
    body.put("message", "Records saved.");
    productService.saveOrUpdate();
    return new ResponseEntity<>(body, HttpStatus.CREATED);
  }
  
}
