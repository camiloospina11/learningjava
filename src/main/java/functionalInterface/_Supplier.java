package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier
{
    public static void main(String[] args)
    {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static String getDBConnectionUrl(){
        return "jbbc;//localhost:5432/user";
    }

    static Supplier<List<String>> getDBConnectionUrlSupplier = ()-> List.of("jbbc;//localhost:5432/user", "Another one thing that I want to return");
}
