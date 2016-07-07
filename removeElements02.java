public ListNode removeElements(ListNode head, int val) {
    // use the dummy method.
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    head = dummy;
    while (dummy.next != null) {
        // 这个比第一种方法简单
        // 在while循环中永远只要看下一个数值
        if (dummy.next.val == val) {
            dummy.next = dummy.next.next;
        }
        else {
            dummy = dummy.next;
        }
    }
    return head.next;
}