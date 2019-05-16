package com.lz.linked;

public class LzSinglyLinkedList {

    private Node head;
    /**
     * 删除
     */
     public Node delete(int val){
        if(head==null){
            return null;
        }
          Node q=head;
        Node  p=null;
        while(q.next!=null&&q.val!=val){
            p=q;
            q=q.next;
        }
        if(p==null){
          head=head.next;
        }
        if(q.val==val){
            p.next=p.next.next;
        }
         return q;
     }
    /**
     * 增加
     */
     public void  add(int e){
          Node node=new Node(e,null);
         if(this.head==null){
             this.head=node;
         }else{
             Node d=head;
             while(d.next!=null){
                 d=d.next;
             }
             node.next=d.next;
             d.next=node;
         }
     }
     public void add(int[] a){
        for(int b:a){
            Node newNode=new Node(b,null);
            if(this.head==null){
                this.head=newNode;
            }else{
                Node d=head;
                while(d.next!=null){
                    d=d.next;
                }
                newNode.next=d.next;
                d.next=newNode;
            }
         }
     }
    /**
     * 查找
     */




    class Node{
        private int val;
        private Node next;
        Node(int x,Node next){
            this.val=x;
            this.next=next;
        }
    }
}
