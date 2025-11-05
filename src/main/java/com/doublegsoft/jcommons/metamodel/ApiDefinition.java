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
package com.doublegsoft.jcommons.metamodel;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/**
 * The {@link ApiDefinition} type encapsulates the data of api.
 * 
 * @author <a href="mailto:guo.guo.gan@gmail.com">Christian Gann</a>
 * 
 * @since 1.0
 * 
 * @version 2.1 - add options field
 *          3.0 - one api just has one model
 */
public class ApiDefinition {
    
    private String module;
    
    private String name;
    
    /**
     * the api type, sql or rest etc.
     */
    private String type;
    
    private final Map<String, Object> options = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    
    private ApiModelDefinition model;
    
    private String description;
    
    private final Set<String> types = new HashSet<>();

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiModelDefinition getModel() {
        return model;
    }

    public void setModel(ApiModelDefinition model) {
        this.model = model;
    }
    
    public void addType(String type) {
        types.add(type);
    }

    public Set<String> getTypes() {
        return Collections.unmodifiableSet(types);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getAction() {
        return model.action;
    }
    
    public void setOption(String key, Object value) {
        options.put(key, value);
    }
    
    public <T> T getOption(String key) {
        return (T) options.get(key);
    }
    
    public Map<String, Object> getOptions() {
        return Collections.unmodifiableMap(options);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.module);
        hash = 47 * hash + Objects.hashCode(this.name);
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
        final ApiDefinition other = (ApiDefinition) obj;
        if (!Objects.equals(this.module, other.module)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}
