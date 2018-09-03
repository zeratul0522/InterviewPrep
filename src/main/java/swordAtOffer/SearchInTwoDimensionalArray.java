package main.java.swordAtOffer;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/2 下午9:04
 */
public class SearchInTwoDimensionalArray {
    public boolean Find(int target, int [][] array) {
        if (array.length < 1) return false;
        int n = array.length, m = array[0].length;
        int i = n - 1, j = 0;
        while (i >= 0 && j < m) {
            if (target == array[i][j]) return true;
            else if (target < array[i][j]) {
                i--;
            }else{
                j++;
            }
        }
        return false;
    }
}
