package main.java.writtenExam;

import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/12 下午6:24
 */
public class Huawei02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()==0 || str.length()==1){
            System.out.println(str);
            return;
        }
        String[] strings = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strings.length; i++){
            String tmp = strings[i];
            sb.append(new StringBuilder(tmp).reverse().toString());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }
}
