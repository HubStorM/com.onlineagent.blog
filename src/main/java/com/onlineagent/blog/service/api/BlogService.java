package com.onlineagent.blog.service.api;

import com.onlineagent.blog.service.domain.Blog;

/**
 * @author lijie
 * @date 2017/10/22 15:27
 * @description
 */
public interface BlogService {

    Blog get(String rowGuid);

    void insert(Blog blog);

    void update(Blog blog);

    void delete(String rowGuid);


}
