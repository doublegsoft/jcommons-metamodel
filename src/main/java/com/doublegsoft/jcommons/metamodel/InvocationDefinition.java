package com.doublegsoft.jcommons.metamodel;

import java.util.ArrayList;
import java.util.List;

public class InvocationDefinition {

  private String method;

  private final List<String> parameters = new ArrayList<>();

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public List<String> getParameters() {
    return parameters;
  }
}
