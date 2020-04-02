package 注解;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCases,Class<?> cl){

        for(Method method:cl.getDeclaredMethods()){
            UseCase us = method.getAnnotation(UseCase.class);
            System.out.println(us);
            if(us!=null){
                System.out.println("foun use case"+us.id()+"\t"+us.desc());
            }


        }
        useCases.forEach(i->System.out.println("not fund use useCase"+i));

    }

    public static void main(String[] args) {
        List<Integer> useCases = IntStream.range(47,51).boxed().collect(Collectors.toList());
        trackUseCases(useCases,PasswordUtils.class);
    }
}
