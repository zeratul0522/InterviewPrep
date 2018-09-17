package main.java.writtenExam;

import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/16 下午6:48
 */
public class Zhaohang03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rotatedDigitsImpl(n));
    }

    public static int rotatedDigitsImpl(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isRotatedDigit(i))
                count++;
        }
        return count;
    }

    public static boolean isRotatedDigit(int num) {
        boolean changed = false;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 3 || digit == 4 || digit == 7)
                return false;
            if (digit == 2 || digit == 5 || digit == 6 || digit == 9)
                changed = true;
            num /= 10;
        }
        return changed;
    }
}
