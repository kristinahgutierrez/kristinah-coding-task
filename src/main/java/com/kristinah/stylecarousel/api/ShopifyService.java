package com.kristinah.stylecarousel.api;

import com.kristinah.stylecarousel.dto.ResponseDTO;

public interface ShopifyService {

  /**
   * This method is used to retrieve data from shopify API to retrieve products data
   * 
   * @return ResponseDTO
   */
  ResponseDTO getProducts();
  
}
