import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.net.*;
public class Ping {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String ip=scanner.nextLine();
        Ping ping=new Ping();
        ping.median(ip);
    }


    public void median(String ip) throws IOException {
        Process proc = Runtime.getRuntime().exec("ping -c 10 "+ip);
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(proc.getInputStream()));

        String line = "";
        Double[] time=new Double[10];
        int count=0;
        while ((line = reader.readLine()) != null&&count<10) {
            System.out.println(line);
            int index1=line.lastIndexOf("time=");
            int index2=line.lastIndexOf("ms");
            if(index1!=-1&&index2!=-1){
                time[count++]=Double.parseDouble(line.substring(index1+5,index2-1));
            }


        }
        Arrays.sort(time);
        System.out.println("Median Ping time: "+(time[4]+time[5])/2);

    }
}