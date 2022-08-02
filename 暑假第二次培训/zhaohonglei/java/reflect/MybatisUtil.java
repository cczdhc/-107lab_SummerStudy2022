package com.itheima.reflect;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MybatisUtil {
    /**
     * �����������͵Ķ���
     */
    public static void save(Object obj) {

        try (
                PrintStream ps = new PrintStream(new FileOutputStream("day-05/src/data.txt", true));
        ) {

            //1.�ṩ��������ȫ����Ա������ֻ�з�����Խ��
            // obj.getSimpleName()��ȡ��ǰ����
            // obj.getClass()     ��ȡ���� + ����
            Class c = obj.getClass();

            ps.println("===============" + c.getSimpleName() + "==========");

            //2.��ȡ����ȫ����Ա����
            Field[] fields = c.getDeclaredFields();
            //3.��ȡ��Ա��������Ϣ
            for (Field field : fields) {
                String name = field.getName();
                //��ȡ����Ա������obj�����е�ֵ��ȡֵ��;

                field.setAccessible(true);
                //ǿתString�ڴ�ʱ����ȡ����double
                String value = field.get(obj) + "";
                ps.println(name + "=" + value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
