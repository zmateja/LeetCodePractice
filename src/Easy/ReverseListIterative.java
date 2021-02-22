package Easy;

import Hard.TrapRainWater;

import java.util.List;

public class ReverseListIterative {
    public static void main(String[] args) {
        ReverseListIterative test = new ReverseListIterative();
        ListNode testList = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        test.reverseList(testList);
    }
    private ListNode reverseList(ListNode head){
        if(head == null)
            return null;
        ListNode p1 = head;
        ListNode p2 = p1.next;
        p1.next = null;
        while(p2 != null){
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
    return p1;
    }
}
