package Circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle unitCircle = new Circle();
        Circle myCircle =new Circle(5);

        printCircleData(unitCircle);
        printCircleData(myCircle);
    }
    public static void printCircleData(Circle circle)
    {
        System.out.println("Radius : " +circle.getRadius());
        System.out.println("Circumference : " +circle.getCircumference());
        System.out.println("Area : "+circle.getArea());

    }
}
