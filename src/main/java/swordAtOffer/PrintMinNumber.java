package main.java.swordAtOffer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/7 下午4:32
 */
public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length==0) return "";
        if(numbers.length==1)   return String.valueOf(numbers[0]);
        String[] strings = new String[numbers.length];
        for(int i = 0; i < numbers.length;i++){
            strings[i] = String.valueOf(numbers[i]);
        }
        MyComparator myComparator = new MyComparator();
        Arrays.sort(strings,myComparator);
        StringBuilder sb = new StringBuilder();
        for(String str : strings){
            sb.append(str);
        }
        return sb.toString();
    }

    class MyComparator implements Comparator<String>{
        public int compare(String a, String b){
            String c1 = (String)new StringBuilder().append(a).append(b).toString();
            String c2 = (String)new StringBuilder().append(b).append(a).toString();
            return c1.compareTo(c2);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,32,321};
        PrintMinNumber printMinNumber = new PrintMinNumber();
        System.out.println(printMinNumber.PrintMinNumber(nums));
    }
}
