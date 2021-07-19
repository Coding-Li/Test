package cn.lijunhaoit.demo.javabasic.collection.set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet底层数据结构采用哈希表实现，元素无序且唯一，线程不安全，效率高，可以存储null元素，
 * 元素的唯一性是靠所存储元素类型是否重写hashCode()和equals()方法来保证的，如果没有重写这两个方法，则无法保证元素的唯一性。
 * @author lijun
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add("1st");
        h.add("2nd");
        h.add(new Integer(3));
        h.add(new Double(4.0));
        h.add("2nd");            //重复元素，未被添加
        h.add(new Integer(3));      //重复元素，未被添加
        h.add(new Date());
        System.out.println("开始：size="+h.size());
        Iterator it=h.iterator();
        while(it.hasNext())
        {
            Object o=it.next();
            System.out.println(o);
        }

        h.remove("2nd");
        System.out.println("移除元素后：size="+h.size());
        System.out.println(h);
    }
}
