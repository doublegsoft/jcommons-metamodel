/*
 * DOUBLEGSOFT.COM CONFIDENTIAL
 *
 * [2025] - [?] doublegsoft.com
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

import java.util.ArrayList;
import java.util.List;

public class ComparisonDefinition extends StatementDefinition {

  private String comparand;

  private String comparator;

  private ValueDefinition value;

  private final List<ComparisonDefinition> andComparisons = new ArrayList<>();

  private final List<ComparisonDefinition> orComparisons = new ArrayList<>();

  public String getComparand() {
    return comparand;
  }

  public void setComparand(String comparand) {
    this.comparand = comparand;
  }

  public String getComparator() {
    return comparator;
  }

  public void setComparator(String comparator) {
    this.comparator = comparator;
  }

  public ValueDefinition getValue() {
    return value;
  }

  public void setValue(ValueDefinition value) {
    this.value = value;
  }

  public List<ComparisonDefinition> getAndComparisons() {
    return andComparisons;
  }

  public List<ComparisonDefinition> getOrComparisons() {
    return orComparisons;
  }

}
