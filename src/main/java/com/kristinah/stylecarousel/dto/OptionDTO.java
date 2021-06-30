package com.kristinah.stylecarousel.dto;

import java.io.Serializable;

public class OptionDTO implements Serializable {
  private static final long serialVersionUID = -3863169203522655169L;
  
  private long id;
  private Long product_id;
  private String name;
  private int position;
  private String[] values;

  
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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getPosition() {
    return position;
  }
  public void setPosition(int position) {
    this.position = position;
  }
  public String[] getValues() {
    return values;
  }
  public void setValues(String[] values) {
    this.values = values;
  }

}
