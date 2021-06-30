package com.kristinah.stylecarousel.dto;

import java.io.Serializable;
import java.util.List;

public class ProductDTO implements Serializable {
  private static final long serialVersionUID = 6818157564419404145L;

  private long id;
  private String body_html;
  private String created_at;
  private String handle;
  private List<OptionDTO> options;
  private String product_type;
  private String published_at;
  private String published_scope;
  private String status;
  private String tags;
  private String template_suffix;
  private String title;
  private String updated_at;
  private List<VariantDTO> variants;
  private String vendor;
  private String admin_graphql_api_id;
  
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getBody_html() {
    return body_html;
  }

  public void setBody_html(String body_html) {
    this.body_html = body_html;
  }

  public String getCreated_at() {
    return created_at;
  }

  public void setCreated_at(String created_at) {
    this.created_at = created_at;
  }

  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public List<OptionDTO> getOptions() {
    return options;
  }

  public void setOptions(List<OptionDTO> options) {
    this.options = options;
  }

  public String getProduct_type() {
    return product_type;
  }

  public void setProduct_type(String product_type) {
    this.product_type = product_type;
  }

  public String getPublished_at() {
    return published_at;
  }

  public void setPublished_at(String published_at) {
    this.published_at = published_at;
  }

  public String getPublished_scope() {
    return published_scope;
  }

  public void setPublished_scope(String published_scope) {
    this.published_scope = published_scope;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public String getTemplate_suffix() {
    return template_suffix;
  }

  public void setTemplate_suffix(String template_suffix) {
    this.template_suffix = template_suffix;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(String updated_at) {
    this.updated_at = updated_at;
  }

  public List<VariantDTO> getVariants() {
    return variants;
  }

  public void setVariants(List<VariantDTO> variants) {
    this.variants = variants;
  }

  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public String getAdmin_graphql_api_id() {
    return admin_graphql_api_id;
  }

  public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
    this.admin_graphql_api_id = admin_graphql_api_id;
  }

  
}
