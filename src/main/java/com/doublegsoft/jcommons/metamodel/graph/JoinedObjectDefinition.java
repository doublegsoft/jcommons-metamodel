package com.doublegsoft.jcommons.metamodel.graph;

import com.doublegsoft.jcommons.metabean.ObjectDefinition;
import com.doublegsoft.jcommons.metamodel.dataset.JoinConditionDefinition;

import java.util.ArrayList;
import java.util.List;

public class JoinedObjectDefinition {

  private JoinConditionDefinition joinCondition;

  private ObjectDefinition joinedObject;

  private final List<JoinedObjectDefinition> children = new ArrayList<>();

  private boolean oneToOne;

  public JoinConditionDefinition getJoinCondition() {
    return joinCondition;
  }

  public void setJoinCondition(JoinConditionDefinition joinCondition) {
    this.joinCondition = joinCondition;
  }

  public ObjectDefinition getJoinedObject() {
    return joinedObject;
  }

  public void setJoinedObject(ObjectDefinition joinedObject) {
    this.joinedObject = joinedObject;
  }

  public boolean isOneToOne() {
    return oneToOne;
  }

  public void setOneToOne(boolean oneToOne) {
    this.oneToOne = oneToOne;
  }

  public List<JoinedObjectDefinition> getChildren() {
    return children;
  }
}
