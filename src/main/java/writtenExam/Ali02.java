package main.java.writtenExam;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/7 下午7:56
 */
public class Ali02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

//        int a = Integer.parseInt(str1.split(",")[0]);
//        int b = Integer.parseInt(str1.split(",")[1]);
        int a = Integer.valueOf(str1.charAt(0));
        int b = Integer.valueOf(str1.charAt(2));



        Point2D.Double p = new Point2D.Double(a,b);
        List<Point2D.Double> polygon = new ArrayList<Point2D.Double>();
        String[] tmp = str2.split(",");
        for(int i = 0; i < tmp.length;i+=2){
            polygon.add(new Point2D.Double(Integer.parseInt(tmp[i]),Integer.parseInt(tmp[i+1])));
        }

        if(checkWithJdkGeneralPath(p,polygon)){
            System.out.println("yes,0");
        }else {
            System.out.println("no,0");
        }

    }

    private static boolean checkWithJdkGeneralPath(Point2D.Double point, List<Point2D.Double> polygon) {
        java.awt.geom.GeneralPath p = new java.awt.geom.GeneralPath();

        Point2D.Double first = polygon.get(0);
        p.moveTo(first.x, first.y);
        polygon.remove(0);
        for (Point2D.Double d : polygon) {
            p.lineTo(d.x, d.y);
        }

        p.lineTo(first.x, first.y);

        p.closePath();

        return p.contains(point);
    }
}
