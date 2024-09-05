package streams;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DifferentStreamMethods
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        List<String> first3Names = names.stream().limit(3).collect(Collectors.toList()); // return a list o set

        System.out.println(first3Names);

        long noOfBigNames = names.stream().filter((String name) -> name.length() > 5).count(); // Count values from the list

        System.out.println(noOfBigNames);

        int sum = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).reduce(0, (a, b) -> a+b); // sum all the values
        System.out.println(sum);

        OptionalInt sumtwo = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).reduce((a, b) -> a+b); // sum all the values and return an optionalInt
        System.out.println(sumtwo);

        // is for fix the array according to A-Z or 0-9
        names.stream()
                .sorted((String name1, String name2) -> name1.length() - name2.length())
                .forEach(System.out::println);

        if(names.stream().anyMatch((String name) -> name.equals("John")))
        {
            System.out.println("Yes... John exist");
        }

        if(names.stream().noneMatch((String name) -> name.length() == 2))
        {
            System.out.println("There is no two letter name");
        }

        Optional<String> firstElement = Stream.of("First", "Second", "Third", "Fourth").findFirst();
        System.out.println(firstElement);

        Optional<String> anyElement = Stream.of("First", "Second", "Third", "Fourth").findAny();
        System.out.println(anyElement);

        Object[] streamArray = names.stream().limit(3).toArray();

        System.out.println(Arrays.toString(streamArray));

        names.stream()
                .filter(name -> name.length() > 5)
                .peek(e -> System.out.println("Filtered Name :"+e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped Name :"+e))
                .toArray();

        OptionalInt min = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).min();
        System.out.println(min);

        OptionalInt max = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).max();
        System.out.println(max);

        List<Integer> numbers = Arrays.asList(4, 2, 8, 9, 5, 6, 7);
        numbers.stream().filter(i -> i > 5).limit(3).forEach(System.out::println);

    }
}
