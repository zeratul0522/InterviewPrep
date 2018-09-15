package main.java.javabasic;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/30 下午3:10
 */
public class A implements Cloneable{
    public static int a = 5;
    public A(){
        try{
            super.clone();
        }catch (Exception e){
            System.out.println("aa");
        }
    }

    protected void func(){
        System.out.println("func");
    }

    public static void main(String[] args) {
        A a = new A();
    }

}
