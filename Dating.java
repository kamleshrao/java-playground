import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;

public class Dating
{
    public static void main(String[] args)
    {
        System.out.println("Let's Date with Java...");

        String inputDate = "03/08/2018";
        String inputTime = "08:00:00";
        String fullDate = inputDate + " " + inputTime;

        try
        {

          Date inputDt = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(fullDate);
          DateFormat dateformat = new SimpleDateFormat("yyyyMMdd hh:mm:ss");

          Calendar now = Calendar. getInstance();
          TimeZone timeZone = now. getTimeZone();
          System.out.println("Your Timezone is: " + timeZone.getDisplayName());

          System.out.println("Current Date is: " + dateformat.format(inputDt));

          //To get UTC DateTime
          dateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
          System.out.println("Current Date in GMT is: " + dateformat.format(inputDt));

          /*

          Output from Bangalore:

          Let's Date with Java...
          Your Timezone is: India Standard Time
          Current Date is: 20180803 08:00:00
          Current Date in GMT is: 20180803 02:30:00

          */

        }
        catch (Exception e)
        {

          System.out.println("Error: " + e);

        }

    }
}
