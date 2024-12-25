package streams;

public class WorkingWithOptionals
{
    public static void main(String[] args)
    {
        person person = new person("daniel", null);
        System.out.println(person.getEmail().map(String::toLowerCase).orElse("email not provided"));

    }
}

