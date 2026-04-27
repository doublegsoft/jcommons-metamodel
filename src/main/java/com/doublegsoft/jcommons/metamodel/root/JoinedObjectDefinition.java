package com.doublegsoft.jcommons.metamodel.root;

import com.doublegsoft.jcommons.metabean.AttributeDefinition;
import com.doublegsoft.jcommons.metabean.ObjectDefinition;
import com.doublegsoft.jcommons.metamodel.dataset.JoinConditionDefinition;
import com.doublegsoft.jcommons.metamodel.dataset.QualifiedAttributeDefinition;

import java.util.ArrayList;
import java.util.List;

public class JoinedObjectDefinition {

  private JoinConditionDefinition joinCondition;

  private final ObjectDefinition joinedObject;

  private final List<QualifiedAttributeDefinition> qualifiedAttributes = new ArrayList<>();

  private final List<JoinedObjectDefinition> children = new ArrayList<>();

  private boolean collection;

  private boolean implicit;

  public JoinedObjectDefinition(ObjectDefinition joinedObject) {
    this.joinedObject = joinedObject;
  }

  public JoinConditionDefinition getJoinCondition() {
    return joinCondition;
  }

  public void setJoinCondition(JoinConditionDefinition joinCondition) {
    this.joinCondition = joinCondition;
  }

  public ObjectDefinition getJoinedObject() {
    return joinedObject;
  }

  public boolean isCollection() {
    return collection;
  }

  public void setCollection(boolean collection) {
    this.collection = collection;
  }

  public boolean isImplicit() {
    return implicit;
  }

  public void setImplicit(boolean implicit) {
    this.implicit = implicit;
  }

  public List<JoinedObjectDefinition> getChildren() {
    return children;
  }

  public List<QualifiedAttributeDefinition> getQualifiedAttributes() {
    return qualifiedAttributes;
  }
}
