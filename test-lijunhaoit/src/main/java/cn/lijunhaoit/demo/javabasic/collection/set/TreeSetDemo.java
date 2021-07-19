package cn.lijunhaoit.demo.javabasic.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet 底层数据结构采用二叉树来实现，元素唯一且已经排好序；唯一性同样需要重写hashCode和equals()方法，二叉树结构保证了元素的有序性。
 * @author lijun
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add("orange");
        ts.add("apple");
        ts.add("banana");
        ts.add("grape");

        Iterator it=ts.iterator();
        while(it.hasNext())
        {
            String fruit=(String)it.next();
            System.out.println(fruit);
        }
    }
}
