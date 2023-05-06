package com.bookstore.springboot.library.responsemodels;

import com.bookstore.springboot.library.entity.Book;

public class ShelfCurrentLoansResponse {

    public ShelfCurrentLoansResponse(Book book, int daysLeft) {
        this.book = book;
        this.daysLeft = daysLeft;
    }

    private Book book;

    private int daysLeft;
}
