package dataStructures;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class MapExercise
{
    static class Person
    {
        String gender;
        String name;

        public Person(String gender, String name)
        {
            this.gender = gender;
            this.name = name;
        }

        @Override
        public String toString()
        {
            return "Person{" +
                    "gender='" + gender + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args)
    {
        List<Person> person = Arrays.asList(
                new Person("M", "Carlos"),
                new Person("F", "Julia"),
                new Person("F", "Juana"),
                new Person("M", "Karl")
        );

        System.out.println(groupMapByGender(person));

        Map<String, List<Person>> collect = person
                .stream()
                .collect(groupingBy(persona -> persona.gender, mapping(persona -> persona, Collectors.toList())));
        System.out.println(collect);

    }

    public static Map<String, List<String>> groupMapByGender(List<Person> personas) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> personasList;
        for (Person persona : personas) {
            if (map.containsKey(persona.gender)) {
                List<String> strings = map.get(persona.gender);
                strings.add(persona.name);
                map.put(persona.gender, strings);
            } else {
                personasList = new ArrayList<>();
                personasList.add(persona.name);
                map.put(persona.gender, personasList);
            }
        }
        return map;
    }


}
