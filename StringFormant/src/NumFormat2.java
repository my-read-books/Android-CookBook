import java.text.NumberFormat;

public class NumFormat2 {
    /*Pattern characters
    # Numeric digit (leading zeros suppressed)
    0 Numeric digit (leading zeros provided)
    . Locale-specific decimal separator (decimal point)
    , Locale-specific grouping separator (comma in English)
    - Locale-specific negative indicator (minus sign)
    % Shows the value as a percentage
    ; Separates two formats: the first for positive and the second for negative values
    ' Escapes one of the preceding characters so that it appears as itself
    Anything else Appears as itself*/

    public static final double data[] = {
            0, 1, 22d / 7, 100.2345678
    };

    public static void main(String[] av) {
        NumberFormat form = NumberFormat.getInstance();
        form.setMinimumIntegerDigits(3);
        form.setMinimumFractionDigits(2);
        form.setMaximumFractionDigits(4);

        for (double datum : data)
            System.out.println(datum + "\tformats as " +
                    form.format(datum));
    }
}
