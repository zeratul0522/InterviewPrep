package main.java.algorithm;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/9/13 12:00
 * @Desc
 */

public class A implements Cloneable {
    public A(){

    }
    public static void main(String[] args) throws CloneNotSupportedException{
        A a = new A();
        A aaa = (A)a.clone();
    }
}
