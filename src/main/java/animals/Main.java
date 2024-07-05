package animals;

import vererbung.Car;

public class Main {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.makeSound();
        c1.makeSound();

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();

        Dog d2 = new Dog();

        d2.hello();

        animal(new Cat());

    }

    public static void animal(Animal a) {
        a.makeSound();
    }
}
