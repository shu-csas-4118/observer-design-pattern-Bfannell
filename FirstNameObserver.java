/**
 * Created by fannelbr on 2/9/2018.
 */
public class FirstNameObserver {
    private Student student;

    public FirstNameObserver() {

    }

    public void update(Student student) {
        System.out.println("Student's first name is " + student.getFirstName());
    }
}