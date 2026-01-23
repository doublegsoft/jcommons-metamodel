package com.doublegsoft.jcommons.metamodel;

import com.doublegsoft.jcommons.metabean.AttributeDefinition;
import com.doublegsoft.jcommons.metabean.ObjectDefinition;

public class JoinConditionDefinition {

  private ObjectDefinition leftObject;

  private AttributeDefinition leftAttribute;

  private ObjectDefinition rightObject;

  private AttributeDefinition rightAttribute;

  private String operator = "=";

  private Object value;

  public ObjectDefinition getLeftObject() {
    return leftObject;
  }

  public void setLeftObject(ObjectDefinition leftObject) {
    this.leftObject = leftObject;
  }

  public AttributeDefinition getLeftAttribute() {
    return leftAttribute;
  }

  public void setLeftAttribute(AttributeDefinition leftAttribute) {
    this.leftAttribute = leftAttribute;
  }

  public ObjectDefinition getRightObject() {
    return rightObject;
  }

  public void setRightObject(ObjectDefinition rightObject) {
    this.rightObject = rightObject;
  }

  public AttributeDefinition getRightAttribute() {
    return rightAttribute;
  }

  public void setRightAttribute(AttributeDefinition rightAttribute) {
    this.rightAttribute = rightAttribute;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }
}
