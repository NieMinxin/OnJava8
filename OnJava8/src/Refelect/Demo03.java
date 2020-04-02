package Refelect;

import 注解.Test;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        Class c = User.class;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try {
            classLoader.loadClass("Refelect.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("包信息package:" + c.getPackage());
        System.out.println("类修饰符modifier:" + c.getModifiers());
        System.out.println("构造方法constructor:");
        Arrays.stream(c.getDeclaredConstructors()).forEach(System.out::println);
        System.out.println("成员变量fields:");
        Arrays.stream(c.getDeclaredFields()).forEach(System.out::println);
        System.out.println(System.getProperty("sun.boot.library.path"));

    }
}
