package 集合;

import 内部类与控制框架.Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01 {
    int a =10;

    @Override
    public String toString() {
        return "Demo01{" +
                "a=" + a +
                '}';
    }

    class Inner{
        int i=0;
       public Demo01 getOutter(){
           System.out.println(Demo01.this.a);
           return  Demo01.this;
       }
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        Demo01.Inner inner = demo01.new Inner();
        Demo01 demo02 = inner.getOutter();
        System.out.println(demo02);
    }

}
