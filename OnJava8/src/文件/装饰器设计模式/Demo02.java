package 文件.装饰器设计模式;

public class Demo02 {
    public static void main(String[] args) {
        Component component = new ConcreteComponent() {
            @Override
            public double cost() {
                return super.cost();
            }
        };
        System.out.println(component.cost());



    }
}
