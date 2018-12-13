package com.model.factory.staticmodel;

import com.model.factory.ordinary.MailSender;
import com.model.factory.ordinary.Sender;
import com.model.factory.ordinary.SmsSender;

/**
 * @author huangshilu
 * @date 2018/12/12 11:08
 * @description
 */
public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }

}
