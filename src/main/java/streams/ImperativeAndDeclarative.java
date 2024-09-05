package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static streams.ImperativeAndDeclarative.Gender.*;

public class ImperativeAndDeclarative
{
    public static void main(String[] args)
    {
        List<Person> people = List.of(
                new Person("Carlos", MALE),
                new Person("Juana", FEMALE),
                new Person("Luisa", FEMALE),
                new Person("Karla", FEMALE),
                new Person("Jhon", MALE)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female: females
             )
        {
            System.out.println(female);
        }
        System.out.println(females.get(0)==females.get(0));
        System.out.println(females.get(0).equals(females.get(0)));
        // declarative approach
//        Predicate<Person> personPredicate = x-> x.gender.equals(FEMALE);
//        System.out.println("declarative");
        people.stream()
                .filter(x-> x.gender.equals(FEMALE))
                .forEach(System.out::println);

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
        MALE, FEMALE
    }
}
