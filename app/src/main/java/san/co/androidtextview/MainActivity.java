package san.co.androidtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private TextView test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        test=(TextView)findViewById(R.id.txt_test);


        // set text to text view


        test.setText("Text");




        /*
        *
        *
        *   setting minimum line--test.setMinLines(2);
        *
        *   setting maximum line-- test.setMaxLines(6);
        *
        *   all caps property -- test.setAllCaps(true);
        *
        *   set color for TextView --  test.setTextColor(Color.GRAY);
        *
        *   set color for TextView --  test.setTextColor(Color.GRAY);
        *
        *   set color for TextView --  test.setTextColor(Color.parseColor("#475123"));
        *
        *   set textSize for TextView --  test.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
        *
        *
        *   set style for TextView
        *
        *   test.setTypeface(null, Typeface.BOLD_ITALIC);
            test.setTypeface(null, Typeface.BOLD);
            test.setTypeface(null, Typeface.ITALIC);
            test.setTypeface(null, Typeface.NORMAL);

        *
        *    set TextAlignment end for TextView - test.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        *
        *
        */




                              // Set Spannable property


       /*

       This is the class for text whose content is immutable but to which markup objects can be attached and detached.

       ref- https://developer.android.com/reference/android/text/SpannableString.html

       */


        /*


        SpannableString styledString
                = new SpannableString("Test");


        // make the text twice as large

        styledString.setSpan(new RelativeSizeSpan(2f), 0, 5, 0);



        // make text bold

        styledString.setSpan(new StyleSpan(Typeface.BOLD), 7, 11, 0);



        // underline text

        styledString.setSpan(new UnderlineSpan(), 13, 23, 0);



        // make text italic

        styledString.setSpan(new StyleSpan(Typeface.ITALIC), 25, 31, 0);



        styledString.setSpan(new StrikethroughSpan(), 33, 46, 0);

        // change text color



        styledString.setSpan(new ForegroundColorSpan(Color.GREEN), 48, 55, 0);

        // highlight text



        styledString.setSpan(new BackgroundColorSpan(Color.CYAN), 57, 68, 0);

        // superscript


        styledString.setSpan(new SuperscriptSpan(), 72, 83, 0);


        // make the superscript text smaller


        styledString.setSpan(new RelativeSizeSpan(0.5f), 72, 83, 0);


        // subscript


        styledString.setSpan(new SubscriptSpan(), 87, 96, 0);


        // make the subscript text smaller


        styledString.setSpan(new RelativeSizeSpan(0.5f), 87, 96, 0);



        // url


        styledString.setSpan(new URLSpan("http://www.google.com"), 98, 101, 0);


        ClickableSpan clickableSpan = new ClickableSpan() {

            @Override
            public void onClick(View widget) {

                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();

            }
        };


        styledString.setSpan(clickableSpan, 103, 112, 0);


        test.setText(styledString);


        */



        ////////////////////////////////////////////////////////////////////











    }

}
