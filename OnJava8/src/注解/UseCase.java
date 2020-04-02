package 注解;

public @interface UseCase {
    int id();
    String desc() default "hello";
}
