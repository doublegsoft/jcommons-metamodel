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

  public List<ObjectDefinition> getOperands() {
    List<ObjectDefinition> retVal = new ArrayList<>();
    collectObjects(retVal, this);
    return retVal;
  }

  private void collectObjects(List<ObjectDefinition> holder, CalcExprDefinition calcExpr) {
    if (value != null) {
      if (value.getObjectValue() != null) {
        holder.add(value.getObjectValue());
      } else if (value.getArrayValue() != null) {
        holder.add(value.getArrayValue());
      } else if (value.getCalcExpr() != null) {
        collectObjects(holder, calcExpr);
      }
    }
    if (leftOperand != null) {
      collectObjects(holder, leftOperand);
    }
    if (rightOperand != null) {
      collectObjects(holder, rightOperand);
    }
  }
}
