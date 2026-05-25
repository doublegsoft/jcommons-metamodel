package com.doublegsoft.jcommons.metamodel.expr;

import com.doublegsoft.jcommons.metamodel.ValueDefinition;

public class CalculationExpressionDefinition extends ValueDefinition {

  private ValueDefinition value;

  private String operator;

  private CalculationExpressionDefinition leftOperand;

  private CalculationExpressionDefinition rightOperand;

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

  public CalculationExpressionDefinition getLeftOperand() {
    return leftOperand;
  }

  public void setLeftOperand(CalculationExpressionDefinition leftOperand) {
    this.leftOperand = leftOperand;
  }

  public CalculationExpressionDefinition getRightOperand() {
    return rightOperand;
  }

  public void setRightOperand(CalculationExpressionDefinition rightOperand) {
    this.rightOperand = rightOperand;
  }
}
