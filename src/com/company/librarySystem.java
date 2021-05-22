package com.company;

import java.util.ArrayList;
import java.util.List;

public class librarySystem {
    private List<libBook> bookList = new ArrayList<libBook>();
    private int bookNewId = 1001;

    public boolean addBookToLib (String bookName) {
        if (bookName == null || bookName == "") {
            return false;
        } else {
            libBook lib = new libBook(this.bookNewId++, bookName);
            this.bookList.add(lib);
            return true;
        }
    }
    public List<libBook> getBookList(){
        return this.bookList;
    }
    public void showBookList () {
        for (int j = 0; j < this.bookList.size(); j++) {
            System.out.println(this.bookList.get(j).getBook());
        }
        System.out.println();
    }

    public boolean delBook (int bookId) {
        boolean flag = false;
        for (int i = 0; i < this.bookList.size(); i++) {
            if (bookId == this.bookList.get(i).getBookId()) {
                flag = true;
                this.bookList.remove(i);
                break;
            }
        }
        return flag;
    }
}
