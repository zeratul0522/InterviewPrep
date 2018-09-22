package main.java.swordAtOffer;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/3 下午2:44
 */
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        int len = array.length;
        for(int i = 0; i < len; i++){
            if(array[i]%2!=0){
                int temp = array[i];
                int j = i-1;
                while (j >= 0 && array[j]%2==0){
                    array[j+1]=array[j];
                    j--;
                }
                j++;
                array[j] = temp;
            }
        }
    }
}
