package main.java.leetcode;

import java.util.ArrayList;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/2 下午7:36
 */
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n;i++){
            list.add(i);
        }
        ArrayList<String> ans = new ArrayList<>();
        getFirst(list, n, k, ans);
        StringBuilder sb = new StringBuilder();
        for(String str : ans){
            sb.append(str);
        }
        return sb.toString();
    }

    public void getFirst(ArrayList<Integer> list, int n, int k, ArrayList<String> ans){
        if(n == 1) {
            ans.add(list.get(0).toString());
            return;
        }
        int len = (int)factorial(n);
        int place = k%(len/n)==0 ? k/(len/n) : k/(len/n)+1;
        ans.add(list.get(place-1).toString());
        list.remove(place-1);
        k = k-(place-1)*(len/n);
        n--;

        getFirst(list, n, k, ans);
    }
    public long factorial(int n){
        if(n == 0) return 1;
        return factorial(n-1)*n;
    }
    public static void main(String[] args) {
        PermutationSequence permutationSequence = new PermutationSequence();
        System.out.println(permutationSequence.getPermutation(3,3));
    }
}
