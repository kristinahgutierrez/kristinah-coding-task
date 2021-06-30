package com.kristinah.stylecarousel.dto;

import java.io.Serializable;
import java.util.List;

public class ResponseDTO implements Serializable  {

  private static final long serialVersionUID = -688960376229597349L;
  
  private List<ProductDTO> products;

  public List<ProductDTO> getProducts() {
    return products;
  }

  public void setProducts(List<ProductDTO> products) {
    this.products = products;
  }
  
}
