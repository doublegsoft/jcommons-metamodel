package com.doublegsoft.jcommons.metamodel;

public class CalculationDefinition extends ValueDefinition {

  private ValueDefinition value;

  private String operator;

  private CalculationDefinition leftOperand;

  private CalculationDefinition rightOperand;

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

  public CalculationDefinition getLeftOperand() {
    return leftOperand;
  }

  public void setLeftOperand(CalculationDefinition leftOperand) {
    this.leftOperand = leftOperand;
  }

  public CalculationDefinition getRightOperand() {
    return rightOperand;
  }

  public void setRightOperand(CalculationDefinition rightOperand) {
    this.rightOperand = rightOperand;
  }
}
