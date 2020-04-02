package 文件.装饰器设计模式;

public  class ConcreteComponent extends Component{
    //基础价格
    @Override
    public double cost() {
        return 2.5;
    }
}
