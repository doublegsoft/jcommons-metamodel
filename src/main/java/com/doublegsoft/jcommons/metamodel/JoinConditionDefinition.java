package com.doublegsoft.jcommons.metamodel;

import com.doublegsoft.jcommons.metabean.AttributeDefinition;
import com.doublegsoft.jcommons.metabean.ObjectDefinition;

import java.util.Objects;

public class JoinConditionDefinition {

  private String leftObjectAlias;

  private String rightObjectAlias;

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

  public String getLeftObjectAlias() {
    return leftObjectAlias;
  }

  public void setLeftObjectAlias(String leftObjectAlias) {
    this.leftObjectAlias = leftObjectAlias;
  }

  public String getRightObjectAlias() {
    return rightObjectAlias;
  }

  public void setRightObjectAlias(String rightObjectAlias) {
    this.rightObjectAlias = rightObjectAlias;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    JoinConditionDefinition that = (JoinConditionDefinition) o;
    if ("=".equals(operator) && value == null) {
      return (Objects.equals(this.leftObjectAlias, that.leftObjectAlias) &&
              Objects.equals(this.rightObjectAlias, that.rightObjectAlias) &&
              Objects.equals(leftObject, that.leftObject) &&
              Objects.equals(leftAttribute, that.leftAttribute) &&
              Objects.equals(rightObject, that.rightObject) &&
              Objects.equals(rightAttribute, that.rightAttribute)) ||
              (Objects.equals(leftObject, that.rightObject) &&
              Objects.equals(leftAttribute, that.rightAttribute) &&
              Objects.equals(rightObject, that.leftObject) &&
              Objects.equals(rightAttribute, that.leftAttribute));
    }
    return Objects.equals(leftObject, that.leftObject) &&
        Objects.equals(leftAttribute, that.leftAttribute) &&
        Objects.equals(rightObject, that.rightObject) &&
        Objects.equals(rightAttribute, that.rightAttribute) &&
        Objects.equals(operator, that.operator) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftObject, leftAttribute, rightObject, rightAttribute, operator, value) *
        Objects.hash(rightObject, rightAttribute, leftObject, leftAttribute, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder retVal = new StringBuilder();
    retVal.append(leftObject.getName()).append(".").append(leftAttribute.getName());
    retVal.append(" ").append(getOperator()).append(" ");
    if (value != null) {
      retVal.append("'").append(value).append("'");
    } else {
      retVal.append(rightObject.getName()).append(".").append(rightAttribute.getName());
    }
    return retVal.toString();
  }
}
