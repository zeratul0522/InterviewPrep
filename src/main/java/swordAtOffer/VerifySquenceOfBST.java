package main.java.swordAtOffer;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/4 下午3:27
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)  return false;
        return helper(sequence,0,sequence.length-1);
    }

    public static boolean helper(int[] sequence, int start, int end){
        if(end<start) return true;
        if(start==end || start==end-1)  return true;
        int root = sequence[end];

        int rightSubtreeStart = -1;
        for(int i = start; i < end; i++){
            if(sequence[i] > root){
                rightSubtreeStart = i;
                break;
            }
        }
        if(rightSubtreeStart==-1){
            if(end-1>=start)
                return helper(sequence,start,end-1);
            else
                return true;
        }else{
            for(int i = rightSubtreeStart; i < end;i++){
                if(sequence[i] < root)
                    return false;
            }
        }

        return helper(sequence,start, rightSubtreeStart-1) && helper(sequence,rightSubtreeStart, end-1);
    }

    public static void main(String[] args) {
        VerifySquenceOfBST verifySquenceOfBST = new VerifySquenceOfBST();
        int [] nums = {4,8,6,12,16,14,10};
        System.out.println(verifySquenceOfBST.VerifySquenceOfBST(nums));
    }
}
