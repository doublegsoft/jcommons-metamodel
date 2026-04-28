package com.doublegsoft.jcommons.metamodel.query;

import com.doublegsoft.jcommons.metamodel.ValueDefinition;
import com.doublegsoft.jcommons.metamodel.dataset.QualifiedAttributeDefinition;

public class PredicateDefinition {

  private QualifiedAttributeDefinition qualifiedAttribute;

  private String operator;

  private ValueDefinition value;

  public QualifiedAttributeDefinition getQualifiedAttribute() {
    return qualifiedAttribute;
  }

  public void setQualifiedAttribute(QualifiedAttributeDefinition qualifiedAttribute) {
    this.qualifiedAttribute = qualifiedAttribute;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public ValueDefinition getValue() {
    return value;
  }

  public void setValue(ValueDefinition value) {
    this.value = value;
  }
}
