package task_4;

public class SecondStudentFilter implements Filter {
    public boolean test(Student student) {
        return student.getAge() > 23 && student.getDegree().equals(Degree.MASTER);
    }
}
