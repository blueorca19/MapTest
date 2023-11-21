package task_4;

public class FirstStudentFilter implements Filter {
    @Override
    public boolean test(Student student) {
        return student.getKurs() >= 3 && student.getAverageRate() >= 4.5;
    }
}
