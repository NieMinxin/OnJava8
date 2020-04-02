package 注解;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class RunTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class run = Class.forName(RunMethod.class.getName());
        for(Method method:run.getDeclaredMethods()){
            if(method.isAnnotationPresent(Test.class)){
                System.out.println(method.getName());
                Parameter [] parameters = method.getParameters();
                try {
                    method.invoke(run.newInstance(),parameters);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    Throwable throwable = e.getCause();
                    System.out.println("filed"+throwable);
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
