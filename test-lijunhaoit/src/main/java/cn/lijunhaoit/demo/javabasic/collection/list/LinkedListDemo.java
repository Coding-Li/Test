package cn.lijunhaoit.demo.javabasic.collection.list;

import java.util.LinkedList;

/**
 * LinkedList 底层数据结构是链表，查询慢，增删快，线程不安全，效率高，可以存储重复元素
 * 实现了List列表接口，Deque双端队列接口,同时也给出了堆栈方法，push(),pop(),peek()
 * 这个对象的结构就有趣了,他的特性在找头部数据和尾部数据，
 *
 *
 * @author lijun
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //创建一个双线链表
        LinkedList linkedList = new LinkedList();

        //从头插入一条数据
        linkedList.addFirst("first");

        //从列表头上取一条数据
        String first = String.valueOf(linkedList.getFirst());
        System.out.println("first: "+first);

        //从末尾插入一条数据
        linkedList.addLast("last");

        //从末尾取一条数据
        String last = String.valueOf(linkedList.getLast());
        System.out.println("last: "+last);

    }
}
