package cn.lijunhaoit.demo.javabasic.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList：底层数据结构是数组，查询快，增删慢，线程不安全，效率高，可以存储重复元素
 * ArrayList
 * @author lijun
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        int i = 10 >> 1;
        /*
        ArrayList
        ArrayList有两个重要的属性，elementData和DEFAULT_CAPACITY，
        elementData：是一个Object数组用于保存我们向list中添加的数据
        DEFAULT_CAPACITY：初始化位数10，代表当我们new ArrayList() 的时候，实际上是初始化我们的elementData数组 大小为10
         */
        List arrayList = new ArrayList();

        /*
        初始化只能从10个开始吗？
        其实并不然，工具已经给我们了一个带参数的构造方法，这里我们创建一个初始化集合大小为1的ArrayList
         */
        List arrayListNum11 = new ArrayList(11);

        /*
        ArrayList的自增系数：
        前面我们说到了ArrayList默认的初始化一个为10的Object数组，
        那么当我们添加到第11个的时候会发生什么，我们在ArrayList的方法中可以找到grow方法，
        grow的方法给的解释为：
            增加容量，以确保它至少可以容纳由minimum capacity参数指定的元素数。
            参数：minCapacity–所需的最小容量
        同时我们去看一段代码：
            int newCapacity = oldCapacity + (oldCapacity >> 1);
        注意： (oldCapacity >> 1) 表示 右移运算，相当于 oldCapacity/2
        则我们可以确定的是：当我们添加超出原数组长度的时候，ArrayList会在原先的长度基础上增加0.5倍的数组长度
         */
        arrayList.add("add1");
        arrayList.add("add2");
        arrayList.add("add3");
        arrayList.add("add4");
        arrayList.add("add5");
//        arrayList.add("add6");
        arrayList.add(null);
        arrayList.add("add7");
        arrayList.add("add8");
        arrayList.add("add9");
        arrayList.add("add10");
//        arrayList.add("add11");
        arrayList.add(null);
        arrayList.add("add12");

        /**
         * 找到这个对象在list中最后的一个位置，
         * 这个方法还有个好玩的点：找到最后一个元素为null的位置
         */
        int indexAdd9 =  arrayList.lastIndexOf("add9");
        System.out.println("indexAdd9 : " + indexAdd9);
        int indexNull =  arrayList.lastIndexOf(null);
        System.out.println("indexNull : " + indexNull);


    }
}
