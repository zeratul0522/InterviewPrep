package main.java.javabasic;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/8/24 下午7:27
 */
public class TestHashCode {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,null);
        System.out.println(map.containsValue(null));

//        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
//        ht.put(1, null);

        new ArrayDeque<Integer>().add(null);
    }
}
