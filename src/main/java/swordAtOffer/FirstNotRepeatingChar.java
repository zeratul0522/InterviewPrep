package main.java.swordAtOffer;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/10 下午7:56
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        int[] count = new int[256];
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }

        for(int j = 0; j < str.length(); j++){
            if(count[str.charAt(j)]==1)
                return j;
        }
        return -1;
    }
}
