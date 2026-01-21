package com.doublegsoft.jcommons.metamodel;

import com.doublegsoft.jcommons.metabean.AttributeDefinition;
import com.doublegsoft.jcommons.metabean.ObjectDefinition;

public class ValuedAttributeDefinition extends AttributeDefinition {

  protected ValueDefinition value;

  public ValuedAttributeDefinition(String name, ObjectDefinition parent) {
    super(name, parent);
  }

  public ValueDefinition getValue() {
    return value;
  }

  public void setValue(ValueDefinition value) {
    this.value = value;
  }
}
