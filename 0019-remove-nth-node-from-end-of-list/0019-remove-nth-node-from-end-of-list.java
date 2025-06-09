class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Calculate the size of the list
        ListNode tail = head;
        int size = 1;
        while (tail.next != null) {
            size++;
            tail = tail.next;
        }

        if (size == 1 && n == 1) {
            return null;
        }

        if (n == size) {
            return head.next;
        }

        
        int k = size - n;
        ListNode curr = head;
        int cnt = 1;
        while (cnt < k) {
            curr = curr.next;
            cnt++;
        }
        
        curr.next = curr.next.next;

        return head;
    }
}
