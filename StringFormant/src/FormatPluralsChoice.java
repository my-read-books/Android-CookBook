import java.text.*;

public class FormatPluralsChoice {
    static double[] limits = {0, 1, 2};
    static String[] formats = {"reviews", "review", "reviews"};
    static ChoiceFormat pluralizedFormat =
            new ChoiceFormat(limits, formats);
    // ChoiceFormat to give English text version, quantified
    static ChoiceFormat quantizedFormat = new ChoiceFormat(
            "0#no reviews|1#one review|1<many reviews");

    static int[] data = {-1, 0, 1, 2, 3};

    public static void main(String[] argv) {
        System.out.println("Pluralized Format");
        for (int i : data) {
            System.out.println("Found " + i + " " +
                    pluralizedFormat.format(i));
        }
        System.out.println("Quantized Format");
        for (int i : data) {
            System.out.println("Found " +
                    quantizedFormat.format(i));
        }
    }
}
/*The best way (Android only) in values:
    <?xml version="1.0" encoding="utf-8"?>
    <resources>
    <plurals name="numberOfSongsAvailable">
    <item quantity="one">One item found.</item>
    <item quantity="other">%d items found.</item>
    </plurals>
    </resources>

in code:
    int count = getNumberOfsongsAvailable();
    Resources res = getResources();
    String songsFound =
    res.getQuantityString(R.plurals.numberOfSongsAvailable, count);
*/