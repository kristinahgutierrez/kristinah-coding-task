package com.kristinah.stylecarousel.service;

import static com.kristinah.stylecarousel.helper.MockHelper.mockResponseDTO;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import com.kristinah.stylecarousel.api.ShopifyService;
import com.kristinah.stylecarousel.api.ShopifyServiceImpl;
import com.kristinah.stylecarousel.dto.ResponseDTO;
import com.kristinah.stylecarousel.exception.RestAPIException;

@ExtendWith(SpringExtension.class)
class ShopifyServiceUnitTest {
  private static ResponseDTO responseDTO;

  @InjectMocks
  private ShopifyService shopifyService = new ShopifyServiceImpl();
  
  @Mock
  RestTemplate restTemplate;

  @BeforeEach
  public void mockData() {
    responseDTO = mockResponseDTO();
  }
  
  @Test
  @DisplayName("Test read data - success")
  void testReadDataSuccess() throws Exception {
    ResponseEntity<ResponseDTO> response = new ResponseEntity<>(responseDTO, HttpStatus.OK);
    when(restTemplate.exchange(anyString(), any(HttpMethod.class), any(), ArgumentMatchers.<Class<ResponseDTO>>any())).thenReturn(response);
    
    ResponseDTO responseDTO = shopifyService.getProducts();
    assertEquals(response.getBody(), responseDTO);
  }
  
  @Test
  @DisplayName("Test read data - fail")
  void testReadDataFail() throws Exception {
    ResponseEntity<ResponseDTO> response = new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    when(restTemplate.exchange(anyString(), any(HttpMethod.class), any(), ArgumentMatchers.<Class<ResponseDTO>>any())).thenReturn(response);
    
    assertThrows(RestAPIException.class, () -> {
      shopifyService.getProducts();
    });
  }
}
