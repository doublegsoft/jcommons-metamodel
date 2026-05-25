package com.doublegsoft.jcommons.metamodel.expr;

import com.doublegsoft.jcommons.metamodel.ValueDefinition;

public class CalculateExpressionDefinition extends ValueDefinition {

  private ValueDefinition value;

  private String operator;

  private CalculateExpressionDefinition leftOperand;

  private CalculateExpressionDefinition rightOperand;

  public ValueDefinition getValue() {
    return value;
  }

  public void setValue(ValueDefinition value) {
    this.value = value;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public CalculateExpressionDefinition getLeftOperand() {
    return leftOperand;
  }

  public void setLeftOperand(CalculateExpressionDefinition leftOperand) {
    this.leftOperand = leftOperand;
  }

  public CalculateExpressionDefinition getRightOperand() {
    return rightOperand;
  }

  public void setRightOperand(CalculateExpressionDefinition rightOperand) {
    this.rightOperand = rightOperand;
  }
}
