package com.doublegsoft.jcommons.metamodel;

import com.doublegsoft.jcommons.metabean.type.ObjectType;

import java.util.ArrayList;
import java.util.List;

public class InvocationDefinition {

  private String method;

  private String error;

  private final List<VariableDefinition> arguments = new ArrayList<>();

  private ObjectType returnType;

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public List<VariableDefinition> getArguments() {
    return arguments;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ObjectType getReturnType() {
    return returnType;
  }

  public void setReturnType(ObjectType returnType) {
    this.returnType = returnType;
  }
}
