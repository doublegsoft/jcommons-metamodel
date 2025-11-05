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
import java.util.ArrayList;
import java.util.List;

/**
 * The {@link FilteringAttributeDefinition} type encapsulates the attribute
 * applied to filter results.
 * 
 * @author <a href="mailto:guo.guo.gan@gmail.com">Christian Gann</a>
 * 
 * @since 1.0
 */
public class FilteringAttributeDefinition {
    
    private final AttributeDefinition attribute;
    
    private String filteringOperator;
    
    private AttributeDefinition filteringRelativeAttribute;
    
    private final List<String> filteringConstants = new ArrayList<>();
    
    private final List<OperatingAttributeDefinition> innerOperatingAttributes = new ArrayList<>();
    
    private final List<FilteringAttributeDefinition> innerFilteringAttributes = new ArrayList<>();
    
    private String alias;
    
    public FilteringAttributeDefinition(AttributeDefinition attr) {
        this.attribute = attr;
    }

    public String getFilteringOperator() {
        return filteringOperator;
    }

    public void setFilteringOperator(String filteringOperator) {
        this.filteringOperator = filteringOperator;
    }

    public List<String> getFilteringConstants() {
        return filteringConstants;
    }
    
    public String getFilteringConstant() {
        if (filteringConstants.isEmpty()) {
            return null;
        }
        return filteringConstants.get(0);
    }
    
    public AttributeDefinition getAttribute() {
        return attribute;
    }

    public AttributeDefinition getFilteringRelativeAttribute() {
        return filteringRelativeAttribute;
    }

    public void setFilteringRelativeAttribute(AttributeDefinition filteringRelativeAttribute) {
        this.filteringRelativeAttribute = filteringRelativeAttribute;
    }

    public List<OperatingAttributeDefinition> getInnerOperatingAttributes() {
        return innerOperatingAttributes;
    }

    public List<FilteringAttributeDefinition> getInnerFilteringAttributes() {
        return innerFilteringAttributes;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

}
