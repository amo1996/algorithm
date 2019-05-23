package com.lz.linked;

/**
 * 合并两个有序链表
 */
public class mergeTwoLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     *
     *  输入：1->2->4, 1->3->4
     *  输出：1->1->2->3->4->4
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=null;
          while(l1.next!=null&&l2.next!=null){
              if(l1.val<l2.val){
                  if(head==null){
                      head=new ListNode(0);
                  }
                  head.next=l1;
                  l1=l1.next;
              }else{
                  if(head==null){
                      head=new ListNode(0);
                  }
                  head.next=l2;
                  l2=l2.next;
              }
                  head=head.next;
          }
        if(l1.next==null){
                  head.next = l2;

        }else{
                head.next = l1;
        }
          return head;
    }
}
