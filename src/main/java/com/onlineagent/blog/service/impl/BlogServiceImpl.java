package com.onlineagent.blog.service.impl;

import com.framex.persistence.dao.Dao;
import com.framex.persistence.dao.DaoFactory;
import com.framex.persistence.dao.DaoTypeEnum;
import com.onlineagent.blog.service.api.BlogService;
import com.onlineagent.blog.service.domain.Blog;

/**
 * @author lijie
 * @date 2017/10/22 15:27
 * @description
 */
public class BlogServiceImpl implements BlogService{
    private Dao dao;

    public BlogServiceImpl() {
        this.dao = DaoFactory.getDao(DaoTypeEnum.PROTOTYPE);
    }

    public BlogServiceImpl(DaoTypeEnum daoTypeEnum) {
        this.dao = DaoFactory.getDao(daoTypeEnum);
    }

    public BlogServiceImpl(Dao dao) {
        this.dao = dao;
    }

    public Blog get(String rowGuid) {
        return dao.findObject("select * from blog where blogGuid = ?", Blog.class, rowGuid);
    }

    public void insert(Blog blog) {
        //dao.update()
    }

    public void update(Blog blog) {

    }

    public void delete(String rowGuid) {

    }
}
