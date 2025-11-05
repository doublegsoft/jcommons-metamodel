/*
 * DOUBLEGSOFT.COM CONFIDENTIAL
 *
 * [2025] - [?] doublegsoft.com
 *
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of doublegsoft.com and its suppliers, if any.
 * The intellectual and technical concepts contained herein
 * are proprietary to doublegsoft.com and its suppliers  and
 * may be covered by China and Foreign Patents, patents in
 * process, and are protected by trade secret or copyright law.
 *
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from doublegsoft.com.
 */
package com.doublegsoft.jcommons.metamodel;

public class LoopDefinition extends StatementDefinition {

  private String itemVar;

  private String arrayVar;

  public String getItemVar() {
    return itemVar;
  }

  public void setItemVar(String itemVar) {
    this.itemVar = itemVar;
  }

  public String getArrayVar() {
    return arrayVar;
  }

  public void setArrayVar(String arrayVar) {
    this.arrayVar = arrayVar;
  }

}
