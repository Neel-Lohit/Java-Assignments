import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner=new Scanner(System.in);
        for(int i=0; i < 5; i++)
        {
            System.out.println("Enter number ");
            array[i]=scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("result is "+(array[i]*2));
        }
    }
}
