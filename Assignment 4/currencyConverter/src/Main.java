import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the money in Nepali Currency \"Rupees\": ");
        double curr = scanner.nextDouble();


        Main obj = new Main();
        double dollar = obj.getCurrency(  curr);
        System.out.println("The Nepalese ruppees " + curr + " RS in dollar is " + dollar+ "$");
    }

    public double getCurrency(double cur) {
        double dollar = cur / 135.03;
        return dollar;
    }
}