import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumFormatDemo {
    public static final double intlNumber = 1024.25;
    public static final double ourNumber = 100.2345678;

    public static void main(String[] av) {
        NumberFormat defForm = NumberFormat.getInstance();
        NumberFormat ourForm = new DecimalFormat("##0.##");
        System.out.println("defForm's pattern is " +
                ((DecimalFormat) defForm).toPattern());
        System.out.println(intlNumber + " formats as " +
                defForm.format(intlNumber));
        System.out.println(ourNumber + " formats as " +
                ourForm.format(ourNumber));
        System.out.println(ourNumber + " formats as " +
                defForm.format(ourNumber) + " using the default format");
    }
}
