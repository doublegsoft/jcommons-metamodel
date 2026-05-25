package com.doublegsoft.jcommons.metamodel.expr;

import com.doublegsoft.jcommons.metamodel.ValueDefinition;

import java.util.ArrayList;
import java.util.List;

public class ComparisonDefinition extends ValueDefinition {

  private final List<ComparisonDefinition> andExpressions = new ArrayList<>();

  private final List<ComparisonDefinition> orExpressions = new ArrayList<>();

  private ValueDefinition comparand;

  private ValueDefinition value;

  private String comparator;

  public List<ComparisonDefinition> getAndExpressions() {
    return andExpressions;
  }

  public List<ComparisonDefinition> getOrExpressions() {
    return orExpressions;
  }

  public ValueDefinition getComparand() {
    return comparand;
  }

  public void setComparand(ValueDefinition comparand) {
    this.comparand = comparand;
  }

  public ValueDefinition getValue() {
    return value;
  }

  public void setValue(ValueDefinition value) {
    this.value = value;
  }

  public String getComparator() {
    return comparator;
  }

  public void setComparator(String comparator) {
    this.comparator = comparator;
  }
}
