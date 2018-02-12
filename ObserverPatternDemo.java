/**
 * Created by fannelbr on 2/9/2018.
 */
import java.util.ArrayList;
public class ObserverPatternDemo {
    public static void main(String[] args){

        Student student = new Student("Britton", "Fannell", 11110162, "bfannell@gmail.com");

        ArrayList<Course> courses = new ArrayList<Course>();
        Course Art = new Course("Art",101, 3, "Schiller");
        Course Math = new Course("Math", 2011, 3, "Gross");
        Course Science = new Course("Science", 1101, 3, "Doe");

        IdNumberObserver idObserver =  new IdNumberObserver();
        FirstNameObserver firstNameObserver = new FirstNameObserver();
        EmailObserver emailObserver = new EmailObserver();
        CourseObserver courseObserver = new CourseObserver();

        student.attachObserver(idObserver);
        student.attachObserver(firstNameObserver);
        student.attachObserver(emailObserver);
        student.attachObserver(courseObserver);

        student.setFirstName("Brit");
        student.setIdNumber(123123);
        student.setEmail("britton.fannell@student.shu.edu");
        student.setCourses(null);
        courses.add(Art);
        courses.add(Math);
        courses.add(Science);


    }
}
