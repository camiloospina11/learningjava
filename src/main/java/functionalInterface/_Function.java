package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function
{
    public static void main(String[] args)
    {

        String n1 = "Michael";
        String n2 = new String("Michael");
        System.out.println(n1.equals(n2));
        System.out.println(n1 == n2);

        int increment = increment(5);
        System.out.println(increment);

        int incrementTwo = testIncrement.apply(5);
        System.out.println(incrementTwo);

        int biFunction= testBiFunction.apply(8, 5);
        System.out.println(biFunction);

        int multiply = multipleBy10Function.apply(incrementTwo);
        System.out.println(multiply);

        Function<Integer, Integer> testIncrementAndThenMultiple = testIncrement.andThen(multipleBy10Function);
        System.out.println(testIncrementAndThenMultiple.apply(2));

    }

    static Function<Integer, Integer> testIncrement = x-> x + 8;

    static Function<Integer, Integer> multipleBy10Function = x-> x * 10;

    static BiFunction<Integer, Integer, Integer> testBiFunction = (x, y) -> (x + 1) * (y +5);

    static int increment(int number){
        return number + 1;
    }
}
