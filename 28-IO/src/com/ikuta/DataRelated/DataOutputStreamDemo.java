package com.ikuta.DataRelated;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DataOutputStream的创建和使用
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) {
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream("src/com/ikuta/config/dataInfo.properties"));
            byte byteSimple = 1;
            dataOutputStream.writeByte(byteSimple);
            short shortSimple = 2;
            dataOutputStream.writeShort(shortSimple);
            int intSimple = 3;
            dataOutputStream.writeInt(intSimple);
            long longSimple = 4L;
            dataOutputStream.writeLong(longSimple);
            float floatSimple = 5.0F;
            dataOutputStream.writeFloat(floatSimple);
            double doubleSimple = 6.0;
            dataOutputStream.writeDouble(doubleSimple);
            boolean booleanSimple = true;
            dataOutputStream.writeBoolean(booleanSimple);
            char charSimple = '7';
            dataOutputStream.writeChar(charSimple);
            String stringSimple = "nishino";
            dataOutputStream.writeUTF(stringSimple);

            dataOutputStream.flush();//清空管道
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataOutputStream != null) {//关闭处理流
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}