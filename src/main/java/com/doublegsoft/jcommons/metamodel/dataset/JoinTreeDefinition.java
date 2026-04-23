package com.doublegsoft.jcommons.metamodel.dataset;

import java.util.ArrayList;
import java.util.List;

public class JoinTreeDefinition {

  private final List<JoinConditionDefinition> conditions = new ArrayList<>();

  public void addJoinCondition(JoinConditionDefinition joinCondition) {
    conditions.add(joinCondition);
  }

  public void addJoinPredicate(JoinPredicateDefinition joinPredicate) {
    for (JoinConditionDefinition condition : conditions) {
      for (JoinPredicateDefinition predicate : condition.getJoinPredicates()) {
        if (predicate.equals(joinPredicate)) {
          return;
        }
      }
      JoinConditionDefinition cond = new JoinConditionDefinition(joinPredicate);
      if (!cond.equals(condition)) {
        conditions.add(cond);
        return;
      }
    }
    JoinConditionDefinition cond = new JoinConditionDefinition(joinPredicate);
    conditions.add(cond);
  }

  public List<JoinConditionDefinition> getJoinConditions() {
    return conditions;
  }

}
