import java.io.Serializable;


public class Employee implements Serializable {

    String name = "Upasana";
    int age =20;
    String address= "Thapathali";
    int contact =9754575 ;

    public void getName() {
        System.out.println(name);
    }
    public void getAge(){
        System.out.println(age);
    }

    public void getAddress() {
        System.out.println(address);
    }

    public void getContact() {
        System.out.println(contact);
    }
}





//import java.io.Serializable;
//import java.util.Scanner;
//
//public class Employee implements Serializable {
//
//    String name ;
//    int age;
//    String address;
//    int contact ;
//
//    public String getName() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        name = scanner.nextLine();
//        return name;
//    }
//    public int getAge(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter age: ");
//        age = scanner.nextInt();
//        return age;
//    }
//
//    public String getAddress() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter address: ");
//        address = scanner.nextLine();
//        return address;
//    }
//
//    public int getContact() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter contact number: ");
//        age = scanner.nextInt();
//        return contact;
//    }
//}
