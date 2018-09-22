package main.java.algorithm;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/28 下午10:34
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
