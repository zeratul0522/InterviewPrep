package main.java.writtenExam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/15 下午3:05
 */
public class Redbook03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        Set<Integer> set_1 = new HashSet<>();
        Set<Integer> set_2 = new HashSet<>();
        for(int i = 0; i < Q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            //小朋友a,b都尚未被分配过
            if(!set_1.contains(a) && !set_2.contains(a) && !set_1.contains(b) && !set_2.contains(b)){
                set_1.add(a);
                set_2.add(b);

            }else if(!set_1.contains(b) && !set_2.contains(b) && set_1.contains(a)){
                //a被分配到1班，b没有被分配过
                set_2.add(b);
            }else if(!set_1.contains(b) && !set_2.contains(b) && set_2.contains(a)){
                set_1.add(b);
            }else if(!set_1.contains(a) && !set_2.contains(a) && set_1.contains(b)){
                set_2.add(a);
            }else if(!set_1.contains(a) && !set_2.contains(a) && set_2.contains(b)){
                set_1.add(a);
            }else {
                //都被分配过
                if((set_1.contains(a)&&set_1.contains(b)) ||(set_2.contains(a)&&set_2.contains(b))){
                    System.out.println(0);
                    return;
                }
            }

        }
        System.out.println(1);
    }
}
