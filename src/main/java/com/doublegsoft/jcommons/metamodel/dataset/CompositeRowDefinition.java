package com.doublegsoft.jcommons.metamodel.dataset;

import com.doublegsoft.jcommons.metabean.AttributeDefinition;

import java.util.*;

public class CompositeRowDefinition {

  private final List<QualifiedAttributeDefinition> qualifiedAttributes = new ArrayList<>();

  private final List<QualifiedAttributeDefinition[]> pairedQualifiedAttributes = new ArrayList<>();

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

  public List<QualifiedAttributeDefinition[]> getPairedQualifiedAttributes() {
    return Collections.unmodifiableList(pairedQualifiedAttributes);
  }

  void addPairedQualifiedAttributes(QualifiedAttributeDefinition first, QualifiedAttributeDefinition second) {
    pairedQualifiedAttributes.add(new QualifiedAttributeDefinition[]{first, second});
  }

  void addQualifiedAttribute(QualifiedAttributeDefinition qualAttr) {
    qualifiedAttributes.add(qualAttr);
  }

}
