package 文件.装饰器设计模式;

public  class ConcreteDecorator extends Decorator{
    private double price =5.0;
    public ConcreteDecorator(Component component) {
        super(component);
    }
    //定义装饰逻辑

    @Override
    public double cost() {
        return super.cost()+price;
    }
}
