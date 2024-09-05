package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Predicate
{
    public static void main(String[] args)
    {
        System.out.println(isPhoneNumberValid("0700000"));
        System.out.println(isPhoneNumberValid("0900000"));
        System.out.println(isPhoneValidatePredicate.test("0700000"));

        List<String> numbers = Arrays.asList("0700000", "0700000", "045666", "00456");
        numbers.stream()
                .filter(x-> x.startsWith("07") && x.length() == 7)
                .forEach(System.out::println);

        // method .and works like concatenation between methods
        boolean testAnd= isPhoneValidatePredicate.and(constainsNumber3).test("0703405");
        System.out.println("Test with and: "+testAnd);

        boolean testOr= isPhoneValidatePredicate.or(constainsNumber3).test("0403405");
        System.out.println("Test with Or: "+testOr);
    }

    // Imperative
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 7;
    }

    // Declarative
    static Predicate<String> isPhoneValidatePredicate = phone-> phone.startsWith("07") && phone.length() == 7;

    static Predicate<String> constainsNumber3 = x-> x.contains("3");
}
