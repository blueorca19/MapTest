package task_6;

import java.util.Objects;

public class Dog {

    private int age;
    private  String color;

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
