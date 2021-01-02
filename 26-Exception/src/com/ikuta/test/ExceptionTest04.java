package com.ikuta.test;

//自定义异常
class MyStackOperationException extends Exception {
    public MyStackOperationException() {
        super();
    }

    public MyStackOperationException(String message) {
        super(message);
    }

}

//结合自定义异常编写程序模拟栈的操作
public class ExceptionTest04 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        try {
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());//栈已满的情况下压栈
        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();//栈已空的情况下弹栈
        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyStack {
    private Object[] elements;
    private int index;//栈桢

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public MyStack() {
        this(new Object[3]);//栈容量默认为3
        this.index = -1;//栈桢默认为-1
    }

    public MyStack(Object[] elements) {
        super();
        this.elements = elements;
        this.index = elements.length - 1;//栈桢永远指向栈顶元素
    }

    public void push(Object obj) throws MyStackOperationException {
        //安全性检验
        if (index >= elements.length - 1) {
            throw new MyStackOperationException("栈已满，压栈失败");
        }
        elements[++index] = obj;
        System.out.println("压栈" + obj + "成功，栈桢指向" + index);
    }

    public void pop() throws MyStackOperationException {
        //安全性检验
        if (index < 0) {
            throw new MyStackOperationException("栈已空,弹栈失败");
        }
        System.out.print("弹栈" + elements[index] + "元素成功,");
        elements[index] = null;//元素弹出
        index--;//栈针下移
        System.out.println("栈桢指向" + index);
    }
}