/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int n) {
        ListNode temp = head;
        ListNode prev=null;
        while(temp !=null){
            ListNode k = getKNode(temp,n);
            if(k==null){
                if(prev !=null) prev.next = temp;
                break;
            }
            ListNode nextnode = k.next;
            k.next = null;
            reverseList(temp);
            if(temp == head){
                head = k; //first k grp update the head
            }else{
                prev.next = k; //or else
            }
            prev=temp;
            temp = nextnode;
        }
        return head;
    }

     public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev;
}

    public ListNode getKNode(ListNode temp,int k){
        k-=1;
        while(temp != null && k>0){
            temp = temp.next;
             k--;
        }
        return temp;
    }
}