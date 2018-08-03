package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/3 下午2:48
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int diff = Math.abs(b.length() - a.length());


        if(a.length() < b.length()){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < diff; i++) sb.append("0");
            sb.append(a);
            a = sb.toString();
        }else {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < diff; i++) sb.append("0");
            sb.append(b);
            b = sb.toString();
        }

        int carry = 0;
        StringBuilder ret = new StringBuilder();
        for(int i = a.length()-1; i >= 0; i--){
            int result = (a.charAt(i)-'0')+(b.charAt(i)-'0')+carry;
            if(result==0){
                ret.append(0);
                carry = 0;
            }else if(result==1){
                ret.append(1);
                carry = 0;
            }else if(result==2){
                ret.append(0);
                carry = 1;
            }else {
                ret.append(1);
                carry = 1;
            }
        }
        if(carry == 1) ret.append(1);

        return ret.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("1010","1011"));
    }

}
