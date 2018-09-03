package main.java.concurrencyTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/22 下午4:40
 */
public class TestTask implements Runnable {
    public void run(){
//        try {
            System.out.println("A");
            Thread.yield();
//        }catch (InterruptedException e){
//            System.out.println("Interrupted");
//        }

    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++){
            exec.execute(new TestTask());
        }
        System.out.println("B");
        exec.shutdown();
        System.out.println("C");

    }
}
