package com.ikuta.controlstatements.test.test04;

/*
6.篮球从5米高的地方掉下来，每次弹起的高度为原来的30%，
经过几次，球弹起高度小于0.1米。
弹起高度 = 原来高度 * 0.3
弹起高度 * 10/3 = 原来高度
*/
public class homework4_6 {
    public static void main(String[] args) {
        double height = 5.0;//球高度
        for (int i = 1; ; i++) {
            height *= 0.3;
            if (height <= 0.1) {
                System.out.println(i);
                break;
            }
        }
    }
}