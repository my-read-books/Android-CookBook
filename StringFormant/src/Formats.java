import java.util.Date;

public class Formats {

    public static void main(String[] args) {
        //printf format
        String username = "User";
        Date time = new Date();
        String msg = String.format("Hello %s at %s%n", username, time);
        System.out.println(msg);
        /*s String (convert primitive values using defaults; convert objects by toString)
        d Decimal integer (int, long)
        f Floating point (float, double)
        n Newline
        t Time/date formats, Java-specific*/
        msg = String.format("Hello at %1$tB %1$td, %1$tY%n", time);
        System.out.println(msg);
        double latitude = -79.28181818181818182;
        msg = String.format("Latitude: %10.6f", latitude);
        System.out.println(msg);
    }
}
