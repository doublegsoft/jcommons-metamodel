package com.doublegsoft.jcommons.metamodel.dataset;

import com.doublegsoft.jcommons.metabean.ObjectDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JoinConditionDefinition {

  private final String leftObjectAlias;

  private final String rightObjectAlias;

  private final ObjectDefinition leftObject;

  private final ObjectDefinition rightObject;

  private final List<JoinPredicateDefinition> predicates = new ArrayList<>();

  public JoinConditionDefinition(JoinPredicateDefinition predicate) {
    this.leftObjectAlias = predicate.getLeftObjectAlias();
    this.rightObjectAlias = predicate.getRightObjectAlias();
    this.leftObject = predicate.getLeftObject();
    this.rightObject = predicate.getRightObject();
    predicates.add(predicate);
  }

  public ObjectDefinition getLeftObject() {
    return leftObject;
  }

  public ObjectDefinition getRightObject() {
    return rightObject;
  }

  public String getLeftObjectAlias() {
    return leftObjectAlias;
  }

  public String getRightObjectAlias() {
    return rightObjectAlias;
  }

  public List<JoinPredicateDefinition> getJoinPredicates() {
    return predicates;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    JoinConditionDefinition that = (JoinConditionDefinition) o;
    return Objects.equals(leftObjectAlias, that.leftObjectAlias) && Objects.equals(rightObjectAlias, that.rightObjectAlias) && Objects.equals(leftObject, that.leftObject) && Objects.equals(rightObject, that.rightObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftObjectAlias, rightObjectAlias, leftObject, rightObject);
  }
}
