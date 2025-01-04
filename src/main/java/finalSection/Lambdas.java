package finalSection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas
{
    public static void main(String[] args)
    {
        Integer number = null;
        int counter = 8;

        BiFunction<String, Integer, String> upeerCaseName = (name, age) -> {
            if (name.isBlank()) throw new IllegalStateException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        String upper = upeerCaseName.apply("alex", 20);
        System.out.println(upper);
    }
}
