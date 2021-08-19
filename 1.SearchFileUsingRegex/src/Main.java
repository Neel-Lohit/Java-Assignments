import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileSearch fileSearch =new FileSearch();
        while(true)
        {
            System.out.println("Enter the path to search");
            String path=br.readLine();
            System.out.println("Enter the pattern");
            String pattern = br.readLine();
            System.out.println(fileSearch.findFile(path,pattern));
        }

    }
}
