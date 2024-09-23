package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps
{
    public static void main(String[] args)
    {
        //We must override the code for getting the Key Person Object and not duplicate values
        Map<Person,Diamond> map = new HashMap<>();
        map.put(new Person("Damilia"), new Diamond("African Diamond"));
        System.out.println(new Person("Damilia").hashCode());
        System.out.println(new Person("Damilia").hashCode());
        System.out.println(map.get(new Person("Damilia")));
        maps();

    }


    private static void maps()

    {
        Map<String, String> test = Map.of("1", "3", "2", "4");
        test.forEach((string, prueba) -> System.out.println(string + " " + prueba));
        // A map can not duplicate keys
        Map<Integer, Person> map = new HashMap<>();
        map.put(56, new Person("Carlos"));
        map.put(7, new Person("Luis"));
        map.put(97, new Person("camilo"));
        map.put(45, new Person("Elkin"));
        map.put(3, new Person("yeison"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.replace(3, new Person("Maria")));
        System.out.println(map.entrySet());
        System.out.println(map.containsValue(new Person("Carlos")));
        map.forEach((key, value) -> System.out.println(key + " " + value.name));
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        System.out.println(map.getOrDefault(4, new Person("test")));
        System.out.println(map.values());
    }

    static class Person
    {
        String name;

        public Person(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(name);
        }
    }
    record Diamond(String name){}
}
