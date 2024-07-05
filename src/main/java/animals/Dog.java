package animals;

public class Dog implements Animal{

    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void makeSound() {
        System.out.println("wuff");
    }
}
