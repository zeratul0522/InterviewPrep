package main.java.writtenExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Toutiao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1 || n > 4) {
            System.out.println(0);
            return;
        }
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            nums[i] = a;
        }
        boolean result = validUtf8(nums);


    }

    public static boolean validUtf8(int[] data) {
        return validUtf8(data, 0);
    }

    public static boolean validUtf8(int[] data, int startIndex) {
        if (data == null)
            return false;
        int dataLength = data.length - startIndex;
        if (dataLength <= 0)
            return true;

        // check whether the character only contains 1 byte (with leading 0)
        if ((getPaylodBits(data[startIndex]) & (1 << 7)) == 0) {
            return validUtf8(data, startIndex + 1);
        }
        else {
            int currentLength = coutLeadingOneBit(getPaylodBits(data[startIndex]));
            // UTF8 character can be from 1 to 4 bytes long
            if (currentLength < 2 || currentLength > 4 || dataLength < currentLength)
                return false;
            for (int i = 1; i < currentLength; i++) {
                // check whether the bytes except the leading one begin with "01"
                if (!isStartWithZeroOneBit(getPaylodBits(data[startIndex + i])))
                    return false;
            }
            return validUtf8(data, startIndex + currentLength);
        }
    }

    private static int getPaylodBits(int data) {
        return data & ((1 << 8) - 1);
    }

    private static int coutLeadingOneBit(int data) {
        int count = 0;
        int maskBit = 7;
        while (maskBit >= 0 && (data & (1 << maskBit)) >> maskBit == 1) {
            count++;
            maskBit--;
        }
        return count;
    }

    private static boolean isStartWithZeroOneBit(int data) {
        return ((data & (1 << 7)) >> 7 == 1) && ((data & (1 << 6)) >> 6 == 0);
    }
}
