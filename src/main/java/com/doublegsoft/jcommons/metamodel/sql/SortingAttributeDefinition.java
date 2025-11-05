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
package com.doublegsoft.jcommons.metamodel.sql;

import com.doublegsoft.jcommons.metabean.AttributeDefinition;

/**
 * The {@link FilteringAttributeDefinition} type encapsulates the attribute
 * applied to sort results.
 * 
 * @author <a href="mailto:guo.guo.gan@gmail.com">Christian Gann</a>
 * 
 * @since 1.0
 */
public class SortingAttributeDefinition {
    
    private final AttributeDefinition attribute;
    
    private String sortingSymbol;
    
    public SortingAttributeDefinition(AttributeDefinition attr) {
        this.attribute = attr;
    }

    public String getSortingSymbol() {
        return sortingSymbol;
    }

    public void setSortingSymbol(String sortingSymbol) {
        this.sortingSymbol = sortingSymbol;
    }

    public AttributeDefinition getAttribute() {
        return attribute;
    }
    
}
