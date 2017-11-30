package com.onlineagent.blog.service.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @author lijie
 * @date 2017/10/24 21:36
 * @description
 */
@Entity
public class Blog {
    private String blogGuid;
    private String title;
    private String content;
    private String html;
    private Timestamp createDate;
    private String author;
    private Integer viewCount;

    @Id
    @Column(name = "blogGuid", nullable = false, length = 50)
    public String getBlogGuid() {
        return blogGuid;
    }

    public void setBlogGuid(String blogGuid) {
        this.blogGuid = blogGuid;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "html", nullable = true, length = -1)
    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    @Basic
    @Column(name = "createDate", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "author", nullable = true, length = 50)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "viewCount", nullable = true)
    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Blog blog = (Blog) o;

        if (blogGuid != null ? !blogGuid.equals(blog.blogGuid) : blog.blogGuid != null) return false;
        if (title != null ? !title.equals(blog.title) : blog.title != null) return false;
        if (content != null ? !content.equals(blog.content) : blog.content != null) return false;
        if (html != null ? !html.equals(blog.html) : blog.html != null) return false;
        if (createDate != null ? !createDate.equals(blog.createDate) : blog.createDate != null) return false;
        if (author != null ? !author.equals(blog.author) : blog.author != null) return false;
        if (viewCount != null ? !viewCount.equals(blog.viewCount) : blog.viewCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = blogGuid != null ? blogGuid.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (html != null ? html.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (viewCount != null ? viewCount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogGuid='" + blogGuid + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", html='" + html + '\'' +
                ", createDate=" + createDate +
                ", author='" + author + '\'' +
                ", viewCount=" + viewCount +
                '}';
    }*/
}
