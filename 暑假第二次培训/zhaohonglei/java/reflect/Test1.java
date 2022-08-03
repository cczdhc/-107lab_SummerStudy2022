package com.itheima.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Test1 {

    //1.getConstructors:
    //��ȡȫ���Ĺ�������ֻ�ܻ�ȡpublic���εĹ�����
    //Constructor[] getConStructors()
    @Test
    public void getConstructors() {
        //a.��һ������ȡ����
        Class c = Student.class;
        //b.��ȡ���еġ�ȫ������������
        Constructor[] constructors = c.getConstructors();
        //c.����������
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
        }

    }

    //2.getDeclaredConstructors():
    //��ȡ[ȫ���Ĺ�����]��ֻҪ���д�����ﶼ���õ�������νȨ��
    @Test
    public void getDeclaredConstructors() {
        //a.��һ������ȡ����
        Class c = Student.class;
        //b.��ȡ���еġ�ȫ������������
        Constructor[] constructors = c.getDeclaredConstructors();
        //c.����������
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
        }

    }

    //3.getConStructor(Class ... parameterTypes)
    //��ȡĳ����������ֻ����public���εġ�ĳ����������
    @Test
    public void getConstructor() throws NoSuchMethodException {
        //a.��һ������ȡ����
        Class c = Student.class;
        //b.��λ����������������  �����ղ�����λ�޲εĹ�����,ֻ����public���ε�ĳ����������
        Constructor cons = c.getConstructor();
        //c.���������
        System.out.println(cons.getName() + "==>" + cons.getParameterCount());

    }

    //4.getDeclaredConstructor
    //��ȡĳ����������ֻҪ���д�������õ�������νȨ��
    @Test
    public void getDeclaredConstructor() throws NoSuchMethodException {
        //a.��һ������ȡ����
        Class c = Student.class;
        //b.��λ����������������  �����ղ�����λ�޲εĹ�������
        Constructor cons = c.getDeclaredConstructor();
        System.out.println(cons.getName() + "==>" + cons.getParameterCount());

        //c��λĳ���вι�����
        Constructor cons1 = c.getDeclaredConstructor(String.class, String.class, String.class, int.class);
        System.out.println(cons1.getName() + "==>" + cons1.getParameterCount());

    }
}
