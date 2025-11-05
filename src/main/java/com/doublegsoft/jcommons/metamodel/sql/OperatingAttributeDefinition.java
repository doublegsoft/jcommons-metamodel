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
import java.util.Objects;

/**
 * The {@link FilteringAttributeDefinition} type encapsulates the attribute
 * applied to operate or display results.
 * 
 * @author <a href="mailto:guo.guo.gan@gmail.com">Christian Gann</a>
 * 
 * @since 1.0
 */
public class OperatingAttributeDefinition {
    
    private final AttributeDefinition attribute;
    
    private String constantValue;
    
    private String alias;
    
    private String objectAlias;
    
    private final List<String> operatingConstants = new ArrayList<>();
    
    /**
     * e.g. max(attribute), min(attribute), time(attribute)
     * <p>
     * The user could know how to process these functions.
     */
    private String funcInvocation;
    
    public OperatingAttributeDefinition(AttributeDefinition attr) {
        this.attribute = attr;
    }

    public AttributeDefinition getAttribute() {
        return attribute;
    }

    public List<String> getOperatingConstants() {
        return operatingConstants;
    }

    public String getOperatingConstant() {
        if (operatingConstants.isEmpty()) {
            return null;
        }
        return operatingConstants.get(0);
    }

    public String getFuncInvocation() {
        return funcInvocation;
    }

    public void setFuncInvocation(String funcInvocation) {
        this.funcInvocation = funcInvocation;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getObjectAlias() {
        return objectAlias;
    }

    public void setObjectAlias(String objectAlias) {
        this.objectAlias = objectAlias;
    }

    public String getConstantValue() {
        return constantValue;
    }

    public void setConstantValue(String constantValue) {
        this.constantValue = constantValue;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.attribute);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OperatingAttributeDefinition other = (OperatingAttributeDefinition) obj;
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }
    
}
