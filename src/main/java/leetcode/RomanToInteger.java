package main.java.leetcode;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/16 下午2:05
 */
public class RomanToInteger {
    class Solution {
        public int romanToInt(String s) {
            int ret = 0;
            for(int i = 0; i < s.length(); i++){
                String chara = s.substring(i,i+1);
                if(chara.equals("I")||chara.equals("X")||chara.equals("C")){
                    if(i < s.length()-1){
                        String temp = s.substring(i,i+2);
                        if(temp.equals("IV")){
                            ret += 4;
                            i++;
                            continue;
                        }else if(temp.equals("IX")){
                            ret += 9;
                            i++;
                            continue;
                        }else if(temp.equals("XL")){
                            ret += 40;
                            i++;
                            continue;
                        }else if(temp.equals("XC")){
                            ret += 90;
                            i++;
                            continue;
                        }else if(temp.equals("CD")){
                            ret += 400;
                            i++;
                            continue;
                        }else if(temp.equals("CM")){
                            ret += 900;
                            i++;
                            continue;
                        }
                    }
                }
                if(chara.equals("I")){ret+=1;}
                else if(chara.equals("V")){ret+=5;}
                else if(chara.equals("X")){ret+=10;}
                else if(chara.equals("L")){ret+=50;}
                else if(chara.equals("C")){ret+=100;}
                else if(chara.equals("D")){ret+=500;}
                else if(chara.equals("M")){ret+=1000;}

            }
            return ret;
        }
    }

    public static void main(String[] args){
        RomanToInteger romanToInteger = new RomanToInteger();
        RomanToInteger.Solution rs = romanToInteger.new Solution();

        System.out.println(rs.romanToInt("LVIII"));
    }
}
