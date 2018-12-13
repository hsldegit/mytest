package com.model.factory.ordinary;

import static java.lang.System.out;

/**
 * @author huangshilu
 * @date 2018/12/12 11:00
 * @description
 */
public class MailSender implements Sender{

    public void send() {
        out.println("is MailSender");
    }

}
