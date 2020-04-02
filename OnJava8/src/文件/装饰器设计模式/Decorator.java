package 文件.装饰器设计模式;

public abstract class Decorator extends Component{

    private Component component =null;
     public Decorator(Component component){
        this.component = component;
    }

    @Override
    public double cost() {
       return this.component.cost();
    }
}
