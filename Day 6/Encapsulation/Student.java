import java.util.Objects;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
    }

    public Student(int studentId, String firstName, String lastName, int age) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    /****** studentId ******/

    // getter -> return type -> int
    public int getStudentId (){
        return this.studentId;
    }

    // setter
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    /****** firstName ******/

    // getter
    public String getFirstName() {
        return this.firstName;
    }

    // setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /****** lastName ******/

    //getter
    public String getLastName() {
        return this.lastName;
    }

    // setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

     /****** age ******/

    // getter
    public int getAge() {
        return this.age;
    }

    //setter
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "studentID: "+studentId+", firstName: "+firstName+", lastName: "+lastName+", age: "+age+"";
    }
}
