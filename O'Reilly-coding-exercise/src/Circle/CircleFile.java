package Circle;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circleArrayList= new ArrayList<>();

        fillArrayList(circleArrayList);
        printCircle(circleArrayList);
    }

    private static void fillArrayList(ArrayList<Circle> circleArrayList) {
        Scanner scanner;
        try
        {
            scanner=new Scanner(new File("src/Circle/circle_input.txt"));
            Circle temp;
            double radius;
            while(scanner.hasNext())
            {
                radius = scanner.nextDouble();
                //System.out.println(radius);
                temp= new Circle(radius);
                circleArrayList.add(temp);
            }
            scanner.close();
        }catch (Exception e)
        {
            System.out.println("File not found for input");
        }
    }

    private static void printCircle(ArrayList<Circle> circleArrayList) {
        PrintWriter pw;
        try
        {
            pw= new PrintWriter(new File("src/Circle/circle_output.txt"));
            for(Circle c : circleArrayList)
            {
                System.out.println(c.getArea()+" "+c.getCircumference()+" "+c.getRadius());
                pw.println("Radius "+ c.getRadius());
                pw.println("Area "+ c.getArea());
                pw.println("Circumference "+ c.getCircumference());
                pw.println();
            }
            pw.close();
        }
        catch (Exception e)
        {
            System.out.println("File not found");
        }

    }

}
