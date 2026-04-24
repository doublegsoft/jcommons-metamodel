package com.doublegsoft.jcommons.metamodel.root;

import com.doublegsoft.jcommons.metabean.ObjectDefinition;
import com.doublegsoft.jcommons.metamodel.dataset.QualifiedAttributeDefinition;

import java.util.ArrayList;
import java.util.List;

public class AggregateRootDefinition {

  private final ObjectDefinition root;

  private final List<QualifiedAttributeDefinition> qualifiedAttributes = new ArrayList<>();

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

  public List<QualifiedAttributeDefinition> getQualifiedAttributes() {
    return qualifiedAttributes;
  }
}
