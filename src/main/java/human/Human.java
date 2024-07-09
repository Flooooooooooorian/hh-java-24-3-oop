package human;

import java.util.Objects;

public class Human {
    public static int humanAge = 0;
    public static final int VOLLJAHRIG = 18;

    private String name;
    private int age = 0;
    private final String birthDay;

    public Human() {
        this.birthDay = "01.01.";
    }

    public Human(String name, int age, String birthDay) {
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthDay() {
        return birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Human{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}
