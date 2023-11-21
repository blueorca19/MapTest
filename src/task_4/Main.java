package task_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Станислав", 25, 3, 4.76, "Male", Degree.MASTER));
        students.add(new Student("Анна", 24, 2, 2.15, "Female", Degree.MASTER));
        students.add(new Student("Анатолий", 18, 1, 3.86, "Male", Degree.BACHELOR));
        students.add(new Student("Алексей", 26, 4, 3.98, "Male", Degree.MASTER));
        students.add(new Student("Тарас", 22, 2, 5.00, "Male", Degree.BACHELOR));
        students.add(new Student("Богдан", 24, 3, 4.91, "Male", Degree.MASTER));
        students.add(new Student("Мирослава", 29, 5, 3.16, "Female", Degree.BACHELOR));
        students.add(new Student("Мария", 20, 2, 2.98, "Female", Degree.BACHELOR));

        System.out.println("Список всех студентов");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        //Фильтруем студентов курс и балл
        // Курс >=3, балл >=4
        System.out.println("Фильтруем студентов по курсу и баллу");
        StudentService.printStudents(students, new FirstStudentFilter());
        System.out.println();


        //Возраст и степень
        //старше 23 лет и магистр
        System.out.println("Фильтруем студентов по возрасту и степени");
        StudentService.printStudents(students, new SecondStudentFilter());
        System.out.println();
        //Имя и курс
        //имя длиннее 6 символов и нечетный курс

        System.out.println("Фильтруем студентов по имени и курсу");


        StudentService.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getName().length() > 6 && student.getKurs() % 2 != 0; //остаток от деления не равен нулю
            }
        });
        System.out.println();
        // Имя и возраст
        // имя начинается с А и возраст более 23 лет
        System.out.println("Фильтруем студентов по имени и возрасту");
        StudentService.printStudents(students, x -> x.getName().startsWith("А") && x.getAge() >= 23);
        System.out.println();

        //Фильтруем студентов по возрасту и полу
        // возраст от 18 до 23 и женский пол
        System.out.println("Фильтруем студентов по возрасту и полу");
        StudentService.printStudents(students, new ThirdStudentFilter());
        System.out.println();

        //Фильтруем студентов по курсу и полу
        // 3 курс и мужской пол
        System.out.println("Фильтруем студентов по курсу и полу");
        StudentService.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getKurs() == 3 && student.getGender().equals("Male");
            }
        });
        //Фильтруем студентов по полу и степени
        // бакалавры женского пола
        System.out.println("Фильтруем студентов по полу и степени");
        StudentService.printStudents(students, y -> y.getGender().equals("Female") && y.getDegree().equals(Degree.BACHELOR));
        System.out.println();


    }

}





