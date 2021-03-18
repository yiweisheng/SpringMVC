package com.yi.service;

import com.yi.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //按书名查询书
    List<Books> queryBookByName(String bookName);

    //查询全部的书
    List<Books> queryAllBook();
}
