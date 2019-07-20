package cn.javastudy.io;

import java.io.*;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        OutputStreamWriter osf = new FileWriter(file,true);
        String str = "小河流水哗啦啦，村花到我家！";
        osf.write(str);
        osf.close();
        System.out.println(file.getAbsolutePath());
    }
}
