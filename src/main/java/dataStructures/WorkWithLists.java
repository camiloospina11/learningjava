package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class WorkWithLists
{
    public static void main(String[] args)
    {
        // this kind of list is unmodifiable
        List<String> colorsUnmodifiable = List.of(
                "yellow",
                "white",
                "test"
        );
        System.out.println(colorsUnmodifiable);

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("black");
        for (String color: colors
             )
        {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }

    }
}
