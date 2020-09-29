import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;


public class DateStringFormat extends Activity {
    // for date format use DateFormat class and pattern

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView1 = (TextView) findViewById(R.id.textview1);
        TextView textView2 = (TextView) findViewById(R.id.textview2);
        String pattern;
        Date date = new Date();

        pattern = "MM/dd/yy hh:mm a";
        textView1.setText("Found Time :: "+DateFormat.format(pattern, date));

        pattern = "MMM dd, yyyy h:mm aa";
        textView1.setText("Found Time :: "+DateFormat.format(pattern, date));
    }


}
