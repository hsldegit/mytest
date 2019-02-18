package com.model.proxy.dyn;

import com.model.proxy.sta.HelloService;
import com.model.proxy.sta.HelloServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * JDK动态代理所用到的代理类在程序调用到代理类对象时才由JVM真正创建，
 * JVM根据传进来的 业务实现类对象 以及 方法名 ，
 * 动态地创建了一个代理类的class文件并被字节码引擎执行，然后通过该代理类对象进行方法调用。
 * @author huangshilu
 * @date 2018/12/14 15:14
 * @description
 */
public class MyInvocationHandler implements InvocationHandler {

    //持有对象
    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 增强逻辑
        System.out.println("PROXY : " + proxy.getClass().getName());

        // 反射调用，目标方法
        Object result = method.invoke(object, args);

        // 增强逻辑
        System.out.println(method.getName() + " : " + result);
        return result;
    }


    public static void main(String[] args) throws Exception {
        HelloService helloService = new HelloServiceImpl();
//        // 生成代理类的class对象
//        Class clazz = Proxy.getProxyClass(helloService.getClass().getClassLoader(), hello Service
//                .getClass().getInterfaces());
//        // 创建InvocationHandler
//        InvocationHandler myInvocationHandler = new MyInvocationHandler(helloService);
//        // 获取代理类的构造器对象
//        Constructor constructor = clazz.getConstructor(new Class[]{InvocationHandler.class});
//        // 反射创建代理对象
//        HelloService proxy = (HelloService) constructor.newInstance(myInvocationHandler);


        HelloService proxy = (HelloService)Proxy.newProxyInstance(HelloService.class.getClassLoader(),
                helloService.getClass().getInterfaces(), new MyInvocationHandler(helloService));

        proxy.hello("huang");

    }
}
