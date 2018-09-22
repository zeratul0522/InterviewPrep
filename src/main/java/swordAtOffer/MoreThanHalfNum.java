package main.java.swordAtOffer;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/5 上午12:27
 */
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==1)
            return array[0];
        int cnt = 1, winner = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] == winner){
                cnt++;
            }else if(cnt==0){
                winner = array[i];
                cnt = 1;
            }else {
                cnt--;
            }
        }
        return winner;
    }
}
