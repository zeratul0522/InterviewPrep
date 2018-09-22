package main.java.swordAtOffer;

/**
 * @Desc
 * @Author Fan Zejun E-mail:fzj0522@outlook.com
 * @Version Created at: 2018/9/4 下午4:44
 */
public class CloneAComplicatedLinkedList {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead==null) return null;
        //RandomListNode cloneHead = new RandomListNode(pHead.label);

       //首先对原链表进行复制，如A->B->C变成A->A'->B->B'->C->C'
        RandomListNode pcurr = pHead;
        while (pcurr!=null){
            RandomListNode tmp = new RandomListNode(pcurr.label);
            RandomListNode next = pcurr.next;
            pcurr.next = tmp;
            pcurr.next.next = next;
            pcurr = pcurr.next.next;
        }

        //然后,p'.random = p.random.next
        pcurr = pHead;
        while (pcurr!=null){
            pcurr.next.random = pcurr.random==null?null:pcurr.random.next;
            pcurr = pcurr.next.next;
        }

        //最后拆分
        pcurr = pHead;
        RandomListNode cloneHead = pHead.next;
        while (pcurr!=null){
            RandomListNode clone = pcurr.next;
            pcurr.next = clone.next;
            clone.next = clone.next==null?null:clone.next.next;
            pcurr = pcurr.next;
        }
        return cloneHead;
    }

    private class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public static void main(String[] args) {
        CloneAComplicatedLinkedList cloneAComplicatedLinkedList = new CloneAComplicatedLinkedList();

    }
}

