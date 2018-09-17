package main.java.writtenExam;

import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/16 上午10:31
 */
public class Tencent01 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6};
//        System.out.println(getMinCommonMultipleByArray(nums));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>=0; i--){
            if(isPrime(i)){
                System.out.println(2*i);
            }
        }
//        for(int m = n+1;;m++){
//            int[] a = new int[m-n];
//            for(int i = 0; i < a.length;i++){
//                a[i] = n+1+i;
//            }
//            int[] b = new int[m];
//            for(int i = 0; i < b.length;i++){
//                b[i] = i+1;
//            }
//
//            if(getMinCommonMultipleByArray(a)==getMinCommonMultipleByArray(b)){
//                System.out.println(m);
//                return;
//            }
//        }
    }
    public static boolean isPrime(int num){

        boolean isprime=true;
        int len=num/2;
        for(int i=2;i<len;i++){
            if(num%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;
    }

    /*
    求两个数的最大公约数,辗转相除法
     */
    public static int getMaxCommonDivisor(int a, int b) {
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }


    /*
    求两个数的最小公倍数
     */
    public static int getMinCommonMultiple(int n, int m) {
        return n*m / getMaxCommonDivisor(n, m);
    }


    /*
    求多个数的最小公倍数
     */
    public static int getMinCommonMultipleByArray(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ret = getMinCommonMultiple(ret, nums[i]);
        }
        return ret;

    }


}
