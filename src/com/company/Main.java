package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("欢迎进入图书管理系统，请选择操作项");
        int doId = 1;
        Scanner scanner = new Scanner(System.in);
        librarySystem library = new librarySystem();
        while (doId != 0) {
            System.out.println("1.添加图书\n2.查询图书\n3.删除图书\n0.退出系统");
            doId = scanner.nextInt();
            if (doId == 1) {
                System.out.print("请输入图书名字:");
                String name = scanner.next();
                if (library.addBookToLib(name)) {
                    System.out.println("图书《"+ name +"》添加成功");
                } else {
                    System.out.println("图书《"+ name +"》添加失败");
                }
            } else if (doId == 2) {
                library.showBookList();
            } else if (doId == 3) {
                System.out.print("请输入要删除的图书编号：:");
                int bookId = scanner.nextInt();
                if (library.delBook(bookId)) {
                    System.out.println("图书《"+ bookId +"》删除成功");
                } else {
                    System.out.println("图书《"+ bookId +"》删除失败");
                }
            }
        }
        System.out.println("退出图书管理系统");
    }
}
