package cn.lijunhaoit.demo.javabasic.reflex;

import sun.reflect.misc.ReflectUtil;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 谈到反射第一个想到的就是Object对象和java.lang.Class对象
 * @author lijun
 */
public class ClassDemo {
    public static void main(String[] args) {
        //第一种获取方法,通过class静态变量获取
        Class clazz = String.class;

        //第二种获取方法，通过对象的getClass()方法获取
        String s = "Hello";
        Class clazzGetClass = s.getClass();

        //第三种获取方法，通过Class.forName()获取,同时可能会报一个ClassNotFound的异常
        try {
            Class clazzForName = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class clazzNew = HashMap.class;
        Field[] fields = clazzNew.getDeclaredFields();
        for(Field field:fields){
            System.out.println("field = " + field.getName()+","+ field.getType());
        }
    }
}
