package main.java.javabasic;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/5 下午2:28
 */
public class TestInheritance {
    public static void main(String[] args) {
        Class2 class2 = new Class2();
        class2.tell();
    }
}

class Class1{
    public String name = "hxj";
    public char sex = 'f';

    public void tell(){
        System.out.println(name+sex);
    }
}

class Class2 extends Class1{
    public String name = "cxy";
    public char sex = 'm';




}