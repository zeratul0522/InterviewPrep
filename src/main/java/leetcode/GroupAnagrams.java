package main.java.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/7/30 下午8:15
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            int[] letters = new int[26];
            for(char c : str.toCharArray()){
                letters[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < letters.length;i++){
                if(letters[i] == 0) continue;
                sb.append((char)('a'+i));
                sb.append(letters[i]);
            }
            if(map.get(sb.toString())==null)    map.put(sb.toString(),new ArrayList<>());
            map.get(sb.toString()).add(str);




        }

        return new ArrayList<>(map.values());
    }


}
