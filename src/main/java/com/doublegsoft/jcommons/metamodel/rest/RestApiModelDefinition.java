/*
 * DOUBLEGSOFT.COM CONFIDENTIAL
 *
 * [2016] - [?] doublegsoft.com
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
package com.doublegsoft.jcommons.metamodel.rest;

import com.doublegsoft.jcommons.metamodel.ReturnedObjectDefinition;
import com.doublegsoft.jcommons.metamodel.ApiModelDefinition;

/**
 * The {@link RestApiModelDefinition} type encapsulates the required data to
 * describe the meta-info of rest api.
 *
 * @author <a href="mailto:guo.guo.gan@gmail.com">Christian Gann</a>
 *
 * @since 3.0
 */
public class RestApiModelDefinition extends ApiModelDefinition {

  private ReturnedObjectDefinition root;

  private String provision;

  private boolean array;

  private String method;

  public String getUri() {
    return id;
  }

  public ReturnedObjectDefinition getRoot() {
    return root;
  }

  public String getProvision() {
    return provision;
  }

  public void setProvision(String provision) {
    this.provision = provision;
  }

  public boolean isArray() {
    return array;
  }

  public void setArray(boolean array) {
    this.array = array;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

}
