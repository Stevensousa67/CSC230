import java.io.*;
import java.util.ArrayList;
public class ObjectIOExample {

    private static final String filepath = "/Users/steven/Desktop/Java.txt";

    public void WriteObjectToFile(ArrayList<Student> listOfStudents) {
        try {

            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(listOfStudents);
            objectOut.close();
            System.out.println("The Object  was successfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void ReadInObject() {

        // Deserialization

        try {
            FileInputStream fileIn = new FileInputStream("/Users/steven/Desktop/Java.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList aList = (ArrayList) in.readObject();
            System.out.println(aList);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
