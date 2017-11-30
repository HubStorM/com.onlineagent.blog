package com.onlineagent.blog.service.api;

import com.onlineagent.blog.service.domain.Blog;

import java.util.List;

/**
 * @author lijie
 * @date 2017/10/22 15:27
 * @description
 */

public interface BlogService {

    Blog find(String rowGuid);

    List<Blog> findList();

    List<Blog> findList(int currentPage, int pageSize);

    void insert(Blog blog);

    void update(Blog blog);

    void delete(String rowGuid);


}
