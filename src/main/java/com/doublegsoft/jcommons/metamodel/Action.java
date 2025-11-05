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
 * {@link Action} means that action could be triggered by users, and this 
 * type lists all possible actions for software systems.
 * 
 * @author <a href="mailto:guo.guo.gan@gmail.com">Christian Gann</a>
 * 
 * @since 5.0
 * 
 * @version 5.0 - initial creation on Oct 18, 2019
 */
public enum Action {
  
  /**
   * {@link #CREATE} or {@link #UPDATE} an instance.
   */
  SAVE("action.save", Event.NOOP),
  
  /**
   * Creation.
   */
  CREATE("action.create", Event.CREATED),
  
  /**
   * Update.
   */
  UPDATE("action.update", Event.UPDATED),
  
  /**
   * Selection.
   */
  SELECT("action.select", Event.SELECTED),
  
  /**
   * Selection.
   */
  ADD("action.add", Event.ADDED),
  
  /**
   * Load.
   */
  LOAD("action.load", Event.LOADED),
  
  /**
   * Deletion.
   */
  DELETE("action.deletion", Event.DELETED),
  
  /**
   * Edit.
   */
  EDIT("action.edit", Event.NOOP),
  
  /**
   * View.
   */
  VIEW("action.view", Event.NOOP),
  
  /**
   * Query.
   */
  QUERY("action.query", Event.NOOP),
  
  /**
   * Search.
   */
  SEARCH("action.search", Event.NOOP),
  
  /**
   * Activation is to enable something.
   */
  ACTIVATE("action.activate", Event.UPDATED),
  
  /**
   * Deactivation is to disable something.
   */
  DEACTIVATE("action.deactivate", Event.UPDATED),
  
  /**
   * 
   */
  COMPLEX("action.complex", Event.NOOP);
  
  /**
   * the key for {@link Action} instance.
   */
  private final String key;
  
  /**
   * the {@link Event} instance is bounded to {@link Action} instance.
   */
  private final Event event;
  
  public String key() {
    return key;
  }
  
  public Event event() {
    return event;
  }
  
  /**
   * Default constructor.
   * 
   * @param key
   *        the action key
   */
  Action(String key, Event event) {
    this.key = key;
    this.event = event;
  }
  
}
