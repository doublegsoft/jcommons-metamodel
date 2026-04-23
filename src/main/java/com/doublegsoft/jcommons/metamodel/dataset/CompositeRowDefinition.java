package com.doublegsoft.jcommons.metamodel.dataset;

import com.doublegsoft.jcommons.metabean.AttributeDefinition;
import com.doublegsoft.jcommons.metabean.ObjectDefinition;

import java.util.*;

public class CompositeRowDefinition {

  private final List<QualifiedAttributeDefinition> qualifiedAttributes = new ArrayList<>();

  private final JoinTreeDefinition joinTree = new JoinTreeDefinition();

//  private final List<QualifiedAttributeDefinition[]> pairedQualifiedAttributes = new ArrayList<>();

  public List<QualifiedObjectDefinition> getQualifiedObjects() {
    List<QualifiedObjectDefinition> retVal = new ArrayList<>();
    Set<String> existings = new HashSet<>();
    for (QualifiedAttributeDefinition attr : qualifiedAttributes) {
      if (!existings.contains(attr.getAlias())) {
        retVal.add(new QualifiedObjectDefinition(attr.getAlias(), attr.getAttribute().getParent()));
        existings.add(attr.getAlias());
      }
    }
    return retVal;
  }

  public List<QualifiedAttributeDefinition> getQualifiedAttributes() {
    return Collections.unmodifiableList(qualifiedAttributes);
  }

  public void addJoinPredicate(JoinPredicateDefinition joinPredicate) {
    getJoinTree().addJoinPredicate(joinPredicate);
  }

//  public List<QualifiedAttributeDefinition[]> getPairedQualifiedAttributes() {
//    return Collections.unmodifiableList(pairedQualifiedAttributes);
//  }

//  public void addPairedQualifiedAttributes(QualifiedAttributeDefinition first, QualifiedAttributeDefinition second) {
//    pairedQualifiedAttributes.add(new QualifiedAttributeDefinition[]{first, second});
//  }

  public void addJoinPredicate(String leftObjectAlias, AttributeDefinition leftAttribute,
                               String rightObjectAlias, AttributeDefinition rightAttribute) {
    JoinPredicateDefinition predicate = new JoinPredicateDefinition();
    predicate.setLeftObjectAlias(leftObjectAlias);
    predicate.setLeftObject(leftAttribute.getParent());
    predicate.setLeftAttribute(leftAttribute);
    predicate.setRightObjectAlias(rightObjectAlias);
    predicate.setRightObject(rightAttribute.getParent());
    predicate.setRightAttribute(rightAttribute);
    getJoinTree().addJoinPredicate(predicate);
  }

  public void addQualifiedAttribute(QualifiedAttributeDefinition qualAttr) {
    qualifiedAttributes.add(qualAttr);
  }

  public JoinTreeDefinition getJoinTree() {
    return joinTree;
  }
}
