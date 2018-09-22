package main.java.writtenExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/15 上午9:42
 */
public class Iqiyi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] nums = new int[6];
        for(int i = 0; i < 6; i++){
            nums[i] = str.charAt(i)-48;
        }

        int left = nums[0]+nums[1]+nums[2];
        int right = nums[3]+nums[4]+nums[5];
        int minus = Math.abs(left-right);

        int[] leftArr = new int[3];
        leftArr[0] = nums[0];
        leftArr[1] = nums[1];
        leftArr[2] = nums[2];
        Arrays.sort(leftArr);

        int[] rightArr = new int[3];
        rightArr[0] = nums[3];
        rightArr[1] = nums[4];
        rightArr[2] = nums[5];
        Arrays.sort(rightArr);

        int leftMax = leftArr[2];
        int leftMin = leftArr[0];

        int rightMax = rightArr[2];
        int rightMin = rightArr[0];

        if(left==right){
            System.out.println(0);
            return;
        }
        int[] more = new int[3];
        int[] less = new int[3];
        if(left>right){
            more = leftArr;
            less = rightArr;
        }else {
            more = rightArr;
            less = leftArr;
        }

        if(more[2]-0>=minus || 9-less[0]>=minus){
            System.out.println(1);
            return;
        }else {

            if((more[2]-0)+(more[1]-0)>=minus||(more[2]-0)+(9-less[0])>=minus ||
                    ((9-less[0])+(9-less[1]))>=minus){
                System.out.println(2);
                return;
            }else {
                System.out.println(3);
                return;
            }
        }
    }
}
