package main.java.swordAtOffer;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/2 下午9:08
 */
public class ReplaceSpaces {
    public String replaceSpace(StringBuffer str) {
        char[] chars = str.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars.length;i++){
            if(chars[i]==' '){
                sb.append("%20");
            }else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
