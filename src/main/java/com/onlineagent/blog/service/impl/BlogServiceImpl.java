package com.onlineagent.blog.service.impl;

import com.framex.persistence.dao.DaoTypeEnum;
import com.framex.persistence.dao.jdbc.JdbcDao;
import com.framex.persistence.dao.jdbc.JdbcDaoFactory;
import com.onlineagent.blog.service.api.BlogService;
import com.onlineagent.blog.service.domain.Blog;

import java.util.List;

/**
 * @author lijie
 * @date 2017/10/29 22:00
 * @description
 */
public class BlogServiceImpl implements BlogService {

    private static JdbcDao dao = JdbcDaoFactory.getDao(DaoTypeEnum.SINGLETON);

    @Override
    public Blog find(String rowGuid) {
        return dao.findObject(Blog.class, rowGuid);
    }

    @Override
    public List<Blog> findList() {
        return dao.findList(Blog.class);
    }

    @Override
    public List<Blog> findList(int currentPage, int pageSize) {
        return dao.findList(currentPage, pageSize, Blog.class);
    }

    @Override
    public void insert(Blog blog) {
        dao.insert(blog);
    }

    @Override
    public void update(Blog blog) {
        dao.update(blog);
    }

    @Override
    public void delete(String rowGuid) {
        dao.delete(Blog.class, rowGuid);
    }
}
