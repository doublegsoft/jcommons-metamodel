package com.doublegsoft.jcommons.metamodel.graph;

import com.doublegsoft.jcommons.metabean.ObjectDefinition;
import com.doublegsoft.jcommons.metamodel.dataset.JoinConditionDefinition;

import java.util.ArrayList;
import java.util.List;

public class AggregateRootDefinition {

  private final ObjectDefinition root;

  private final List<JoinedObjectDefinition> joinedObjects = new ArrayList<>();

  public AggregateRootDefinition(ObjectDefinition root) {
    this.root = root;
  }

  public ObjectDefinition getRoot() {
    return root;
  }

  public List<JoinedObjectDefinition> getJoinedObjects() {
    return joinedObjects;
  }
}
