import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NamePermutation {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> firstNameList =new ArrayList<>();
        ArrayList<String> lastNameList = new ArrayList<>();
        int noOfNames = 5;
        for (int i = 0; i < noOfNames; i++) {
            System.out.println("Enter full name "+(i+1));
            String fullName[]=br.readLine().split(" ");
            firstNameList.add(fullName[0]);
            lastNameList.add(fullName[1]);
        }
        for(String firstName : firstNameList)
        {
            for(String lastName : lastNameList)
                System.out.println(firstName+" "+lastName);
        }

    }
}
