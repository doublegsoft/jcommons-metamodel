package com.doublegsoft.jcommons.metamodel;

import com.doublegsoft.jcommons.metabean.ObjectDefinition;

import java.util.ArrayList;
import java.util.List;

public class CalcExprDefinition {

  private CalcExprDefinition leftOperand;

  private CalcExprDefinition rightOperand;

  private String operator;

  private ValueDefinition value;

  private String originalText;

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

  public String getOriginalText() {
    return originalText;
  }

  public void setOriginalText(String originalText) {
    this.originalText = originalText;
  }

  public List<ValueDefinition> getOperands() {
    List<ValueDefinition> retVal = new ArrayList<>();
    collectObjects(retVal, this);
    return retVal;
  }

  private void collectObjects(List<ValueDefinition> holder, CalcExprDefinition calcExpr) {
    if (calcExpr == null) {
      return;
    }
    if (calcExpr.value != null) {
      if (calcExpr.value.getCalcExpr() != null) {
        collectObjects(holder, calcExpr.value.getCalcExpr());
      } else {
        holder.add(calcExpr.value);
      }
    }
    if (calcExpr.leftOperand != null) {
      collectObjects(holder, calcExpr.leftOperand);
    }
    if (calcExpr.rightOperand != null) {
      collectObjects(holder, calcExpr.rightOperand);
    }
  }
}
