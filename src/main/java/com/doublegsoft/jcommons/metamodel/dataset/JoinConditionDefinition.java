package com.doublegsoft.jcommons.metamodel.dataset;

import com.doublegsoft.jcommons.metabean.ObjectDefinition;

import java.util.ArrayList;
import java.util.List;

public class JoinConditionDefinition {

  private final ObjectDefinition leftObject;

  private final ObjectDefinition rightObject;

  private final List<JoinPredicateDefinition> predicates = new ArrayList<>();

  public JoinConditionDefinition(ObjectDefinition leftObject, ObjectDefinition rightObject) {
    this.leftObject = leftObject;
    this.rightObject = rightObject;
  }

  public ObjectDefinition getLeftObject() {
    return leftObject;
  }

  public ObjectDefinition getRightObject() {
    return rightObject;
  }

  public List<JoinPredicateDefinition> getPredicates() {
    return predicates;
  }
}
