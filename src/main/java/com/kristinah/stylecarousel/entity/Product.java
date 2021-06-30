package com.kristinah.stylecarousel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  //Added product_id instead of using id to store the actual product_id. Records won't be saved if different colors, sizes are using the same id.
  @Column(name = "productId", nullable = false)
  private long productId;
  
  @Column(name = "title", nullable = false)
  private String title;
  
  @Column(name = "color")
  private String color;
  
  @Column(name = "size")
  private String size;
  
  @Column(name = "quantity")
  private int quantity;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  
}
