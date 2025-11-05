/*
 * DOUBLEGSOFT.COM CONFIDENTIAL
 *
 * [2016] - [?] doublegsoft.com
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

import com.doublegsoft.jcommons.metabean.ModelDefinition;

import java.util.*;

/**
 * It is the definition to usecases.
 *
 * @author <a href="mailto:guo.guo.gan@gmail.com">Christian Gann</a>
 *
 * @since 6.0
 */
public class UsecaseDefinition {

  private String module;

  private final String name;

  private ValueDefinition remote;

  private String originalText;

  private final Map<String, Object> options = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

  private ParameterizedObjectDefinition parameterizedObject;

  private ReturnedObjectDefinition returnedObject;

  private final List<StatementDefinition> statements = new ArrayList<>();

  private final ModelDefinition contextModel = new ModelDefinition();

  public UsecaseDefinition(String name) {
    this.name = name;
  }

  public void setModule(String module) {
    this.module = module;
  }

  public String getModule() {
    return module;
  }

  public String getName() {
    return name;
  }

  public void addOption(String name, String value) {
    options.put(name, value);
  }

  public <T> T getOption(String name) {
    return (T) options.get(name);
  }

  public Map<String, Object> getOptions() {
    return Collections.unmodifiableMap(options);
  }

  public ParameterizedObjectDefinition getParameterizedObject() {
    return parameterizedObject;
  }

  public void setParameterizedObject(ParameterizedObjectDefinition parameterizedObject) {
    this.parameterizedObject = parameterizedObject;
  }

  public ReturnedObjectDefinition getReturnedObject() {
    return returnedObject;
  }

  public void setReturnedObject(ReturnedObjectDefinition returnedObject) {
    this.returnedObject = returnedObject;
  }

  public ValueDefinition getRemote() {
    return remote;
  }

  public ModelDefinition getContextModel() {
    return contextModel;
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

  public List<StatementDefinition> getStatements() {
    return statements;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 71 * hash + Objects.hashCode(this.module);
    hash = 71 * hash + Objects.hashCode(this.name);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final UsecaseDefinition other = (UsecaseDefinition) obj;
    if (!Objects.equals(this.module, other.module)) {
      return false;
    }
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    return true;
  }

}
