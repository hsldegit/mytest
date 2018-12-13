package com.model.strategy;

/**
 * 需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口 。
 * 设计一个抽象类(可有可无，属于辅助类)，提供辅助函数。
 * 策略模式的决定权在用户，系统本身提供不同的算法实现，新增或者删除算法，对各种算法做封装。
 */
public interface ICalculator {

    int calculator(String exp);

}
