import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Date outputStartDate, outputEndDate;
        while(n-->0) {
            //create Date format
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            //create calendars for signUpDate and currentDate
            String date1=br.readLine();
            String date2=br.readLine();
            Date signUpDate = simpleDateFormat.parse(date1);
            Date currentDate = simpleDateFormat.parse(date2);
            Calendar calendar1 = new GregorianCalendar();
            calendar1.setTime(signUpDate);
            Calendar calendar2 = new GregorianCalendar();
            calendar2.setTime(currentDate);

            //if signup and current date are in the same year Then there is no range
            if (calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR)) {
                System.out.println("No Range");
            }

            else {
                //make the year same as current year
                calendar1.set(Calendar.YEAR,calendar2.get(Calendar.YEAR));
                //add -30th day
                calendar1.add(Calendar.DATE, -30);
                outputStartDate = calendar1.getTime();
                //add +30th day
                calendar1.add(Calendar.DATE, 60);
                outputEndDate = calendar1.getTime();
                //if currentDate is after +30-day period of signUpDate, range is startDate to endDate
                if (currentDate.after(outputEndDate)) {
                    System.out.println(simpleDateFormat.format(outputStartDate) + " " + simpleDateFormat.format(outputEndDate));
                }
                //if currentDate is within +30-day period of signUpDate, range is startDate to currentDate
                else {
                    System.out.println(simpleDateFormat.format(outputStartDate) + " " + simpleDateFormat.format(currentDate));
                }
            }
        }
    }
}
