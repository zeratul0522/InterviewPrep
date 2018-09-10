package main.java.writtenExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/8 下午7:15
 */
public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0;i < n;i++) {
            int X = in.nextInt(), Y = in.nextInt();
            String str = in.next();
            System.out.println(X+" "+Y+" "+str);
        }
        //System.out.println( stringNTo10("48A",12));


    }
    public static int helper(String str, int a, int b){
        for(int i = 1; i < str.length();i++){
            if(stringNTo10(str.substring(0,i),a)==stringNTo10(str.substring(i,str.length()),b)){
                return stringNTo10(str.substring(0,i),a);
            }
        }
        return -1;
    }

//    public static int helper(String str, int a, int b, int split,int start, int end){
//        int left = stringNTo10(str.substring(0,split),a);
//        int right = stringNTo10(str.substring(split,str.length()),b);
//        if(start==end){
//            return left;
//        }
//        if(start==end-1){
//            if(left==right){
//                return left;
//            }else {
//                return stringNTo10(str.substring(0,split+1),a);
//            }
//        }
//        if(left==right){
//            return left;
//        }else if(left<right){
//            helper(str,a,b,(split+end)/2,split+1,end);
//        }else{
//            helper(str,a,b,(start+split)/2,start,split-1);
//        }
//        return 0;
//    }

    public static int pow(int x, int ex) {
        int result = 1;
        for (int i = 0; i < ex; i++)
        {
            result *= x;
        }
        return result;
    }

    public static int stringNTo10(String N_num, int radix) {
        StringBuilder stringBuilder = new StringBuilder(N_num);
        stringBuilder.reverse();// 反转字符，为了把权重最大的放在最右边，便于下面从左到右遍历，根据下标求权重。
        //如果不反转，从右向左遍历(从字符串下标大的一端)也可以
        char bitCh;
        int result = 0;
        for (int i = 0; i < stringBuilder.length(); i++)
        {
            bitCh = stringBuilder.charAt(i);
            if (bitCh >= '0' && bitCh <= '9')
            {
                // '0'对应的ASCII码整数：48
                result += (int) (bitCh - '0') * pow(radix, i);
            } else if (bitCh >= 'A' && bitCh <= 'Z')
            {
                // 减去'A'的ASCII码值(65),再加上10
                result += ((int) (bitCh - 'A') + 10) * pow(radix, i);
            } else if (bitCh >= 'a' && bitCh <= 'z')
            {
                // 减去'a'的ASCII码值(97),再加上10
                result += ((int) (bitCh - 'a') + 10) * pow(radix, i);
            }
        }
        return result;
    }

}
