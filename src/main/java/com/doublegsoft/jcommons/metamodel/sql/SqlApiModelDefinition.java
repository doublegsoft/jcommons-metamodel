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

import com.doublegsoft.jcommons.metamodel.ApiModelDefinition;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@link SqlApiModelDefinition} type encapsulates the required data to
 * describe the meta-info of sql api.
 * 
 * @author <a href="mailto:guo.guo.gan@gmail.com">Christian Gann</a>
 * 
 * @since 3.0
 */
public class SqlApiModelDefinition extends ApiModelDefinition {
    
    private final List<OperatingAttributeDefinition> operatingAttributes = new ArrayList<>();
    
    private final List<FilteringAttributeDefinition> filteringAttributes = new ArrayList<>();
    
    private final List<SortingAttributeDefinition> sortingAttributes = new ArrayList<>();
    
    private final List<SqlApiModelDefinition> unionModels = new ArrayList<>();
    
    public void addOperatingAttribute(OperatingAttributeDefinition operatingAttribute) {
        operatingAttributes.add(operatingAttribute);
    }
    
    public List<OperatingAttributeDefinition> getOperatingAttributes() {
        return operatingAttributes;
    }
    
    public void addFilteringAttribute(FilteringAttributeDefinition filteringAttribute) {
        filteringAttributes.add(filteringAttribute);
    }
    
    public List<FilteringAttributeDefinition> getFilteringAttributes() {
        return filteringAttributes;
    }
    
    public void addSortingAttribute(SortingAttributeDefinition sortingAttribute) {
        sortingAttributes.add(sortingAttribute);
    }
    
    public List<SortingAttributeDefinition> getSortingAttributes() {
        return sortingAttributes;
    }
    
    public void addUnionModel(SqlApiModelDefinition other) {
        other.setAction(action);
        unionModels.add(other);
    }

    public List<SqlApiModelDefinition> getUnionModels() {
        return unionModels;
    }

}
