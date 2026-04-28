package com.doublegsoft.jcommons.metamodel.root;

import com.doublegsoft.jcommons.metabean.ObjectDefinition;
import com.doublegsoft.jcommons.metamodel.dataset.QualifiedAttributeDefinition;

import java.util.ArrayList;
import java.util.List;

public class AggregateRootDefinition {

  private final ObjectDefinition root;

  private final List<QualifiedAttributeDefinition> qualifiedAttributes = new ArrayList<>();

  private final List<JoinedObjectDefinition> children = new ArrayList<>();

  public AggregateRootDefinition(ObjectDefinition root) {
    this.root = root;
  }

  public ObjectDefinition getRoot() {
    return root;
  }

  public List<JoinedObjectDefinition> getChildren() {
    return children;
  }

  public List<QualifiedAttributeDefinition> getQualifiedAttributes() {
    return qualifiedAttributes;
  }

  public List<JoinedObjectDefinition> getJoinedObjects() {
    List<JoinedObjectDefinition> retVal = new ArrayList<>();
    for (JoinedObjectDefinition child : children) {
      retVal.addAll(getJoinedObjects(child));
    }
    return retVal;
  }

  private List<JoinedObjectDefinition> getJoinedObjects(JoinedObjectDefinition parent) {
    List<JoinedObjectDefinition> retVal = new ArrayList<>();
    retVal.add(parent);
    for (JoinedObjectDefinition child : parent.getChildren()) {
      retVal.addAll(getJoinedObjects(child));
    }
    return retVal;
  }

}
