package com.itheima.reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class Test3 {
    /*
    1.��ȡȫ���ĳ�Ա����
    Field[] getDeclaredFields();
    ������еĳ�Ա������Ӧ��Field����ֻҪ�����˾Ϳ����õ�
     */
    @Test
    public void getDeclaredFields(){
        //a.��λClass����
        Class c = Student.class;
        //b.��λȫ����Ա����
        Field[] fields = c.getDeclaredFields();
        //c.����һ��
        for (Field field : fields) {
            System.out.println(field.getName() + "==>"+field.getType());
        }
    }

    @Test
    public void getDeclaredField() throws NoSuchFieldException, IllegalAccessException {
        //a.��λClass����
        Class c = Student.class;
        //b.�������ƶ�λĳ����Ա����
        Field f = c.getDeclaredField("age");
        System.out.println(f.getName()+ "==>" + f.getType());

        f.setAccessible(true);

        //c.��ֵ
        Student s = new Student();
        f.set(s,18);//s.setAge(18);
        System.out.println(s);

        //d.ȡֵ
        int age = (int)f.get(s);

        System.out.println(age);
    }
}
