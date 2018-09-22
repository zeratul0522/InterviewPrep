package main.java.writtenExam;

import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/12 下午6:24
 */
public class Huawei01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = new StringBuilder(str).reverse().toString();
        int index = firstNotRepeatingChar(str);
        if(index==-1){
            System.out.println("NULL");
        }else {
            System.out.println(str.charAt(index));
        }
    }

    public static int firstNotRepeatingChar(String str) {
        int[] count = new int[256];
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }

        for(int j = 0; j < str.length(); j++){
            if(count[str.charAt(j)]==1)
                return j;
        }
        return -1;
    }
}
