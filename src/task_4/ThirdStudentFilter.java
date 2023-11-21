package task_4;

public class ThirdStudentFilter implements Filter{
    @Override
    public boolean test(Student student) {
        return student.getAge() >=18 && student.getAge() <=23 && student.getGender().equals ("Female");
    }
}
