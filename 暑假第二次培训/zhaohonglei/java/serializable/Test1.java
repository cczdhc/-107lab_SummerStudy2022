package com.itheima.serializable;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //1.����һ��ѧ������
        Student s = new Student("����","chenlei","12345",21);

        //2.�������л���ʹ�ö����ֽ����������װ�ֽ�������ܵ���
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day-04/src/object.txt"));

        //3.ֱ�ӵ������л�����
        oos.writeObject(s);

        //4.�ͷ���Դ
        oos.close();

    }
}
