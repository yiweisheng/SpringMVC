package com.yi.dao;

import com.yi.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

public interface BookMapper {

    //增加一本书
    int addBook(@Param("books") Books books);

    //删除一本书
    int deleteBookById(@Param("bookID") int id);

    //更新一本书
    int updateBook(@Param("books") Books books);

    //按ID查询一本书
    Books queryBookById(@Param("bookID")int id);

    //按书名查询书
    List<Books> queryBookByName(@Param("bookName")String bookName);

    //查询全部的书
    List<Books> queryAllBook();


}
