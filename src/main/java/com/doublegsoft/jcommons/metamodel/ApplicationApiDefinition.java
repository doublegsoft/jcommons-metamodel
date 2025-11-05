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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * The {@link ApplicationApiDefinition} type encapsulates the data of application.
 * 
 * @author <a href="mailto:guo.guo.gan@gmail.com">Christian Gann</a>
 * 
 * @since 1.0
 */
public class ApplicationApiDefinition {
    
    private String name;
    
    private final Map<String, Object> options = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    
    private final List<ApiDefinition> apis = new ArrayList<>();
    
    private final Set<ApiDefinition> apiCache = new HashSet<>();
    
    public ApiDefinition findAPI(String module, String name, String action) {
        for (ApiDefinition api : apiCache) {
            if (module.equalsIgnoreCase(api.getModule()) && 
                    name.equalsIgnoreCase(api.getName()) && 
                    action.equalsIgnoreCase(api.getAction())) {
                return api;
            }
        }
        return null;
    }
    
    public ApiDefinition findAPI(String module, String name) {
        for (ApiDefinition api : apiCache) {
            if (module.equalsIgnoreCase(api.getModule()) && 
                    name.equalsIgnoreCase(api.getName())) {
                return api;
            }
        }
        return null;
    }
    
    public Map<String, List<ApiDefinition>> groupAPIsByModule(String type) {
        Map<String, List<ApiDefinition>> retVal = new HashMap<>();
        apis.forEach((api) -> {
            if (type != null && !type.equalsIgnoreCase(api.getType())) {
                return;
            }
            List<ApiDefinition> groupings = retVal.get(api.getModule());
            if (groupings == null) {
                groupings = new ArrayList<>();
                retVal.put(api.getModule(), groupings);
            }
            groupings.add(api);
        });
        return retVal;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addAPI(ApiDefinition api) {
        if (!apiCache.contains(api)) {
            apis.add(api);
            apiCache.add(api);
        }
    }

    public List<ApiDefinition> getAPIs() {
        return Collections.unmodifiableList(apis);
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
}
