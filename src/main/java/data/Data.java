package data;

import animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static void main(String[] args) {

        String[] array = new String[5];


        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add(" ");
        list.add("World");
        list.add("!");

        System.out.println(list);

        System.out.println(list.get(0));

        list.add("Montag");
        list.add("hh-java-24-3");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

        System.out.println(list.size());
    }
}
