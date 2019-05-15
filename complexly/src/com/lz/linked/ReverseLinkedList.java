package com.lz.linked;

public class ReverseLinkedList {
    /**
     * 反转链表
     * 输入: 1->2->3->4->5->NULL
     输出: 5->4->3->2->1->NULL
     */
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode reverseList(ListNode head) {
          ListNode prev=null;
          ListNode curr=head;
          while(curr!=null){
             ListNode tmp= curr.next;
              curr.next=prev;
              prev = curr;
              curr = tmp;
          }
          return prev;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead   = reverseList(head.next);
        head.next.next    = head;
        head.next         = null;
        return newHead;
    }


    public ListNode reverseList3(ListNode head) {
        ListNode newHead = null;
        while (head != null){
            ListNode tmp = head.next;
            head.next    = newHead;
            newHead      = head;
            head         = tmp;
        }
        return newHead;
    }
}
