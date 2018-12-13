package com.model.factory.ordinary;

import static java.lang.System.out;

/**
 * @author huangshilu
 * @date 2018/12/12 11:02
 * @description
 */
public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            out.println("类型输入错误");
            return null;
        }
    }
}
