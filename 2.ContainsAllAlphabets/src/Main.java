import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        ContainsAllAlphabets containsAllAlphabets =new ContainsAllAlphabets();
        HashSet<String > hashSet= new HashSet<String>(Arrays.asList(br.readLine().toLowerCase(Locale.ROOT).split("")));
       System.out.println(containsAllAlphabets.contains(hashSet));

    }
}
