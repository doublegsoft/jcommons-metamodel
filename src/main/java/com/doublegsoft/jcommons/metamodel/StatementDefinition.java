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

public class StatementDefinition {

  protected String operator;

  protected ValueDefinition remote;

  protected InvocationDefinition invocation;

  protected final List<StatementDefinition> statements = new ArrayList<>();

  protected String originalText;

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public List<StatementDefinition> getStatements() {
    return statements;
  }

  public boolean isConditional() {
    return operator.endsWith("?|");
  }

  public boolean isLoop() {
    return operator.endsWith("*|");
  }

  public int getLevel() {
    int count = 0;
    for (int i = 0; i < operator.length(); i++) {
      if (operator.charAt(i) == '|') count++;
    }
    return count - 1;
  }

  public InvocationDefinition getInvocation() {
    return invocation;
  }

  public void setInvocation(InvocationDefinition invocation) {
    this.invocation = invocation;
  }

  public ValueDefinition getRemote() {
    return remote;
  }

  public void setRemote(ValueDefinition remote) {
    this.remote = remote;
  }

  public String getOriginalText() {
    return originalText;
  }

  public void setOriginalText(String originalText) {
    this.originalText = originalText;
  }
}
