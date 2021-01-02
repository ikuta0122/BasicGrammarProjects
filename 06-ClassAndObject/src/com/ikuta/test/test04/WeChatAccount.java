package com.ikuta.test.test04;

/*
4.设计微信账号类，每个微信账号都有微信号、手机号、昵称
*/
public class WeChatAccount {
    String account;
    String mobileNumber;
    String nickname;

    public WeChatAccount() {

    }

    public WeChatAccount(String a, String b, String c) {
        account = a;
        mobileNumber = b;
        nickname = c;
    }
}