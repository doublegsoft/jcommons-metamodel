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

import com.doublegsoft.jcommons.metabean.ObjectDefinition;

public class SaveDefinition extends StatementDefinition {

  private String variable;

  private VariableDefinition variableObject;

  private String typeName;

  private ObjectDefinition saveObject;

  private boolean array;

  public String getVariable() {
    return variable;
  }

  public void setVariable(String variable) {
    this.variable = variable;
  }

  public VariableDefinition getVariableObject() {
    return variableObject;
  }

  public void setVariableObject(VariableDefinition variableObject) {
    this.variableObject = variableObject;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public ObjectDefinition getSaveObject() {
    return saveObject;
  }

  public void setSaveObject(ObjectDefinition saveObject) {
    this.saveObject = saveObject;
  }

  public boolean isArray() {
    return array;
  }

  public void setArray(boolean array) {
    this.array = array;
  }
}
