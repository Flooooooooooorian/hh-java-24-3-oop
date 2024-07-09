package human.record;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human("Florian", 27, "18.07.1996");
        Human h2 = new Human("Florian", 27, "18.07.1996");

        System.out.println(h1);
        System.out.println(h1.name());
        System.out.println(h1.birthday());

        System.out.println(h1.equals(h2));

        Human copy = new Human("Max", h1.age(), h1.birthday());

        System.out.println(h1);
        System.out.println(copy);
    }
}
