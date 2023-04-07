import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        //Create File
        FileOutputStream fileOutputStream = new FileOutputStream("EmployeeData.txt");


        //Write ,serialization
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Employee employee = new Employee();
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fileOutputStream.close();

        //Read , deserialization
        FileInputStream fileInputStream = new FileInputStream("EmployeeData.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee e1 = (Employee) objectInputStream.readObject();
        e1.getName();
        e1.getAge();
        e1.getAddress();
        e1.getContact();



    }
}