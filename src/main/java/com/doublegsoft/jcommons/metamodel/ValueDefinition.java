/*
 * DOUBLEGSOFT.COM CONFIDENTIAL
 *
 * 2025 doublegsoft.com
 *
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of doublegsoft.com and its suppliers, if any.
 * The intellectual and technical concepts contained herein
 * are proprietary to doublegsoft.com and its suppliers  and
 * may be covered by China and Foreign Patents, patents in
 * process, and are protected by trade secret or copyright law.
 *
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from doublegsoft.com.
 */
package com.doublegsoft.jcommons.metamodel;

import com.doublegsoft.jcommons.metabean.AttributeDefinition;
import com.doublegsoft.jcommons.metabean.ObjectDefinition;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ValueDefinition {

  private String keyword;

  private BigDecimal number;

  private String string;

  private String variable;

  private AttributeDefinition attributeValue;

  private ObjectDefinition arrayValue;

  private ObjectDefinition objectValue;

  private ObjectDefinition filterValue;

  private CalcExprDefinition calcExpr;

  private String originalText;

  private String label;

  private final Map<String,String> options = new HashMap<>();

  private InvocationDefinition invocation;

  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public AttributeDefinition getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(AttributeDefinition attributeValue) {
    this.attributeValue = attributeValue;
  }

  public ObjectDefinition getArrayValue() {
    return arrayValue;
  }

  public void setArrayValue(ObjectDefinition arrayValue) {
    this.arrayValue = arrayValue;
  }

  public ObjectDefinition getObjectValue() {
    return objectValue;
  }

  public void setObjectValue(ObjectDefinition objectValue) {
    this.objectValue = objectValue;
  }

  public String getVariable() {
    return variable;
  }

  public void setVariable(String variable) {
    this.variable = variable;
  }

  public ObjectDefinition getFilterValue() {
    return filterValue;
  }

  public void setFilterValue(ObjectDefinition filterValue) {
    this.filterValue = filterValue;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public String getOriginalText() {
    return originalText;
  }

  public void setOriginalText(String originalText) {
    this.originalText = originalText;
  }

  public InvocationDefinition getInvocation() {
    return invocation;
  }

  public void setInvocation(InvocationDefinition invocation) {
    this.invocation = invocation;
  }

  public CalcExprDefinition getCalcExpr() {
    return calcExpr;
  }

  public void setCalcExpr(CalcExprDefinition calcExpr) {
    this.calcExpr = calcExpr;
  }
}
