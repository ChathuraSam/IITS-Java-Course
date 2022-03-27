package model;

/**
 * @author chathura
 * @Date 2022-03-27
 */
import java.sql.Date;

public class Student {
    private int id; // naming convension -> camelCase
    private String name;
    private String address;
    private Date dob;
    private int age;

    private static int SYID;

    public Student(){}

    public Student(int id, String name, String address, Date dob, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String address, Date dob, int age) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.age = age;
    }
    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
