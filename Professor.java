/**
 * Created by fannelbr on 2/9/2018.
 */
public class Professor {
    private String firstName;
    private String lastName;
    private String eMail;
    private int phoneNumber;

    public Professor (String firstName, String lastName, String eMail, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return this.eMail;
    }

    public void setEmail(String eMail){
        this.eMail = eMail;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        String printThis = "";
        printThis = printThis + firstName + " " + lastName + "\n" +
                "\t" + "Professor's email is " + eMail + "\n" +
                "\t" + "Professor's phone number is " + phoneNumber;
        return printThis;
    }

    public String printInfo()
    {
        System.out.println("Professor's first name is " + firstName);
        System.out.println("Professor's last name is " + lastName);
        System.out.println("Professor's email is " + eMail);
        System.out.println("Professor's phone number is " + phoneNumber);
        return " ";
    }

}
