package com.ikuta.test;

import java.util.Arrays;
import java.util.Random;

//生成五个不同的随机数存放于数组中
public class RandomTest {
    /**
     * 生成随机数存放于数组中
     */
    public static void getRandom(int[] array, int bound) {
        Random random = new Random();
        int index = 0;
        while (index < array.length) {
            int number = random.nextInt(bound);
            if (!ifContain(array, number)) {
                array[index++] = number;
            }
        }
    }

    /**
     * 判断数组中是否含有指定数值
     */
    public static boolean ifContain(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {-1, -1, -1, -1, -1,};
        int bound = 5;
        getRandom(array, bound);
        System.out.println(Arrays.toString(array));
    }
}