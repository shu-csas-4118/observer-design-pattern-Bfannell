/**
 * Created by fannelbr on 2/9/2018.
 */
public class CourseObserver {

    private Course course;
    private Student student;

    public CourseObserver(){

    }

    public void update (Course course){
        System.out.println("The student's courses are " + student.getCourses());
    }


}
