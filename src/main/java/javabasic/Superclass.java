package main.java.javabasic;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/28 下午10:32
 */
public class Superclass {
    private static int a = 15;
    public Superclass(){

    }

    public static void main(String[] args) {
        Superclass sub = new Superclass();
        System.out.println(sub.a);
    }
}
