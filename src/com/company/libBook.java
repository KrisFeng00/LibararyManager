package com.company;

public class libBook {
    private int bookId;
    private String bookName;
    public libBook (int id, String name) {
        this.bookId = id;
        this.bookName = name;
    }
    public int getBookId () {
        return this.bookId;
    }
    public String getBook () {
        return "编号:" + String.valueOf(this.bookId) + ", 书名:《" + this.bookName + "》";
    }
}
