import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        Main main =new Main();
        main.getMultiplication( num);
    }

    public static void getMultiplication(int n)
    {
        for(int i=1;i<=10;i++)
        {
            int result = n*i;
            System.out.println(n+" x "+ i + " = "+ result);
        }
    }
};
