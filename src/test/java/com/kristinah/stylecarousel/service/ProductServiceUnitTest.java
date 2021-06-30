package com.kristinah.stylecarousel.service;

import static com.kristinah.stylecarousel.helper.MockHelper.mockResponseDTO;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.kristinah.stylecarousel.api.ShopifyService;
import com.kristinah.stylecarousel.dto.ResponseDTO;
import com.kristinah.stylecarousel.entity.Product;
import com.kristinah.stylecarousel.repository.ProductRepository;

@ExtendWith(SpringExtension.class)
class ProductServiceUnitTest {

  private static ResponseDTO responseDTO;
  
  @InjectMocks
  private ProductService productService = new ProductServiceImpl();
  
  @Mock
  ProductRepository productRepository;
  
  @Mock
  private ShopifyService shopifyService;

  @BeforeEach
  public void mockData() {
    responseDTO = mockResponseDTO();
  }
  
  
  @Test
  @DisplayName("Test sync data")
  void testSaveNewData() throws Exception {
    when(shopifyService.getProducts()).thenReturn(responseDTO);
    when(productRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.empty());
    
    productService.saveOrUpdate();
    
    ArgumentCaptor<List<Product>> argument = ArgumentCaptor.forClass(List.class);
    verify(productRepository, times(1)).saveAll(argument.capture());
    Product product = argument.getValue().get(0);
    
    assertEquals(product.getProductId(), responseDTO.getProducts().get(0).getId());
  }
}
