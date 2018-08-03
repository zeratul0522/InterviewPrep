package main.java.leetcode;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version 2018/8/2 下午4:01
 */

public class MergeIntervals {
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    private class MergeComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b){
           return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        //Sort all intervals by start
        Collections.sort(intervals, new MergeComparator());
        LinkedList<Interval> ret = new LinkedList<>();

        for(Interval interval : intervals){
            if(ret.isEmpty() || ret.getLast().end < interval.start){
                ret.add(interval);
            }else {
                ret.getLast().end = Math.max(interval.end, ret.getLast().end);
            }
        }

        return ret;
    }


}