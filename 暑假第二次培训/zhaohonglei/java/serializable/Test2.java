package com.itheima.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.���������ֽ��������ܵ���װ�ͼ����ֽ��������ܵ�
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("day-04/src/object.txt"));

        //2.���ö����ֽ��������ķ����л�����
        Student s = (Student)is.readObject();

        System.out.println(s);

        //3.�ر���
        is.close();
    }
}
