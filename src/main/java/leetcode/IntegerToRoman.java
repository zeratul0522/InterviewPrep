package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/17 下午1:56
 */
public class IntegerToRoman {
    class Solution {
        public String intToRoman(int num) {
            StringBuilder sb = new StringBuilder();
            int m = num/1000;
            if(m>0){
                for(int i = 0;i<m;i++){
                    sb.append("M");
                }
            }
            int modm = num % 1000;
            if(modm >= 900){
                sb.append("CM");
            }else if(modm >=800){
                sb.append("DCCC");
            }else if(modm >= 700){
                sb.append("DCC");
            }else if(modm >= 600){
                sb.append("DC");
            }else if(modm >= 500){
                sb.append("D");
            }else if(modm>=400){
                sb.append("CD");
            }else if(modm>=300){
                sb.append("CCC");
            }else if(modm >= 200){
                sb.append("CC");
            }else if(modm >= 100){
                sb.append("C");
            }

            int modc = num %100;
            if(modc >= 90){
                sb.append("XC");
            }else if(modc >=80){
                sb.append("LXXX");
            }else if(modc >= 70){
                sb.append("LXX");
            }else if(modc >= 60){
                sb.append("LX");
            }else if(modc >= 50){
                sb.append("L");
            }else if(modc>=40){
                sb.append("XL");
            }else if(modc>=30){
                sb.append("XXX");
            }else if(modc >= 20){
                sb.append("XX");
            }else if(modc >= 10){
                sb.append("X");
            }

            int modx = num %10;
            if(modx >= 9){
                sb.append("IX");
            }else if(modx >=8){
                sb.append("VIII");
            }else if(modx >= 7){
                sb.append("VII");
            }else if(modx >= 6){
                sb.append("VI");
            }else if(modx >= 5){
                sb.append("V");
            }else if(modx>=4){
                sb.append("IV");
            }else if(modx>=3){
                sb.append("III");
            }else if(modx >= 2){
                sb.append("II");
            }else if(modx >= 1){
                sb.append("I");
            }

            //sb.append();
            return sb.toString();
        }
    }

    public static void main(String args[]){
        IntegerToRoman integerToRoman = new IntegerToRoman();
        IntegerToRoman.Solution is = integerToRoman.new Solution();
        System.out.println("The result = "+is.intToRoman(2107));

    }
}
