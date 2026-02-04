package com.doublegsoft.jcommons.metamodel;

import com.doublegsoft.jcommons.metabean.ObjectDefinition;
import com.doublegsoft.jcommons.metabean.type.CollectionType;
import com.doublegsoft.jcommons.metabean.type.ObjectType;

import java.util.Objects;

public class VariableDefinition {

  private ObjectType type;

  private String name;

  public VariableDefinition() {

  }

  public VariableDefinition(String name, ObjectType type) {
    this.type = type;
    this.name = name;
  }

  public ObjectType getType() {
    return type;
  }

  public void setType(ObjectType type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isCollection() {
    return type != null && type instanceof CollectionType;
  }

  public ObjectType getComponentType() {
    if (!isCollection()) {
      return null;
    }
    CollectionType collType = (CollectionType) type;
    return collType.getComponentType();
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    VariableDefinition that = (VariableDefinition) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
