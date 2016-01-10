package com.chebao;

import java.io.File;
import java.util.logging.FileHandler;

/**
 * 设置文件属性
 *
 */

public class Main {

    public static void main(String[] args) {

        File file = new File("test.txt");

        if (file.exists()) {
            //把文件设定为可写
            file.setWritable(true);
            //把文件设定为可读
            file.setReadable(true);
            //把文件设定为只读
            file.setReadOnly();
        }
    }
}
