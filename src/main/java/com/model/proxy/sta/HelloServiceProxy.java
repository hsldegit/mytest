package com.model.proxy.sta;

/**
 * 静态代理和装饰器模式类似
 * @author huangshilu
 * @date 2018/12/14 15:04
 * @description
 */
public class HelloServiceProxy implements HelloService{

    private HelloService helloService;

    public HelloServiceProxy(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String hello(String name) {
        System.out.println("预处理...");
        String result = helloService.hello(name);
        System.out.println(result);
        System.out.println("后处理...");
        return result;
    }

    @Override
    public String hi(String msg) {
        System.out.println("预处理...");
        String result = helloService.hi(msg);
        System.out.println(result);
        System.out.println("后处理...");
        return result;
    }


    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        HelloServiceProxy helloServiceProxy = new HelloServiceProxy(helloService);
        helloServiceProxy.hello("Panda");
        helloServiceProxy.hi("Panda");
    }



}
