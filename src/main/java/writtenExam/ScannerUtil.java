package main.java.writtenExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/30 下午4:16
 */
public class ScannerUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int num = 0;
        if(scanner.hasNextLine()) num = Integer.parseInt(scanner.nextLine());
        System.out.println(num);
        for(int h = 0; h < num; h++){
            list.add(Integer.parseInt(scanner.nextLine()));
        }
        scanner.close();

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }





    }
}
