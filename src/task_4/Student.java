package task_4;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int kurs;
    private double averageRate;
    private String gender;
    private Degree degree;

    public Student(String name, int age, int kurs, double averageRate, String gender, Degree degree) {
        this.name = name;
        this.age = age;
        this.kurs = kurs;
        this.averageRate = averageRate;
        this.gender = gender;
        this.degree = degree;
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

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(double averageRate) {
        this.averageRate = averageRate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && kurs == student.kurs && Double.compare(averageRate, student.averageRate) == 0 && Objects.equals(name, student.name) && Objects.equals(gender, student.gender) && degree == student.degree;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, kurs, averageRate, gender, degree);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kurs=" + kurs +
                ", averageRate=" + averageRate +
                ", gender='" + gender + '\'' +
                ", degree=" + degree +
                '}';
    }
}
