package main.java.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/3 下午3:31
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        if(path.equals("/../")) return "/";
        if(path.equals("/")) return "/";
        List<String> elements = new ArrayList<>();
        Deque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        path = new StringBuilder(path).append("/").toString();
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == '/'){
                if(sb.length() > 0) elements.add(sb.toString());
                sb.delete(0,sb.length());
                continue;
            }
            sb.append(path.charAt(i));
        }
        if(elements.size()>0&&elements.get(0).equals("")) elements.remove(0);
        if(elements.size() == 0) return "/";

        for(String str : elements){
            if(str.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }

            }else if(str.equals(".")){

            }else {
                stack.push("/"+str);
            }

        }
        if(stack.isEmpty()) stack.push("/");
        StringBuilder ret = new StringBuilder();
        while(!stack.isEmpty()){
            ret.insert(0,stack.pop());
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        List<String> elements = new ArrayList<>();
        System.out.println(simplifyPath.simplifyPath("/..."));
    }
}
