package Refelect;

public class Demo02 {
    static {
        System.out.println("初始化");
    }
    public static void main(String[] args) {

        System.out.println(args.length);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        Class c = null;
        try {
            c = Class.forName("Refelect.Demo02",false,classLoader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("类的名称:" + c.getName());
        System.out.println("是否为接口:" + c.isInterface());
        System.out.println("是否为基本类型:" + c.isPrimitive());
        System.out.println("是否为数组:" + c.isArray());
        System.out.println("父类名称:" + c.getSuperclass().getName());
    }

}
