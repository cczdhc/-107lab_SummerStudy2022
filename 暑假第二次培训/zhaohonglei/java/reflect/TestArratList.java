package com.itheima.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestArratList {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //���󣺷���ʵ�ַ��Ͳ����󣬼����������͵�Ԫ��
        ArrayList<String> lists = new ArrayList<>();
        ArrayList<Integer> lists2 = new ArrayList<>();

        //����.getClass()�ļ�
        System.out.println(lists.getClass());
        System.out.println(lists2.getClass());

        System.out.println(lists2.getClass() == lists.getClass());
        //class java.util.ArrayList
        //class java.util.ArrayList
        //true

        System.out.println("------------------");
        //public boolean  add(E e);
        lists2.add(23);
        lists2.add(22);
        //lists2.add("chao");����

        Class c = lists2.getClass();
        //��λc���е�add����
        Method add = c.getDeclaredMethod("add",Object.class);

        boolean rs = (boolean) add.invoke(lists2,"����");
        System.out.println(rs);
        System.out.println(lists2);
        //true
        //[23, 22, ����]
    }
}
