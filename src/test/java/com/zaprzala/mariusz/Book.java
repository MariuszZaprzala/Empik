package com.zaprzala.mariusz;

public abstract class Book extends Product {
    private final String author;
    private final int pageCaunter;

    public Book(String author, int pageCaunter) {
        this.author = author;
        this.pageCaunter = pageCaunter;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCaunter() {
        return pageCaunter;
    }
}
