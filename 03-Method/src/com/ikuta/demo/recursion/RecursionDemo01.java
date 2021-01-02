package com.ikuta.demo.recursion;

/*方法递归
1.什么是方法递归?
    方法自己调用自己,这就是方法递归
2.当递归没有结束条件时，一定会发生栈内存溢出错误(StackOverflowError)
    所以，递归必须要有结束条件
3.递归是有结束条件，也有可能发生栈内存溢出错误。
    因为有可能递归的太深，一直在压栈尚未弹栈导致栈内存不够了。
4.在实际开发中，不建议轻易使用递归，尽量使用循环。
    因为循环运行效率高、耗费内存小。
    另外，递归的使用不当，会导致JVM死掉。
    但是，在一定情况下，不使用递归，这个程序就没法实现。
    所以，递归还是要掌握的。
5.在实际开发中，遇到了栈内存溢出错误(StackOverflowError)，怎么解决？
    第一步：检测递归的结束条件是否正确？
                错误则修改；
                正确则进入第二步。
    第二步：手动调整JVM的栈内存空间大小。
*/
public class RecursionDemo01 {
    public static void main(String[] args) {
        doSome();
    }

    public static void doSome() {
        System.out.println("doSome方法开始");
        //doSome();//当前方法没有结束条件而栈内存有限,这将导致栈内存溢出错误[StackOverflowError]
        System.out.println("doSome方法结束");
    }
}