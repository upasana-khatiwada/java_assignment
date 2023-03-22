import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number");
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int i;
       for( i=2;i<=n;i++)
       {
           if(i/n==0)
           {
               System.out.println("It is prime ");
           }
           else
           {
               System.out.println("It is not prime ");
           }
       }

    }
}