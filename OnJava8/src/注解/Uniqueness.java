package 注解;

public @interface Uniqueness {
    Constraints CONSTRAINTS() default @Constraints(unique = true);
}
