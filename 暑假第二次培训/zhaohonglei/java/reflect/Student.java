package com.itheima.reflect;

import java.io.Serializable;

/**
 * ����Ҫ���л���Ҫʵ��Serializable�ӿ�
 */
public class Student implements Serializable {
    //�������л��еİ汾����
    //���л��İ汾���뷴���л��İ汾��һ�²Ų��ᱨ��
    private static final long serialVersionUID = 1;
    public static final String NAME = "�й�";
    private static String loginName;
    private transient String passWord;
    private int age;

    public Student() {
        System.out.println("�޲ι�����");
    }

    private Student( String loginName, String passWord, int age) {
        System.out.println("�вι�����");
        this.loginName = loginName;
        this.passWord = passWord;
        this.age = age;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "student{"+
                "name='" + NAME + '\''+
                ",loginName='" + loginName + '\''+
                ",passWord='" + passWord + '\''+
                ",age='" + age +
                '}';
    }
}
