package com.itheima.d1_file;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class FileDemo6 {
    public static void main(String[] args) throws IOException {
        File demo = new File("day-03/src/demo");
        if(!demo.exists()){
            demo.mkdir();
        }
        File file = new File(demo,"raf.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        RandomAccessFile raf = new RandomAccessFile(file,"rw");

        //ָ���λ��
        System.out.println(raf.getFilePointer());

        raf.write('A');//ֻд��һ���ֽ�
        System.out.println(raf.getFilePointer());

        raf.write('B');
        System.out.println(raf.getFilePointer());

        int i = 0x7fffffff;//�������
        //��write����ÿ��ֻдһ���ֽڣ������iд��ȥҪд4��
        //������λ����д��ȥ
        raf.write(i>>>24);
        raf.write(i>>>16);
        raf.write(i>>>8);
        raf.write(i);
        System.out.println(raf.getFilePointer());
        System.out.println("i="+i);

        //����д�������
        raf.writeInt(i);
        System.out.println(raf.getFilePointer());

        String s = "��";
        byte[] gbk = s.getBytes("gbk");
        raf.write(gbk);
        System.out.println(raf.getFilePointer());
        //0
        //1
        //2
        //6
        //i=2147483647
        //10
        //12

        //���ļ�����ָ���Ƶ�ͷ��
        raf.seek(0);
        //һ���Զ�ȡ�����ļ��е����ݶ������е��ֽ�������
        byte[] buf = new byte[(int)raf.length()];
        raf.read(buf);
        //[65, 66, 127, -1, -1, -1, 127, -1, -1, -1, -42, -48]

        System.out.print(Arrays.toString(buf));
        String s1 = new String(buf,"gbk");
        System.out.println(s1);
        for (byte b:buf){
            System.out.println(Integer.toHexString(b&0xff)+" ");
        }
        raf.close();
    }
}
