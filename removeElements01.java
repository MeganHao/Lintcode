public ListNode removeElements(ListNode head, int val) {
    // Write your code here
    // 一种first edge 是直接为null.
    // 使用dummy method可以避免这种edge的判断
    if (head == null){
        return head;
    }
    // 要查看head的val就要先判断head是否为null.
    while (head != null && head.val == val){
        head = head.next;
    }
    ListNode current = head;
    // 尾部的next就是null
    while (current != null) {
        // 要查看current的next就要先判断current是否为null.
        // 这个while是为了查看val数值连续出现多次的情况
        while (current.next != null && current.next.val == val) {
            current.next = current.next.next;
        }
        current = current.next;
    }
    return head;
}