package com.onlineagent.blog.service.domain;

import javax.persistence.*;

/**
 * @author lijie
 * @date 2017/10/24 21:36
 * @description
 */
@Entity
@Table(name = "r_blog_category", schema = "blog", catalog = "")
public class RBlogCategory {
    private String rowGuid;
    private String blogGuid;
    private String categoryGuid;

    @Id
    @Column(name = "rowGuid", nullable = false, length = 50)
    public String getRowGuid() {
        return rowGuid;
    }

    public void setRowGuid(String rowGuid) {
        this.rowGuid = rowGuid;
    }

    @Basic
    @Column(name = "blogGuid", nullable = true, length = 50)
    public String getBlogGuid() {
        return blogGuid;
    }

    public void setBlogGuid(String blogGuid) {
        this.blogGuid = blogGuid;
    }

    @Basic
    @Column(name = "categoryGuid", nullable = true, length = 50)
    public String getCategoryGuid() {
        return categoryGuid;
    }

    public void setCategoryGuid(String categoryGuid) {
        this.categoryGuid = categoryGuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RBlogCategory that = (RBlogCategory) o;

        if (rowGuid != null ? !rowGuid.equals(that.rowGuid) : that.rowGuid != null) return false;
        if (blogGuid != null ? !blogGuid.equals(that.blogGuid) : that.blogGuid != null) return false;
        if (categoryGuid != null ? !categoryGuid.equals(that.categoryGuid) : that.categoryGuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rowGuid != null ? rowGuid.hashCode() : 0;
        result = 31 * result + (blogGuid != null ? blogGuid.hashCode() : 0);
        result = 31 * result + (categoryGuid != null ? categoryGuid.hashCode() : 0);
        return result;
    }
}
