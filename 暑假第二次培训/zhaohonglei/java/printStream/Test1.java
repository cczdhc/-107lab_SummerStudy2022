package com.itheima.printStream;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //1.����һ����ӡ������

        //PrintStream ps = new PrintStream(new FileOutputStream("day-04/src/ps.txt"),true,"UTF-8");
        //PrintStream ps = new PrintStream(new FileOutputStream("day-04/src/ps.txt",true));
        //PrintStream ps = new PrintStream("day-04/src/ps.txt");
        PrintWriter ps = new PrintWriter("day-04/src/ps.txt");
        // ����ӡ������PrintStream������

        //
        ps.println(97);
        ps.println('a');
        ps.println(32.3);
        ps.println(true);
        ps.println("nnd");

        ps.write("��ɱ�ҵ���");
        ps.close();
    }
}
