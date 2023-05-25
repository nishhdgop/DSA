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
    public ListNode addend(ListNode head, int data){
       if(head==null){
            head = new ListNode(data);
            return head;
        }
        ListNode last = head;
        ListNode new_node = new ListNode(data);
        new_node.next=null;
        while(last.next!=null){
            last =last.next;
        }
        last.next = new_node;
        return head;
    }
   
    public ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer> ll = new ArrayList<>();
        if(head==null)return null;
        while(head!=null){
            ll.add(head.val);
            head=head.next;
        }
        Collections.rotate(ll,k);
        //System.out.println(ll);
        ListNode nhead=null;
        for(int i=0;i<ll.size();i++){
            nhead = addend(nhead,ll.get(i));
        }
        return nhead;
    }
}
