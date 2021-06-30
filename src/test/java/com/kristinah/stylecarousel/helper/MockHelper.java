package com.kristinah.stylecarousel.helper;


import java.math.BigDecimal;
import java.util.Arrays;

import com.kristinah.stylecarousel.dto.OptionDTO;
import com.kristinah.stylecarousel.dto.ProductDTO;
import com.kristinah.stylecarousel.dto.ResponseDTO;
import com.kristinah.stylecarousel.dto.VariantDTO;

public class MockHelper {

  public static ResponseDTO mockResponseDTO() {
    ResponseDTO responseDTO = new ResponseDTO();
    
    ProductDTO productDTO = mockProductDTO();
    responseDTO.setProducts(Arrays.asList(productDTO));
    
    return responseDTO;
  }
  
  public static ProductDTO mockProductDTO() {
    ProductDTO productDTO = new ProductDTO();
    productDTO.setId(6778057228473l);
    productDTO.setTitle("Jeans");
    productDTO.setBody_html("All in Retro 70's style.");
    productDTO.setVendor("Take Home Test Store");
    productDTO.setProduct_type("");
    productDTO.setCreated_at("2021-06-13T16:26:58-07:00");
    productDTO.setHandle("jeans");
    productDTO.setUpdated_at("2021-06-25T07:03:38-07:00");
    productDTO.setPublished_at(null);
    productDTO.setTemplate_suffix("");
    productDTO.setStatus("draft");
    productDTO.setPublished_scope("web");
    productDTO.setTags("");
    productDTO.setAdmin_graphql_api_id("gid://shopify/Product/6778057228473");
    productDTO.setVariants(Arrays.asList(mockVariantDTO()));
    productDTO.setOptions(Arrays.asList(mockSizeOptionDTO(), mockColorOptionDTO()));
    return productDTO;
  }
  
  public static VariantDTO mockVariantDTO() {
    VariantDTO variantDTO = new VariantDTO();
    variantDTO.setId(40245918662841l);
    variantDTO.setProduct_id(6778057228473l);
    variantDTO.setTitle("XL / Multi-Color");
    variantDTO.setPrice(BigDecimal.ZERO);
    variantDTO.setSku("");
    variantDTO.setPosition(1);
    variantDTO.setInventory_policy("deny");
    variantDTO.setCompare_at_price(null);
    variantDTO.setFulfillment_service("manual");
    variantDTO.setInventory_management("shopify");
    variantDTO.setOption1("XL");
    variantDTO.setOption2("Multi-Color");
    variantDTO.setOption3(null);
    variantDTO.setCreated_at("2021-06-13T16:26:58-07:00");
    variantDTO.setUpdated_at("2021-06-13T16:26:58-07:00");
    variantDTO.setTaxable(true);
    variantDTO.setBarcode("");
    variantDTO.setGrams(BigDecimal.ZERO);
    variantDTO.setImage_id(null);
    variantDTO.setWeight(BigDecimal.ZERO);
    variantDTO.setWeight_unit("kg");
    variantDTO.setInventory_item_id(42340329652409l);
    variantDTO.setInventory_quantity(2);
    variantDTO.setOld_inventory_quantity(2);
    variantDTO.setRequires_shipping(true);
    variantDTO.setAdmin_graphql_api_id("gid://shopify/ProductVariant/40245918662841");
    return variantDTO;
  }
  
  public static OptionDTO mockSizeOptionDTO() {
    String[] values = {"XL","XS","XXL","XXXS"};
    OptionDTO optionDTO = new OptionDTO();
    optionDTO.setId(8729438945465l);
    optionDTO.setProduct_id(6778057228473l);
    optionDTO.setName("Size");
    optionDTO.setPosition(1);
    optionDTO.setValues(values);
    return optionDTO;
  }
  
  public static OptionDTO mockColorOptionDTO() {
    String[] values = {"Pink","Red"};
    OptionDTO optionDTO = new OptionDTO();
    optionDTO.setId(8729438945465l);
    optionDTO.setProduct_id(6778057228473l);
    optionDTO.setName("Color");
    optionDTO.setPosition(2);
    optionDTO.setValues(values);
    return optionDTO;
  }
  
}
