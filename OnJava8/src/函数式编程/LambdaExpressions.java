package 函数式编程;

interface  Description{
    String brief();
}
interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArg(String head, Double d);
}
public class LambdaExpressions {
    static Body body = head -> head+"hello";
    static Body body1 = (h) -> h + " More details";
    static Description description = () -> "shrot info";
    static Multi mult = (h, n) -> h + n;
    static Description moreLines = () -> { // [5]
        System.out.println("moreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(body.detailed("hello\t"));
        System.out.println(body1.detailed("Hi"));
        System.out.println(description.brief());
        System.out.println(mult.twoArg("Pi! ", 3.14159));
        System.out.println(moreLines.brief());

    }

}
