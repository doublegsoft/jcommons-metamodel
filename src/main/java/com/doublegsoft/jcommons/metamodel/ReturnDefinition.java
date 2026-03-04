package com.doublegsoft.jcommons.metamodel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.ibm.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class ReturnDefinition extends StatementDefinition {

  private final Set<String> variables = new HashSet<>();

  private void addVariable(String var) {
    variables.add(var);
  }

  public List<String> getVariables() {
    return new ArrayList<>(variables);
  }
}
