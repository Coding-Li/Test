package cn.lijunhaoit.demo.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * List是最基础的集合，一种有序列表
 * ArrayList，LinkList
 * @author lijun
 */
public class ListDemo {
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
        其实并不然，工具已经给我们了一个带参数的构造方法，这里我们创建一个初始化集合大小为11的ArrayList
         */
        List arrayListNum11 = new ArrayList(11);

        //LinkedList
        List linkedList = new LinkedList();

        //ArrayList在末尾添加一个
        arrayList.add("addOne");
    }
}
