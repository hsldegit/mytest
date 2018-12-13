package com.model.factory.ordinary;

import static java.lang.System.out;

/**
 * @author huangshilu
 * @date 2018/12/12 11:01
 * @description
 */
public class SmsSender implements Sender {
    public void send() {
        out.println("is SmsSender");
    }
}
