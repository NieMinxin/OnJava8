package 函数式编程;
interface  MakeNoArgs{
    Dog make();
}
interface  Make1Arg{
    Dog make(String nm);
}
interface  Make2Arg{
    Dog make(String nm,int yrs);
}
class Dog{
    String name;
    int age = -1; // For "unknown"
    Dog() { name = "stray"; }
    Dog(String nm) { name = nm; }
    Dog(String nm, int yrs) { name = nm; age = yrs; }
}
public class CtorReference  {
    public static void main(String[] args) {
        MakeNoArgs makeNoArgs = Dog::new;
        Make1Arg make1Arg =Dog::new;
        Make2Arg make2Arg = Dog::new;
        Dog dog = makeNoArgs.make();
        Dog dog1 = make1Arg.make("jack");
        Dog dog2 =make2Arg.make("ellen",2);

    }
}
