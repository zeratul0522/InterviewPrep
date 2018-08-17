package main.java.algorithm;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/14 下午7:47
 */
public class StackOverflow {
    public void test(){
        test();
    }

    public static void main(String[] args) {
        StackOverflow stackOverflow = new StackOverflow();
        stackOverflow.test();
    }
}
