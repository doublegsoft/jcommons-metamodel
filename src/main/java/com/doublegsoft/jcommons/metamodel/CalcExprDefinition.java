package com.doublegsoft.jcommons.metamodel;

public class CalcExprDefinition {

  private ValueDefinition leftOperand;

  private ValueDefinition rightOperand;

  private String operator;

  public ValueDefinition getLeftOperand() {
    return leftOperand;
  }

  public void setLeftOperand(ValueDefinition leftOperand) {
    this.leftOperand = leftOperand;
  }

  public ValueDefinition getRightOperand() {
    return rightOperand;
  }

  public void setRightOperand(ValueDefinition rightOperand) {
    this.rightOperand = rightOperand;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }
}
