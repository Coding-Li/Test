package cn.lijunhaoit.demo.javabasic.reflex;

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


    }
}
