/*
   两两交换链表中的节点
 */

package com.lz.linked;




public class SwapPairs {

    /**
     * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
     * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
     * 给定 1->2->3->4, 你应该返回 2->1->4->3
     *
     */
    public ListNode swapPairs(ListNode head) {
        /**
         * 终止条件： 只有一个节点或者没有节点
         * 返回值：   返回处理好的子链表
         * 本级递归： 上一级->head->next->处理好的链表  只需要交换好head 和next的位置
         */
        if(head==null||head.next==null){
            return head;
        }
         ListNode next=head.next;
             head.next =swapPairs(next.next);
             next.next=head;
          return next;
    }

      class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
          }
}
