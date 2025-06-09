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
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr= new ArrayList<>();
        ListNode curr =  head;
        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }

        return isPalindrome(arr);
    }

    public boolean isPalindrome(List<Integer> arr){
        int n = arr.size();
        for(int i =0;i<n/2;i++){
            if (!arr.get(i).equals(arr.get(n - 1 - i))) { 
                return false;
            }
        }

        return true;
    }
}