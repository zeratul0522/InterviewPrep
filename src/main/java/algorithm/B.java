package main.java.algorithm;

import main.java.javabasic.A;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/13 上午10:56
 */
public class B implements Cloneable{

    public void func(){
        System.out.println("func executed");
    }


    public static void main(String[] args){
        A a = new A();
        B b = new B();
        Object o = new Object();
        try{

            B another = (B)b.clone();
            another.func();
        }catch (CloneNotSupportedException e){
            System.out.println(e.getStackTrace());
        }

    }
}
