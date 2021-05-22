package test.com.company;

import com.company.libBook;
import com.company.librarySystem;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class librarySystemTest extends librarySystem {

    librarySystem library_system = new librarySystem();

    /**
     * 显示书本信息
     */
    public void showList() {
        List<libBook> list = library_system.getBookList();
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j).getBook());
        }
        System.out.println();
    }

    /**
     * 自己添加book数据
     */
    public void insertBooks() {
        String bookArray[] = {"雾都孤儿", "孤独的守望者", "彷徨", "活着活着就老了", "围城"};
        System.out.println("bookList中已有《雾都孤儿》《孤独的守望者》《彷徨》《活着活着就老了》《围城》");
        for (int i = 0; i < bookArray.length; i++)
            library_system.addBookToLib(bookArray[i]);
    }

    @Before
    public void setUp() throws Exception {
        System.out.print("开始测试");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    /**
     * 添加书本操作
     */

    @Test
    public void testAddBookToLib() {
        String array[] = {"雾都孤儿", "孤独的守望者;System.out.println();", "彷        徨", "   "};
        String explain[] = {"正常输入", "分号测试，需要过滤分号", "空格测试，应该去除空格", "空书名测试，应该返回false"};

        System.out.println("addBookToLib方法\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println("输入为《" + array[i] + "》\n测试点：" + explain[i]);
            boolean flag = library_system.addBookToLib(array[i]);
            System.out.println("函数返回值：" + flag);
            System.out.println("测试结果：");
            showList();
        }

    }

    /**
     * 显示书本操作
     */
    @Test
    public void testShowBookList() {
        System.out.println("showBookList方法\n");
        insertBooks();
        System.out.println("测试结果：");
        library_system.showBookList();
    }

    /**
     * 删除书本操作
     */
    @Test
    public void testDelBook() {
        System.out.println("DelBook方法\n");
        insertBooks();
        showList();
        int array[] = {1001, 1001, 1003, 1005};
        String explain[] = {"删除1001", "再次删除1001", "删除1003", "删除1005"};
        for(int i = 0; i < array.length; i++){
            boolean flag =  library_system.delBook(array[i]);

            System.out.println("进行"+explain[i]+"操作\n"+"函数返回值：" + flag + "\n运行结果：");

            showList();
        }

    }
}
