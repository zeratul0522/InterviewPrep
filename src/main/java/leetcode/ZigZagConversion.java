package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/20 下午3:11
 */
public class ZigZagConversion {
    class Solution {
        public String convert(String s, int numRows) {
            if(numRows<2) return s;
            //Calculate the width of the result matrix
            int matrixWidth = 0;
            int quotient = s.length()/(2*numRows-2);
            int remainder =  s.length()%(2*numRows-2);
            if(remainder == 0) {
                matrixWidth = (numRows-1)*quotient;
            }else if(remainder <= numRows){
                matrixWidth = (numRows-1)*quotient+1;
            }else{
                matrixWidth = (numRows-1)*quotient+1+remainder-numRows;
            }

            char[][] ret = new char[numRows][matrixWidth];
            for(int i = 0; i< s.length();i++){
                int iquotient = (i+1)/(2*numRows-2);
                int iremainder = (i+1)%(2*numRows-2);
                int iwidth = 0,iheight = 0;
                if(iremainder == 0){
                    iwidth = (numRows-1)*iquotient;
                    iheight=2;
                }else if(iremainder <= numRows){
                    iwidth = (numRows-1)*iquotient+1;
                    iheight=iremainder;
                }else{
                    iwidth = (numRows-1)*iquotient+1+iremainder-numRows;
                    iheight = 2*numRows - iremainder;
                }
                ret[iheight-1][iwidth-1] = s.charAt(i);

            }

            StringBuilder sb = new StringBuilder();

            for(int a = 0; a < numRows;a++){
                for (int b = 0; b < matrixWidth;b++){
                    if(ret[a][b]!='\u0000'){
                        sb.append(ret[a][b]);
                    }


                }
            }
            return sb.toString();

        }
    }

    public static void main(String[] args) {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        Solution solution = zigZagConversion.new Solution();
        System.out.println(solution.convert("",4));
    }
}
