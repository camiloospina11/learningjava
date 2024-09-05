package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class WorkingWithStreams
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("Johnssss");

//Normal Execution

        names.stream()
                .filter((String name) -> name.length() > 5)
                //.map(String::length)
                //.sorted() is for fix the array according to A-Z or 0-9
                .skip(1) // ignore elements depending on the parameter number for the list
                .forEach(System.out::println);

//Parallel Execution

        // parallelStream takes less time to be executed than Stream
        names.parallelStream()
                .filter((String name) -> name.length() > 5)
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        IntStream.of(new int[] {4, 7, 1, 8, 3, 9, 7})
                .map((int j)-> j+2) // it allows us to update elements from array given a lambda
                .filter((int i) -> i > 5)
                .distinct() // it doesn't allow to duplicate values
                .forEach(System.out::println);
    }
}
