package main.java.writtenExam;

import java.util.Scanner;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/30 下午7:04
 */
public class Pdd01 {
    public int getMinCount(){
        int hp = 0, normalAtk = 0, buffedAtk = 0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine()) hp = Integer.parseInt(sc.nextLine());
        if(sc.hasNextLine()) normalAtk = Integer.parseInt(sc.nextLine());
        if(sc.hasNextLine()) buffedAtk = Integer.parseInt(sc.nextLine());

        sc.close();
        int count = 0;
        if(buffedAtk <= normalAtk*2){
            //Use normal attack every time
            count += hp/normalAtk;
            if(hp%normalAtk!=0) count++;
        }else{
            //Use buffed attack
            while(hp >= buffedAtk) {
                hp -= buffedAtk;
                count += 2;
            }
            if(hp != 0 && hp <= normalAtk) {
                count += 1;
            }else if(hp != 0 && hp > normalAtk) {
                count += 2;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        Pdd01 p = new Pdd01();
        int a = p.getMinCount();
        System.out.println(a);
    }
}
