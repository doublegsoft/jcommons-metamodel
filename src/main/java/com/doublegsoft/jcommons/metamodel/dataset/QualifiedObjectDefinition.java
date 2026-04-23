package com.doublegsoft.jcommons.metamodel.dataset;

import com.doublegsoft.jcommons.metabean.ObjectDefinition;

public class QualifiedObjectDefinition {

  private final String alias;

  private final ObjectDefinition object;

  public QualifiedObjectDefinition(String alias, ObjectDefinition object) {
    this.alias = alias;
    this.object = object;
  }

  public String getAlias() {
    return alias;
  }

  public ObjectDefinition getObject() {
    return object;
  }
}
