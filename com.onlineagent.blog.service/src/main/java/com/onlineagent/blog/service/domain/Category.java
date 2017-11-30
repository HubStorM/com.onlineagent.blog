package com.onlineagent.blog.service.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author lijie
 * @date 2017/10/24 21:36
 * @description
 */
@Entity
public class Category {
    private String categoryGuid;
    private String name;
    private String parentGuid;

    @Id
    @Column(name = "categoryGuid", nullable = false, length = 50)
    public String getCategoryGuid() {
        return categoryGuid;
    }

    public void setCategoryGuid(String categoryGuid) {
        this.categoryGuid = categoryGuid;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "parentGuid", nullable = true, length = 50)
    public String getParentGuid() {
        return parentGuid;
    }

    public void setParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (categoryGuid != null ? !categoryGuid.equals(category.categoryGuid) : category.categoryGuid != null)
            return false;
        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        if (parentGuid != null ? !parentGuid.equals(category.parentGuid) : category.parentGuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryGuid != null ? categoryGuid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (parentGuid != null ? parentGuid.hashCode() : 0);
        return result;
    }
}
