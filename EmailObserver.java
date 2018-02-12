/**
 * Created by fannelbr on 2/9/2018.
 */
public class EmailObserver {

    private Student student;

    public EmailObserver(){

    }

    public void update(Student student){
        System.out.println("Student's new email is " + student.getEmail());
    }
}
