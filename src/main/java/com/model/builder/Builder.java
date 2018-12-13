package com.model.builder;

import com.model.factory.ordinary.MailSender;
import com.model.factory.ordinary.Sender;
import com.model.factory.ordinary.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangshilu
 * @date 2018/12/12 11:24
 * @description
 */
public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }


}
