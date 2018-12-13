package com.model.factory.abstractmodel;

import com.model.factory.ordinary.Sender;

/**
 * @author huangshilu
 * @date 2018/12/12 11:13
 * @description
 */
public interface Provider {
    Sender produce();
}
