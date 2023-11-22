package task_6;

import java.util.Objects;

public class Cat {
    private int age;
    private String color;

    public Cat(int age, String color) {
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
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
