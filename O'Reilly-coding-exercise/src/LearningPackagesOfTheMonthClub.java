import java.util.Scanner;

public class LearningPackagesOfTheMonthClub {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Which package do you want to buy? 1,2,or 3");
        int packageNumber=scanner.nextInt();
        System.out.println("How many course did you enroll this month?");
        int noOfCourses=scanner.nextInt();
        int noOfDefaultCourses=0;
        int additionalCharge=0;
        int monthlyCharge=0;
        int totalAmount;
        switch (packageNumber)
        {

            case 1: noOfDefaultCourses=2;
                    additionalCharge=6;
                    monthlyCharge=10;
                    totalAmount=calculateTotalAmount(noOfDefaultCourses,additionalCharge,monthlyCharge,noOfCourses);
                    System.out.println("Total cost is : "+totalAmount);
                    break;
            case 2: noOfDefaultCourses=4;
                    additionalCharge=4;
                    monthlyCharge=12;
                    totalAmount=calculateTotalAmount(noOfDefaultCourses,additionalCharge,monthlyCharge,noOfCourses);
                    System.out.println("Total cost is : "+totalAmount);
                    break;
            case 3: noOfDefaultCourses=6;
                    additionalCharge=3;
                    monthlyCharge=15;
                    totalAmount=calculateTotalAmount(noOfDefaultCourses,additionalCharge,monthlyCharge,noOfCourses);
                    System.out.println("Total cost is : "+totalAmount);
                    break;

        }
    }

    private static int calculateTotalAmount(int noOfdefaultCourses, int additionalCharge, int monthlyCharge, int noOfCourses)
    {
        if(noOfCourses<=noOfdefaultCourses)
            return monthlyCharge;
        return monthlyCharge+(noOfCourses-noOfdefaultCourses)*additionalCharge;
    }
}
