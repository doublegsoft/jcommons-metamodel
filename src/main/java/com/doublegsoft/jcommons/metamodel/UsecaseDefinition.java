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

import com.doublegsoft.jcommons.metabean.AttributeDefinition;
import com.doublegsoft.jcommons.metabean.ModelDefinition;
import com.doublegsoft.jcommons.metabean.ObjectDefinition;
import com.doublegsoft.jcommons.metabean.type.CollectionType;
import com.doublegsoft.jcommons.metabean.type.ObjectType;
import com.doublegsoft.jcommons.utils.Strings;

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

  private final Map<String, VariableDefinition> variables = new HashMap<>();

  private final ModelDefinition contextModel = new ModelDefinition();

  private ModelDefinition dataModel;

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

  public void setOption(String name, Object value) {
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

  public ModelDefinition getDataModel() {
    return dataModel;
  }

  public void setDataModel(ModelDefinition dataModel) {
    this.dataModel = dataModel;
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
    VariableDefinition retVal = variables.get(name);
    if (retVal == null) {
      for (AttributeDefinition attr : parameterizedObject.getAttributes()) {
        String attrname = attr.getName();
        if (attr.getName().equals("id") || attr.getName().equals("name") ||
            attr.getName().equals("type") || attr.getName().equals("code")) {
          String origObjName = attr.getLabelledOption("original", "object");
          attrname = origObjName + "_" + attrname;
        }
        registerVariable(attrname, attr.getType());
      }
      retVal = variables.get(name);
    }
    return retVal;
  }

  public Set<ObjectDefinition> getDataObjects() {
    HashSet<ObjectDefinition> retVal = new HashSet<>();
    for (AttributeDefinition attr : parameterizedObject.getAttributes()) {
      String origObjName = attr.getLabelledOption("original", "object");
      if (Strings.isEmpty(origObjName)) {
        continue;
      }
      ObjectDefinition origObj = dataModel.findObjectByName(origObjName);
      if (origObj != null) {
        retVal.add(origObj);
      }
    }
    if (returnedObject != null) {
      for (AttributeDefinition attr : returnedObject.getAttributes()) {
        String conjObjName = attr.getLabelledOption("conjunction", "object");
        if (Strings.isEmpty(conjObjName)) {
          conjObjName = attr.getLabelledOption("conjunction", "name");
        }
        if (!Strings.isEmpty(conjObjName)) {
          ObjectDefinition conjObj = dataModel.findObjectByName(conjObjName);
          retVal.add(conjObj);
        }
      }
    }
    retVal.addAll(getDataObjectsInStatements(statements));
    return retVal;
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

  private Set<ObjectDefinition> getDataObjectsInStatements(List<StatementDefinition> statements) {
    Set<ObjectDefinition> retVal = new HashSet<>();
    for (StatementDefinition stmt : statements) {
      if (stmt instanceof SaveDefinition) {
        SaveDefinition save = (SaveDefinition) stmt;
        if (save.getSaveObject() != null) {
          retVal.add(save.getSaveObject());
        }
      } else if (stmt instanceof AssignmentDefinition) {
        AssignmentDefinition assign = (AssignmentDefinition) stmt;
        ValueDefinition value = assign.getValue();
        if (value.getObjectValue() != null) {
          String origObjName = value.getObjectValue().getLabelledOption("original", "object");
          ObjectDefinition origObj = dataModel.findObjectByName(origObjName);
          if (origObj != null) {
            retVal.add(origObj);
          }
        } else if (value.getArrayValue() != null) {
          String origObjName = value.getArrayValue().getLabelledOption("original", "object");
          ObjectDefinition origObj = dataModel.findObjectByName(origObjName);
          if (origObj != null) {
            retVal.add(origObj);
          }
        }
      } else if (stmt.isLoop()) {
        LoopDefinition loop = (LoopDefinition) stmt;
        if (loop.getComponentType() != null) {
          retVal.add(loop.getComponentType());
        }
        retVal.addAll(getDataObjectsInStatements(stmt.getStatements()));
      } else if (stmt.isConditional()) {
        retVal.addAll(getDataObjectsInStatements(stmt.getStatements()));
      }
    }
    return retVal;
  }

}
