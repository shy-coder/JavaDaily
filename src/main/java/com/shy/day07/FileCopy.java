package com.shy.day07;

import java.io.*;

/**
 * @ClassName FileCopy
 * @Description TODO
 * @Author shy
 * @Date 2020/10/26
 **/
public class FileCopy {
    public static void main(String[] args) throws IOException {
        //创建一个文件File对象，注意需要显示抛出异常（IOException是编译时异常)
        //可以用try catch捕获，也可以在方法签名处使用 throws抛出
        File inputFile = new File("C:/Users/shy/Desktop/shy1.png");
        //创建一个字节输入流，此处有上型对象
        InputStream is = new FileInputStream(inputFile);
        //准备和文件大小一致的数组
        byte[] b = new byte[(int) inputFile.length()];
        is.read(b);
        //准备输出文件对象
        File outputFile = new File("C:/Users/shy/Desktop/shy111.png");
        OutputStream os = new FileOutputStream(outputFile);
        os.write(b);
        is.close();
        os.close();
    }
}
