package streams;

import java.util.List;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;


public class _Stream
{
    public static void main(String[] args)
    {
        List<Person> people = List.of(
                new Person("Carlos", MALE),
                new Person("Juana", FEMALE),
                new Person("Luisa", FEMALE),
                new Person("Luisa", FEMALE),
                new Person("Jhon", MALE)
        );

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
//                .collect(Collectors.toSet())
                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> person.gender.equals(FEMALE));
        System.out.println(containsOnlyFemales);

        boolean containsAtLeastOneMales = people.stream()
                .anyMatch(person -> person.gender.equals(MALE));
        System.out.println(containsAtLeastOneMales);

        boolean containsNoOneFemalesOrMales = people.stream()
                .noneMatch(person -> person.gender.equals(PREFER_NOT_TO_SAY));
        System.out.println(containsNoOneFemalesOrMales);



    }
    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender)
        {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString()
        {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
