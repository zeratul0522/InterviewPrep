package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/5 17:13
 * @Desc
 */

public class GrayCode {
    public List<Integer> grayCode(int n) {
        if (n == 0) {
            List<Integer> ret = new ArrayList<>();
            ret.add(0);
            return ret;
        }

        List<Integer> prev = grayCode(n - 1);
        for (int i = prev.size()-1; i >= 0; i--) {
            prev.add(prev.get(i) | 1 << (n - 1));
        }
        return prev;
    }
}
