package com.itheima.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class Test2 {
    //��ȡĳ����������ֻҪ���д�������õ�������νȨ��
    @Test
    public void getDeclaredConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //a.��һ������ȡ����
        Class c = Student.class;
        //b.��λ����������������  �����ղ�����λ�޲εĹ�������
        Constructor cons = c.getDeclaredConstructor();
        System.out.println(cons.getName() + "==>" + cons.getParameterCount());

        //����˽�й����������Ա�������
        cons.setAccessible(true);//��Ȩ��

        //�������
        Student s = (Student) cons.newInstance();
        System.out.println(s);

        //c.��λĳ���вι�����
        Constructor cons1 = c.getDeclaredConstructor(String.class, String.class, String.class, int.class);
        System.out.println(cons1.getName() + "==>" + cons1.getParameterCount());

        cons1.setAccessible(true);

        Student s1 = (Student) cons1.newInstance("����","�����ͽ","123",21);
        System.out.println(s1);
    }

}
