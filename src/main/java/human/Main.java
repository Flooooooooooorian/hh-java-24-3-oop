package human;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human("Florian", 27, "20.3.");
        Human h2 = new Human();


        h1.setAge(1);
        h2.setAge(1);

        h1.setAge(h1.getAge() + 1);
        h2.setAge(h2.getAge() + 1);

        h1.humanAge = h1.humanAge + 1;
        h2.humanAge = h2.humanAge + 1;

        System.out.println(h1.getAge());
        System.out.println(h2.getAge());
        System.out.println(Human.humanAge);
        System.out.println(Human.humanAge);


        System.out.println(Human.humanAge);

    }
}
