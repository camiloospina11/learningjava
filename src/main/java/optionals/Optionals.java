package optionals;

import java.util.Optional;

public class Optionals
{
    public static void main(String[] args)
    {
        Object value = Optional.ofNullable("hello")
                .orElseGet(() -> "world");
        System.out.println(value);

        // orElse or orElseThrow first validates if the optional is null, then execute the method if necessary
        Object valueTwo = Optional.ofNullable("hello")
                .orElseThrow(() ->new IllegalStateException("The values is null"));
        System.out.println(valueTwo);

        Optional.ofNullable("daniel@gmail.com")
                .ifPresent(email -> System.out.println("sending message to: " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("sending message to: " + email),
                        () ->
                            System.out.println("Cannot send email"));

    }
}
