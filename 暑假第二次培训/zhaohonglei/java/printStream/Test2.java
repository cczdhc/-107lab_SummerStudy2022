package com.itheima.printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("��ɫ��˵");
        System.out.println("hhjhhhh");//ʵ���ϵ����˴�ӡ��

        //�ı��������λ�ã����壩
        PrintStream ps = new PrintStream("day-04/src/log.txt");
        System.setOut(ps);//��ϵͳ��ӡ���ĳ��Լ��Ĵ�ӡ��
        System.out.println("��ɫ��˵S");
        System.out.println("hhjhhhhs");
        ps.close();
    }
}
