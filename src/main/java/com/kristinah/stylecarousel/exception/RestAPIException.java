package com.kristinah.stylecarousel.exception;

public class RestAPIException extends RuntimeException  {

  private static final long serialVersionUID = -5410566061140007403L;
  
  public RestAPIException() {
    super();
  }
  
  public RestAPIException(String message) {
    super(message);
  }
}
