import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Elapses {
    public static void main(String[] args) {
        long StartTime;
        long EndTime;
        double Time;
        StartTime=System.currentTimeMillis();
        for (long i=0;i<=100000;i++)
            continue;
        EndTime=System.currentTimeMillis();
                Time=(EndTime-StartTime)/1000.0;
        System.out.println("Escalated Time:"+Time);



    }
}
