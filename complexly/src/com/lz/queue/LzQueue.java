package com.lz.queue;


/**
 * 队列 Queue
 * @Author LiZhi
 */
public class LzQueue {

    /**
     * 队列： 跟栈非常相似，最基本的操作也是两个。
     *  入队：enqueue() 放一个数据到队列尾部
     *  出队：dequeue() 从队列头部取一个元素
     *
     *  用数组实现的队列叫作顺序队列，用链表实现的队列叫作链式队列。
     *  对于栈来说，我们只需要一个栈顶指针就可以了，但是队列需要两个指针，
     *  一个是head指针，指向队头；一个是tail指针，指向队尾。
     *  随着不停的入队、出队操作，head和tail都会持续往后移动。
     *  当tail移动到最右边，即使数组前面因为出队还有空闲空间，也无法继续添加数据了。
     *
     *  我们可以在 入队没有空闲空间的时候，集中触发一次数据搬移操作。
     *  也就是队列整体移动到数据的最前面，又可以继续添加数据了。
     *
     *  基于链表：head指针指向链表的第一个结点，tail指向最后一个节点。
     *
     *  循环队列：长的像一个环。主要是确定好队空和队满的判定条件。
     *  (tail+1)%n=head  循环队列会浪费一个数组的存储空间。
     *
     *  阻塞队列：在队列的基础上增加了阻塞操作。在队列为空的时候，从队头取数据会被阻塞。
     *  直到队列中有了数据才能返回，如果队列满了，插入数据的操作就会被阻塞，直到队列中有控线位置后再插入数据。
     *
     *  这个定义就是"生产者-消费者模型"。还可以通过协调"生产者"和"消费者"的个数，来提高数据的处理效率。
     *  但是当有多个线程同时操作队列，就会存在线程安全问题。
     *  线程安全的队列叫作并发队列。
     *
     *  并发队列：最简单的实现可以在入队、出队方法上加锁，但是锁粒度太大，并发度比较低。
     *  基于数组的循环队列，利用CAS院子操作，可以实现非常高效的并发队列。 Disruptor
     *
     *  问题：
     *  当线程池没有空闲线程时，新的任务请求线程资源时，线程池该如何处理？
     *     一般有两种处理策略：
     *     第一种：非阻塞，直接拒绝任务请求。
     *     第二种：阻塞，将请求排队，等到有空闲线程时，取出排队的请求继续处理。
     *     那如何存储排队的请求呢？
     *     基于链表的实现：可以实现一个支持无限排队的无界队列，但是可能会导致过多的请求排队等待。
     *    请求处理的响应时间过长。
     *     基于数组的实现： 队列的大小有限，所以线程池中排队的请求超过队列大小时，接下来的请求会被拒绝。
     *     不过，设置一个合理的队列大小，也是很有讲究的。
     *     队列太大导致等待的请求太多，队列太小会导致无法充分利用系统资源、发挥最大性能。
     *
     *     循环队列的代码实现是队列的重点。关键是确定好队空和队满的判定条件。
     *
     */

}