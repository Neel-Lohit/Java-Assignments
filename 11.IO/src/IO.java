import java.io.*;
import java.util.*;

public class IO {
    public static void main(String[] args) throws IOException {
        Map<Character,Integer> countOccurrence= new HashMap<Character,Integer>();
        FileReader fr=new FileReader("src/Input");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while(line!=null) {
            for(char c:line.toCharArray()){
                countOccurrence.put(c,countOccurrence.getOrDefault(c,0)+1);
            }
            line=br.readLine();
        }
        System.out.println(countOccurrence);
        FileWriter fw=new FileWriter("src/Output.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.append(countOccurrence.toString());
        bw.close();
        fw.close();

    }
}
