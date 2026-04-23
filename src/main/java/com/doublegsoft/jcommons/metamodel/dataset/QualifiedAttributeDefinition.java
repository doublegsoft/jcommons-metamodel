package com.doublegsoft.jcommons.metamodel.dataset;

import com.doublegsoft.jcommons.metabean.AttributeDefinition;
import com.doublegsoft.jcommons.metabean.ModelDefinition;
import com.doublegsoft.jcommons.metabean.ObjectDefinition;
import com.doublegsoft.jcommons.utils.Strings;
import org.w3c.dom.Attr;

public class QualifiedAttributeDefinition {

  private final String alias;

  /**
   * 真正的数据属性。
   */
  private final AttributeDefinition attribute;

  public QualifiedAttributeDefinition(String alias, AttributeDefinition attribute) {
    if (Strings.isEmpty(alias)) {
      String pn = attribute.getParent().getPersistenceName();
      String[] strs = pn.split("_");
      this.alias = strs[strs.length - 1];
    } else {
      this.alias = alias;
    }
    this.attribute = attribute;
  }

  public String getAlias() {
    return alias;
  }

  public AttributeDefinition getAttribute() {
    return attribute;
  }

  public String getSnakeCaseQualifiedName(ModelDefinition dataModel) {
    String attrname = attribute.getName();
    if (attrname.startsWith(alias)) {
      if (attribute.getType().isCustom()) {
        return attrname + "_id";
      } else {
        return attrname;
      }
    }
    String aliasName = alias;
    String pn = attribute.getParent().getPersistenceName();
    String[] strs = pn.split("_");
    String lastStr = strs[strs.length - 1];
    if (aliasName.equals(lastStr)) {
      aliasName = "";
    }
    if (attribute.getType().isCustom()) {
      ObjectDefinition refObj = dataModel.findObjectByName(attribute.getType().getName());
      if (aliasName.isEmpty()) {
        return refObj.getName() + "_id";
      } else {
        return attrname + "_id";
      }
    } else {
      if (aliasName.isEmpty()) {
        if ("id".equals(attrname) ||
            "name".equals(attrname) ||
            "type".equals(attrname) ||
            "code".equals(attrname) ||
            "group".equals(attrname)) {
          return attribute.getParent().getName() + "_" + attrname;
        } else {
          return attrname;
        }
      } else {
        return aliasName + "_" + attrname;
      }
    }
  }
}
