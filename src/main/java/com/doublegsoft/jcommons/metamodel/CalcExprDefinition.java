package com.doublegsoft.jcommons.metamodel;

public class CalcExprDefinition {

  private CalcExprDefinition leftOperand;

  private CalcExprDefinition rightOperand;

  private String operator;

  private ValueDefinition value;

  public CalcExprDefinition getLeftOperand() {
    return leftOperand;
  }

  public void setLeftOperand(CalcExprDefinition leftOperand) {
    this.leftOperand = leftOperand;
  }

  public CalcExprDefinition getRightOperand() {
    return rightOperand;
  }

  public void setRightOperand(CalcExprDefinition rightOperand) {
    this.rightOperand = rightOperand;
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
