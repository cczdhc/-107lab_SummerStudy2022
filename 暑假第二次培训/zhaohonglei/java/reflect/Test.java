package com.itheima.reflect;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class���е�һ����̬������forName(ȫ�޶���������+����)
        Class c = Class.forName("com.itheima.reflect.Student");
        System.out.println(c);

        //2.����.class
        Class c1 = Student.class;
        System.out.println(c1);

        //3.����.getClass()
//        Student s = new Student();
//        Class c2 = s.getClass();
//        System.out.println(c2);

    }
}
