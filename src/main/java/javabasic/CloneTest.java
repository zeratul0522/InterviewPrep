package main.java.javabasic;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/18 下午2:12
 */
public class CloneTest  {
    public static void main(String[] args) {
        try {
            CloneTestB b = new CloneTestB();
            b.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("aa");
        }

    }
}
