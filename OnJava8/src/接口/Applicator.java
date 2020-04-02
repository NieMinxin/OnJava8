/*
 * package 接口;
 * 
 * import java.util.Arrays;
 * 
 * Applicator 可以接受任何类型的Processtor 并将其应用到一个 **Object** 对象上输出结果
 * 像本例中这样，创建一个能根据传入的参数类型从而具备不同行为的方法称为*策略*设计模式。 方法包含算法中不变的部分，策略包含变化的部分。
 * **Processor** 对象是策略
 * 
 * 
 * public class Applicator { public static void apply(Processor processor,Object
 * s) { System.out.println("Using Processor "+processor.name());
 * System.out.println(processor.process(s));
 * 
 * } public static void main(String[] args) { String s ="we are staff";
 * apply(new Upcase(), s); apply(new Downcase(), s); apply(new Splitter(), s);
 * //apply(new Filter(), s); 报错 }
 * 
 * 
 * } class Processor { public String name() { return getClass().getSimpleName();
 * }
 * 
 * public Object process(Object input) { return input; } }
 * 
 * class Upcase extends Processor { // 返回协变类型
 * 
 * @Override public String process(Object input) { return ((String)
 * input).toUpperCase(); } }
 * 
 * class Downcase extends Processor {
 * 
 * @Override public String process(Object input) { return ((String)
 * input).toLowerCase(); } }
 * 
 * class Splitter extends Processor {
 * 
 * @Override public String process(Object input) { // split() divides a String
 * return Arrays.toString(((String) input).split(" ")); } } }
 * 
 */