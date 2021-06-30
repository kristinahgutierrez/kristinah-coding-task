package com.kristinah.stylecarousel.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class VariantDTO implements Serializable {

  private static final long serialVersionUID = -6965531966684804574L;
  
  private long id;
  private Long product_id;
  private String title;
  private BigDecimal price;
  private String sku;
  private int position;
  private String inventory_policy;
  private BigDecimal compare_at_price;
  private String fulfillment_service;
  private String inventory_management;
  private String option1;
  private String option2;
  private String option3;
  private String created_at;
  private String updated_at;
  private boolean taxable;
  private String barcode;
  private BigDecimal grams;
  private Long image_id;
  private BigDecimal weight;
  private String weight_unit;
  private Long inventory_item_id;
  private int old_inventory_quantity;
  private int inventory_quantity;
  private boolean requires_shipping;
  private String admin_graphql_api_id;
  
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Long getProduct_id() {
    return product_id;
  }

  public void setProduct_id(Long product_id) {
    this.product_id = product_id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public String getInventory_policy() {
    return inventory_policy;
  }

  public void setInventory_policy(String inventory_policy) {
    this.inventory_policy = inventory_policy;
  }

  public BigDecimal getCompare_at_price() {
    return compare_at_price;
  }

  public void setCompare_at_price(BigDecimal compare_at_price) {
    this.compare_at_price = compare_at_price;
  }

  public String getFulfillment_service() {
    return fulfillment_service;
  }

  public void setFulfillment_service(String fulfillment_service) {
    this.fulfillment_service = fulfillment_service;
  }

  public String getInventory_management() {
    return inventory_management;
  }

  public void setInventory_management(String inventory_management) {
    this.inventory_management = inventory_management;
  }

  public String getOption1() {
    return option1;
  }

  public void setOption1(String option1) {
    this.option1 = option1;
  }

  public String getOption2() {
    return option2;
  }

  public void setOption2(String option2) {
    this.option2 = option2;
  }

  public String getOption3() {
    return option3;
  }

  public void setOption3(String option3) {
    this.option3 = option3;
  }

  public String getCreated_at() {
    return created_at;
  }

  public void setCreated_at(String created_at) {
    this.created_at = created_at;
  }

  public String getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(String updated_at) {
    this.updated_at = updated_at;
  }

  public boolean isTaxable() {
    return taxable;
  }

  public void setTaxable(boolean taxable) {
    this.taxable = taxable;
  }

  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public BigDecimal getGrams() {
    return grams;
  }

  public void setGrams(BigDecimal grams) {
    this.grams = grams;
  }

  public Long getImage_id() {
    return image_id;
  }

  public void setImage_id(Long image_id) {
    this.image_id = image_id;
  }

  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public String getWeight_unit() {
    return weight_unit;
  }

  public void setWeight_unit(String weight_unit) {
    this.weight_unit = weight_unit;
  }

  public Long getInventory_item_id() {
    return inventory_item_id;
  }

  public void setInventory_item_id(Long inventory_item_id) {
    this.inventory_item_id = inventory_item_id;
  }

  public int getOld_inventory_quantity() {
    return old_inventory_quantity;
  }

  public void setOld_inventory_quantity(int old_inventory_quantity) {
    this.old_inventory_quantity = old_inventory_quantity;
  }

  public int getInventory_quantity() {
    return inventory_quantity;
  }

  public void setInventory_quantity(int inventory_quantity) {
    this.inventory_quantity = inventory_quantity;
  }

  public boolean isRequires_shipping() {
    return requires_shipping;
  }

  public void setRequires_shipping(boolean requires_shipping) {
    this.requires_shipping = requires_shipping;
  }

  public String getAdmin_graphql_api_id() {
    return admin_graphql_api_id;
  }

  public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
    this.admin_graphql_api_id = admin_graphql_api_id;
  }

}
