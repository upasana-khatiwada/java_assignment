import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms:  ");
        int n = scanner.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibonacci series upto "+ n+ " terms is :");
        for(int i=0;i<n;i++)
        {
            System.out.print(a +",");
            int nextTerm = a +b;
            a=b;
            b=nextTerm;
        }
    }
}