package B;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("Программная инженерия"); course.setDateCreate("1 сентрября 2020");
        course.setTeacherFullName("Иванов Иван"); course.setId();
        Student student = new Student();
        student.setAge(19); student.setName("Erkin"); student.setLastName("Kurosaki");
        student.setSex("Male"); student.setDateOfBirth("11.11.2002");
        Group group = new Group();
        group.setCourse(course); group.setDurationInMonths(6);
        group.setStartDate("1 марта 2021"); group.setStudents(new Student[]{student});

    }
}
