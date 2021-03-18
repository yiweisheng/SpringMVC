package com.yi.service;

import com.yi.dao.BookMapper;
import com.yi.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class BookServiceImpl implements BookService{
    //service 调dao 层：组合Dao
    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryBookByName(String bookName) {
        return  bookMapper.queryBookByName(bookName);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
