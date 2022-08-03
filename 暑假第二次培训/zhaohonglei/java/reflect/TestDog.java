package com.itheima.reflect;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDog {
    /*
    ��ȡ���е����г�Ա��������
     */
    @Test
    public void getDeclaredMethods(){
        //a.��ȡ�����
        Class c = Dog.class;
        //b.��ȡȫ������������˽�е�
        Method[] methods = c.getDeclaredMethods();

        //c.����ȫ������
        for (Method method : methods) {
            System.out.println(method.getName() + "����ֵ���ͣ�"+ method.getReturnType() + "����ֵ����������" + method.getParameterCount());
        }
    }
    //getName����ֵ���ͣ�class java.lang.String����ֵ������0
    //run����ֵ���ͣ�void����ֵ������0
    //setName����ֵ���ͣ�void����ֵ������1
    //eat����ֵ���ͣ�void����ֵ������0
    //eat����ֵ���ͣ�class java.lang.String����ֵ������1
    //inAddr����ֵ���ͣ�void����ֵ������0

    /**
     * 2.��ȡ������������
     */
    @Test
    public void getDeclaredMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //a.��ȡ�����
        Class c = Dog.class;
        //b.��ȡ������������
        Method m = c.getDeclaredMethod("eat");//�޲�
        Method m2 = c.getDeclaredMethod("eat",String.class);

        //������Ȩ��
        m.setAccessible(true);
        m2.setAccessible(true);

        //c.����������ִ��
        Dog d = new Dog();
        //�����޽������null
        Object result = m.invoke(d);
        System.out.println(result);

        Object result2 = m2.invoke(d,"��ͷ");
        System.out.println(result2);
        //eat meat
        //null
        //dog eat��ͷ
        //dog eat it happily
    }
}
