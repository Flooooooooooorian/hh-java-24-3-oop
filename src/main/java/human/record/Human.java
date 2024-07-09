package human.record;

public record Human(
        String name,
        int age,
        String birthday) {

    public static int humanAge;

    public void print() {
        System.out.println("Hello");
    }
}
