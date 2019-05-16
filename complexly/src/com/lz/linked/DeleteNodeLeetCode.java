package com.lz.linked;


/**
 * 输入: head = [4,5,1,9], node = 5
 输出: [4,1,9]
 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 */
public class DeleteNodeLeetCode {
/**
 * 说明:
 链表至少包含两个节点。
 链表中所有节点的值都是唯一的。
 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 不要从你的函数中返回任何结果。
 */
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    /**
     * 从链表里删除一个节点 node 的最常见方法是修改之前节点的 next 指针，使其指向之后的节点。
     * 因为，我们无法访问我们想要删除的节点 之前 的节点，我们始终不能修改该节点的 next 指针。
     * 相反，我们必须将想要删除的节点的值替换为它后面节点中的值，然后删除它之后的节点。
     * 因为我们知道要删除的节点不是列表的末尾，所以我们可以保证这种方法是可行的。
     * @param node
     */
    public void deleteNode(ListNode node) {
        //只给定删除节点，只需将下一个节点的状态赋给当前节点，再删除下一个节点。
        //把当前节点的下一个节点的值付给当前节点
        //再把下一个节点指向下下个节点的指针付给当前节点指向下个节点的指针
           node.val=node.next.val;
           node.next=node.next.next;
     }
}
