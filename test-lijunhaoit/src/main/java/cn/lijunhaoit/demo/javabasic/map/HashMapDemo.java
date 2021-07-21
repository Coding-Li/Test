package cn.lijunhaoit.demo.javabasic.map;


import java.util.HashMap;

/**
 * HashMap由数组+链表组成的
 * 数据存储数据
 * 链表：解决hash冲突的一种办法，链地址法又叫拉链法
 * 当链长大于8的时候转为红黑树
 * 初始化16个，自增因子0.75
 * @author lijun
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //创建一个HashMap
        HashMap hashMap = new HashMap();
        //塞入一个数据
        hashMap.put("aaa","aaaa");

        //通过key取出数据
        hashMap.get("aaa");

    }
}
