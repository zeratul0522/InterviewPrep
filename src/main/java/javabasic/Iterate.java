package main.java.javabasic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/9 下午2:07
 */
public class Iterate {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("aaa",1);
        map.put("aqwre",2);
        map.put("vag",4);
        map.put("twva",12);
        map.put("abfaf",7);
        map.put("ccc",124);
        Set entries = map.entrySet();
        Iterator iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
