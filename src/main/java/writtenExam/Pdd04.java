package main.java.writtenExam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/30 下午8:26
 */
public class Pdd04 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = Integer.parseInt(sc.next());
       int l = Integer.parseInt(sc.next());

        Set<String> set = new HashSet<>();
        boolean judge[][] = new boolean[l][26];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            set.add(s);
            for (int j = 0; j < l; j++){
                judge[j][s.charAt(j) - 'A'] = true;
            }

        }

        StringBuilder sb = new StringBuilder();
        String result = backtrack(set, judge, sb,0, l);
        if (result.equals(""))
            System.out.println("-");
        else
            System.out.println(result);

    }

    public static String backtrack(Set<String> set,boolean[][] judge,StringBuilder sb, int curr, int target ) {
        if (curr < target) {
            for (int i = 0; i < 26; i++) {
                if (!judge[curr][i]) {
                    continue;
                }else{
                    sb.append((char)('A' + i));
                    String res = backtrack(set,judge, sb,curr + 1, target);
                    if (!res.equals(""))    return res;
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            return sb.toString();
        }
        if (!set.contains(sb.toString()))    return sb.toString();
        else return "";
    }

}



/*
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] words = input.split(" ");
        int N = Integer.parseInt(words[0]);
        int L = Integer.parseInt(words[1]);
        boolean[][] digits = new boolean[L][26];
        Map<String, Integer> map = new HashMap<>(N);
        for (int i = 0; i < N; i++) {
            String s = in.next();
            map.put(s, 1);
            for (int j = 0; j < L; j++)
                digits[j][s.charAt(j) - 'A'] = true;
        }
        String res = helper(digits, 0, L, new StringBuilder(""), map);
        if (res.equals(""))
            System.out.println("-");
        else
            System.out.println(res);
    }
    public static String helper(boolean[][] digits, int start, int target, StringBuilder sb, Map<String, Integer> map) {
        if (start < target) {
            for (int i = 0; i < 26; i++) {
                if (digits[start][i]) {
                    sb.append((char)('A' + i));
                    String res = helper(digits, start + 1, target, sb, map);
                    if (!res.equals(""))
                        return res;
                    sb.setLength(sb.length() - 1);
                }
            }
            return sb.toString();
        }
        else {
            if (!map.containsKey(sb.toString()))
                return sb.toString();
            else
                return "";
        }
    }
}
 */