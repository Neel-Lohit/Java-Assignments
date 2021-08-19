import java.util.ArrayList;

public class ArrayListSum {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(50);
        integerList.add(70);
        integerList.add(80);
        integerList.add(65);
        int sum;
        sum = ArrayListSum(integerList);
        System.out.println("sum is : "+sum);
    }
    public static int ArrayListSum(ArrayList<Integer> integerArrayList)
    {
        int sum=0;
        for (int element: integerArrayList) {
            sum += element;
        }
        return sum;
    }
}
