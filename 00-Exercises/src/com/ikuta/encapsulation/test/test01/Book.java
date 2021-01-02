package com.ikuta.encapsulation.test.test01;

/*1.请通过代码封装，实现如下需求：
	编写一个类book，代表教材
	1.具有属性：名称title、页数pageNum
	2.其中页数不能少于200页，否则输出错误信息，并赋默认值200
	3.为各属性提供赋值和取值方法
	4.具有方法：detail，用来在控制台输出每本教材的名称和页数
	5.编写程序BookTest进行测试：	为Book对象的属性赋予初始值，
									调用Book对象的detail方法。
*/
public class Book {
    private String title;

    //title的get和set方法
    public String getTitle() {
        return title;
    }

    public void setTitle(String a) {
        title = a;
    }

    private int pageNum;

    //pageNum的get和set方法
    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int a) {
        if (a < 200) {
            System.out.println("输入页数错误");
            return;
        } else {
            pageNum = a;
        }
    }

    //构造方法
    public Book() {
        title = "未知";
        pageNum = 200;
    }

    public Book(String a, int b) {
        title = a;
        if (b < 200) {
            System.out.println("输入页数错误");
        } else {
            pageNum = b;
        }
    }

    //detail()方法：输出每本教材的名称和页数
    public void detail() {
        System.out.println("名称：" + title);
        System.out.println("页数：" + pageNum);
        //不需要写getTtile()读取数据
        //因为private的title要出了Book类才需要get方法访问
        //目前还是在Book类中访问title
    }
}
