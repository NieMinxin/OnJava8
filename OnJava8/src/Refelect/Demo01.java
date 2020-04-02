package Refelect;

import sun.rmi.runtime.Log;

public class Demo01 {
    public static void main(String[] args) {
        try {
            Class demo = Class.forName("Refelect.SuperClass");
            Object obj = demo.newInstance();
           System.out.println();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
