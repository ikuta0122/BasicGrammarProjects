package com.ikuta.test;

import java.io.*;

/**
 * 实现拷贝目录[将目录中的所有文件拷贝至其他目录]
 */
public class FileCopyAllTest {
    public static void main(String[] args) {
        File fileIn = new File("E:\\Resources\\AVA基础的笔记\\07-IO流");
        File fileOut = new File("D:\\");
        copyAll(fileIn, fileOut);
    }

    /**
     * 拷贝目录
     *
     * @param srcFile  拷贝源
     * @param destFile 拷贝目标
     */
    private static void copyAll(File srcFile, File destFile) {
        //如果拷贝源为文件,那么递归结束开始拷贝
        if (srcFile.isFile()) {
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                in = new FileInputStream(srcFile.getAbsoluteFile());
                out = new FileOutputStream((
                        destFile.getAbsolutePath().endsWith("\\")
                                ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\")
                        + srcFile.getAbsolutePath().substring(3)
                );
                int readCount = 0;
                byte[] bytes = new byte[1024 * 1024];
                while ((readCount = in.read(bytes)) != -1) {
                    out.write(bytes, 0, readCount);
                }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }

        //如果拷贝源为目录,那么继续向下递归
        File[] files = srcFile.listFiles();//获取拷贝源的所有子文件和子目录
        for (File file : files) {
            if (file.isDirectory()) {//如果是目录，则需要对应新建目录
                String destDir = (destFile.getAbsolutePath().endsWith("\\")
                        ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\")
                        + file.getAbsolutePath().substring(3);
                File newFile = new File(destDir);
                if (!newFile.exists()) {//目录不存在，则以多重目录的方式新建目录
                    newFile.mkdirs();
                }
            }
            copyAll(file, destFile);//递归
        }
    }
}