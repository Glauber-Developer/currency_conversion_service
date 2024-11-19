package com.currency_conversion_service.currency_conversion_service;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class ResourceNotFoundException extends RuntimeException {

  public ResourceNotFoundException(String message) {

    super(message);

  }

}
