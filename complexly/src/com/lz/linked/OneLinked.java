package com.lz.linked;


/**
 * 2019年5月10日16:18:37
 * @author liZhi
 * 链表： 单链表 双向链表 循环链表
 */
public class OneLinked {


    /**
     *    单链表：
     * 链表通过指针将一组零散的内存块串联在一起，这里内存块称为“结点”。
     * 为了串联在一起，每个结点除了储存本身的数据之外，还得存放链上下一个节点的地址。
     * 存放下一个结点地址的指针叫做后继指针next。
     * 头结点：记录链表的基地址。
     * 尾结点：指向一个空地址null，表示这是尾结点。
     * 插入和删除只需要改变相邻的结点指针，
     * 查询就要从头开始根据记录的指针地址遍历链表，时间复杂度是O(n).
     *
     *   循环链表：
     * 跟单链表的区别就是循环链表的尾结点指向的不是空地址，而是指向的头结点。
     * 优点是从链尾到链头比较方便，处理环形结构问题有一定的优势。
     *
     *   双向链表：
     * 每个结点不止有一个后继指针next指向后面的结点，还有一个前驱指针prev指向前面的结点。
     * 需要两个额外的空间来储存前驱结点和后继结点的地址。优点是支持双向遍历。
     *
     */

}
