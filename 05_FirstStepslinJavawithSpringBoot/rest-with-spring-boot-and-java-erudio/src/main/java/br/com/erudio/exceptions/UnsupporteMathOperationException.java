package br.com.erudio.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupporteMathOperationException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public UnsupporteMathOperationException(String exception) {
    super(exception);
  }
  
}
