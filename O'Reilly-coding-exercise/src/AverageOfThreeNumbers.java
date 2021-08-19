import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        double firstNumber = scanner.nextInt();
        double secondNumber = scanner.nextInt();
        double thirdNumber = scanner.nextInt();
        double sum = firstNumber + secondNumber + thirdNumber;
        double average= sum/3;
        System.out.println("average: "+average);
    }
}
