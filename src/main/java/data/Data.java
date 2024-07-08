package data;


import animals.Animal;
import animals.Cat;
import animals.Dog;

import java.util.*;

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


        Map<String, Animal> map = new HashMap<>();

        Animal a1 = new Cat();

        map.put("KeyAnimalA", a1);
        map.put("KeyAnimalB", a1);
        map.put("KeyAnimalA", new Dog());

        map.put("Animal2", new Dog());
        map.put("123", new Cat());

        System.out.println(map);

        System.out.println(map.get("KeyAnimalB"));


        Set<String> set = new HashSet<>();

        set.add("Hallo");
        set.add(" ");
        set.add("World");
        set.add("!");
        set.add("!");
        set.add("!");
        set.add("!");
        set.add("!");

        System.out.println(set);
    }
}
