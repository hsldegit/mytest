package com.model.factory.abstractmodel;

import com.model.factory.ordinary.MailSender;
import com.model.factory.ordinary.Sender;

/**
 * @author huangshilu
 * @date 2018/12/12 11:16
 * @description
 */
public class SendMailFactory implements Provider {
    public Sender produce() {
        return new MailSender();
    }
}
