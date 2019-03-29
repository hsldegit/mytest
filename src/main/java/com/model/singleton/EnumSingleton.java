package com.model.singleton;

/**
 * @author huangshilu
 * @date 2019/3/29 17:49
 * @description
 */
public enum  EnumSingleton {

    INSTANCE;

    public EnumSingleton getInstance(){
        return INSTANCE;
    }

    private  String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.setContent("aaa");
        System.out.println(enumSingleton.getContent());

        EnumSingleton enumSingleton1= EnumSingleton.INSTANCE;
        enumSingleton1.setContent("bbb");
        System.out.println(enumSingleton1.getContent());
        System.out.println(enumSingleton.getContent());

    }



}
