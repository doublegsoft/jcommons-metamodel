package com.doublegsoft.jcommons.metamodel.group;

import com.doublegsoft.jcommons.metabean.ObjectDefinition;

public class AggregateDefinition {

  private final ObjectDefinition root;

  public AggregateDefinition(ObjectDefinition root) {
    this.root = root;
  }

  public ObjectDefinition getRoot() {
    return root;
  }
}
