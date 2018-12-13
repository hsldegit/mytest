package com.model.factory.abstractmodel;

import com.model.factory.ordinary.Sender;
import com.model.factory.ordinary.SmsSender;

/**
 * @author huangshilu
 * @date 2018/12/12 11:15
 * @description
 */
public class SendSmsFactory implements Provider{

    public Sender produce() {
        return new SmsSender();
    }
}
