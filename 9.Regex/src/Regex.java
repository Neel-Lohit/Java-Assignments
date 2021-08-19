import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String inpString=br.readLine();
        if(Pattern.matches("^[A-Z].*[.]$",inpString))
            System.out.println("valid string");
        else
            System.out.println("Invalid string");
    }
}
