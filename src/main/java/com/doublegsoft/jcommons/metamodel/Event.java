/*
 * DOUBLEGSOFT.COM CONFIDENTIAL
 *
 * 2019 doublegsoft.com
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

/**
 * {@link Event} means that event could be emitted by widgets, and this 
 * type lists all possible events for software system widgets.
 * 
 * @author <a href="mailto:guo.guo.gan@gmail.com">Christian Gann</a>
 * 
 * @since 5.0
 * 
 * @version 5.0 - initial creation on Oct 18, 2019
 */
public enum Event {
  
  /**
   * No any operations.
   */
  NOOP("event.noop"),
  
  /**
   * The event triggered by clicking something.
   */
  CLICKED("event.clicked"),
  
  /**
   * The event triggered by selecting something.
   */
  SELECTED("event.selected"),
  
  /**
   * The event triggered by adding something.
   */
  ADDED("event.added"),
  
  /**
   * The event triggered after creating something.
   */
  CREATED("event.created"),
  
  /**
   * The event triggered after updating something.
   */
  UPDATED("event.updated"),
  
  /**
   * The event triggered after reseting something.
   */
  RESET("event.reset"),
  
  /**
   * The event triggered after loading something.
   */
  LOADED("event.loaded"),
  
  /**
   * The event triggered after opening something.
   */
  OPENED("event.opened"),
  
  /**
   * The event triggered after closing something.
   */
  CLOSED("event.closed"),
  
  /**
   * The event triggered after hiding something.
   */
  HIDED("event.hided"),
  
  /**
   * The event triggered after moving something.
   */
  MOVED("event.moved"),
  
  /**
   * The event triggered after moving something.
   */
  DELETED("event.deleted"),
  
  /**
   * The event triggered after maximizing something.
   */
  MAXIMIZED("event.maximized"),
  
  /**
   * The event triggered after minimizing something.
   */
  MINIMIZED("event.minimized");
  
  private final String key;
  
  public String getKey() {
    return key;
  }

  Event(String key) {
    this.key = key;
  }
}
