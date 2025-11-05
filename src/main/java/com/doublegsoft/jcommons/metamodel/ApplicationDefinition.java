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

import com.doublegsoft.jcommons.metabean.ModelDefinition;

import java.util.HashSet;
import java.util.Set;

/**
 * It is a definition for whole things needed by application.
 * 
 * @author <a href="mailto:guo.guo.gan@gmail.com">Christian Gann</a>
 * 
 * @since 2.0
 */
public class ApplicationDefinition {
    
    private String name;
    
    private ModelDefinition model;
    
    private final Set<ApplicationApiDefinition> apis = new HashSet<>();
    
    private final Set<UsecaseDefinition> usecases = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelDefinition getModel() {
        return model;
    }

    public void setModel(ModelDefinition model) {
        this.model = model;
    }
    
    public void addAPI(ApplicationApiDefinition api) {
        apis.add(api);
    }
    
    public ApplicationApiDefinition[] getAPI() {
        return apis.toArray(new ApplicationApiDefinition[apis.size()]);
    }
    
    public void addUsecase(UsecaseDefinition usecase) {
        usecases.add(usecase);
    }
    
    public UsecaseDefinition[] getUsecases() {
        return usecases.toArray(new UsecaseDefinition[usecases.size()]);
    }
    
    public UsecaseDefinition findUsecase(String module, String name) {
        for (UsecaseDefinition usecase : usecases) {
            if (usecase.getModule().equals(module) && usecase.getName().equals(name)) {
                return usecase;
            }
        }
        return null;
    }
    
    public String[] getModules() {
        Set<String> retVal = new HashSet<>();
        usecases.stream().forEach((u) -> {
            retVal.add(u.getModule());
        });
        apis.stream().forEach(apiApp -> {
            apiApp.getAPIs().stream().forEach(api -> {
                retVal.add(api.getModule());
            });
        });
        return retVal.toArray(new String[retVal.size()]);
    }
    
    public String[] getModules(String modelType) {
        Set<String> retVal = new HashSet<>();
        usecases.stream().forEach((u) -> {
            if (modelType.equalsIgnoreCase("usecase") || modelType.equalsIgnoreCase("page")) {
                retVal.add(u.getModule());
            }
        });
        apis.stream().forEach(apiApp -> {
            apiApp.getAPIs().stream().forEach(api -> {
                if (modelType.equalsIgnoreCase(api.getType())) {
                    retVal.add(api.getModule());
                }
            });
        });
        return retVal.toArray(new String[retVal.size()]);
    }
    
    public ApiDefinition findApi(String module, String apiType, String apiName) {
        for (ApplicationApiDefinition apiApp : apis) {
            for (ApiDefinition api : apiApp.getAPIs()) {
                 if (module.equalsIgnoreCase(api.getModule()) &&
                        apiType.equalsIgnoreCase(api.getType()) &&
                        apiName.equalsIgnoreCase(api.getName())) {
                    return api;
                }
            }
        }
        return null;
    }
    
//    public PageDefinition[] getPages(String module) {
//        Set<PageDefinition> retVal = new HashSet<>();
//        usecases.stream().forEach((u) -> {
//            if (module.equalsIgnoreCase(u.getModule())) {
//                retVal.add(u.getPage());
//            }
//        });
//        return retVal.toArray(new PageDefinition[retVal.size()]);
//    }
//
//    public PageDefinition[] getPages() {
//        Set<PageDefinition> retVal = new HashSet<>();
//        usecases.stream().forEach((u) -> {
//            retVal.add(u.getPage());
//        });
//        return retVal.toArray(new PageDefinition[retVal.size()]);
//    }
//
//    public PageDefinition findPage(String pageId) {
//        PageDefinition[] pages = getPages();
//        for (PageDefinition page : pages) {
//            if (page.getId().equalsIgnoreCase(pageId)) {
//                return page;
//            }
//        }
//        return null;
//    }


}
