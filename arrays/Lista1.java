package arrays;

import java.util.ArrayList;
import java.util.List;

public class Lista1
{
    public static void main(String[] args)
    {
        List<Integer> listNums = new ArrayList<>();
        listNums.add(1);
        listNums.add(2);
        listNums.add(3);
        listNums.add(4);
        listNums.add(5);

        listNums.forEach(System.out::println);

        List<String> names = new ArrayList<>();
        names.add("Anderson");
        names.add("Jhully");
        names.add("Marli");
        names.add("César");
        names.add(2, "Kessey");

        System.out.println();
        names.forEach(System.out::println);

        names.remove(1);

        names.forEach(System.out::println);


    }
}
