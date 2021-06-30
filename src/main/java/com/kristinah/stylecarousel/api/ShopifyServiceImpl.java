package com.kristinah.stylecarousel.api;

import javax.inject.Inject;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kristinah.stylecarousel.dto.ResponseDTO;
import com.kristinah.stylecarousel.exception.RestAPIException;

@Service
public class ShopifyServiceImpl implements ShopifyService {

  @Inject
  RestTemplate restTemplate;

  private HttpHeaders getAuthHeader() {
    HttpHeaders headers = new HttpHeaders();
    headers.add("X-Shopify-Access-Token", "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");
    return headers;
  }

  @Override
  public ResponseDTO getProducts() {
    String url = "https://take-home-test-store.myshopify.com/admin/api/2021-04/products.json";
    HttpEntity<String> request = new HttpEntity<>(getAuthHeader());

    ResponseEntity<ResponseDTO> response = restTemplate.exchange(url, HttpMethod.GET, request, ResponseDTO.class);
    if (!response.getStatusCode().is2xxSuccessful()) {
      String message = String.format("Error in retrieving product list: %s", response);
      throw new RestAPIException(message);
    } else {
      return response.getBody();
    }

  }
}
