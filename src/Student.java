import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable{

    private String firstName;
    private String lastName;
    private int age;

    Student(String name, String surname, int yearsOld) {
        this.firstName = name;
        this.lastName = surname;
        this.age = yearsOld;
    }

    public static void append(ArrayList<Student> a, Student s){
        a.add(s);
    }

    public String toString(){
        return null;
    }
}
