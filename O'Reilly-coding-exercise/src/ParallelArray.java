import java.util.ArrayList;
import java.util.Scanner;

public class ParallelArray {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> ageList =new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i<5 ; i++) {
            System.out.println("Enter name");
            String name = scanner.next();
            System.out.println("Enter age");
            int age=scanner.nextInt();
            nameList.add(name);
            ageList.add(age);
        }
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i)+" is "+ageList.get(i)+" years old");
        }

    }
}
