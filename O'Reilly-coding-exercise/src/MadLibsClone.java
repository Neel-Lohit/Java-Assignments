import java.util.Scanner;

public class MadLibsClone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective1,girlName,adjective2,occupation1,place,clothing,hobby,adjective3,occupation2,boyName,manName;

        System.out.println("enter adjective");
        adjective1=scanner.nextLine();

        System.out.println("Enter Girl's Name");
        girlName=scanner.nextLine();

        System.out.println("Enter another adjective");
        adjective2=scanner.nextLine();

        System.out.println("Enter occupation");
        occupation1=scanner.nextLine();

        System.out.println("Enter place");
        place=scanner.nextLine();

        System.out.println("Enter clothing");
        clothing=scanner.nextLine();

        System.out.println("Enter Hobby");
        hobby=scanner.nextLine();

        System.out.println("Enter another adjective");
        adjective3=scanner.nextLine();

        System.out.println("Enter occupation");
        occupation2=scanner.nextLine();

        System.out.println("Enter Boy's Name");
        boyName=scanner.nextLine();

        System.out.println("Enter Man's Name");
        manName=scanner.nextLine();

        System.out.println("There once was a "+adjective1+" girl named "+girlName+", who was a "+adjective2+" "+occupation1+
                " in the Kingdom of "+place+".");
        System.out.println("She loved to wear "+clothing+" and to "+hobby+". She wanted to marry the "+adjective3+" "+occupation2+
                " named "+boyName+" but her father,King "+manName+" forbid her seeing him.");

    }
}
