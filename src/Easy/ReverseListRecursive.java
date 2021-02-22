package Easy;

public class ReverseListRecursive {
    ReverseListRecursive test = new ReverseListRecursive();
    ListNode testList = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    ListNode result = reverseList(testList);

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

}
