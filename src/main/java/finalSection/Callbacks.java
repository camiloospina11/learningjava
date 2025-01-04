package finalSection;


import java.util.function.Consumer;

public class Callbacks
{
    public static void main(String[] args)
    {
        hello("jhon", null, consumer ->
                System.out.println("Last name not provided " + consumer) );

        helloTwo("jhon", null, () ->
                System.out.println("Last name not provided " ) );
    }
    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void helloTwo(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}
