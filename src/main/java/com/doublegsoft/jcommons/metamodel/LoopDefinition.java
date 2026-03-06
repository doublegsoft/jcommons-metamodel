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

import com.doublegsoft.jcommons.metabean.ObjectDefinition;
import com.doublegsoft.jcommons.metabean.type.CollectionType;
import com.doublegsoft.jcommons.metabean.type.ObjectType;

import java.util.HashMap;
import java.util.Map;

public class LoopDefinition extends StatementDefinition {

  private String itemVar;

  private String arrayVar;

  private ObjectDefinition componentType;

  private final Map<String, VariableDefinition> variables = new HashMap<>();

  public String getItemVar() {
    return itemVar;
  }

  public void setItemVar(String itemVar) {
    this.itemVar = itemVar;
  }

  public String getArrayVar() {
    return arrayVar;
  }

  public void setArrayVar(String arrayVar) {
    this.arrayVar = arrayVar;
  }

  public ObjectDefinition getComponentType() {
    return componentType;
  }

  public void setComponentType(ObjectDefinition componentType) {
    this.componentType = componentType;
  }

  public void registerVariable(String name, ObjectType type) {
    registerVariable(name, type, false);
  }

  public void registerVariable(String name, ObjectType type, boolean array) {
    if (variables.containsKey(name)) {
      return;
    }
    VariableDefinition var = new VariableDefinition();
    var.setName(name);
    if (array) {
      CollectionType collType = new CollectionType(type.getName());
      collType.setComponentType(type);
      var.setType(collType);
    } else {
      var.setType(type);
    }
    variables.put(name, var);
  }

  public VariableDefinition getVariable(String name) {
    return variables.get(name);
  }
}
