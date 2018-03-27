package cicr.com.locale.Gallary;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.webkit.WebView;
import android.widget.TextView;

import cicr.com.locale.MainActivity;
import cicr.com.locale.R;

public class display extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

//        String htmlText = " %s ";
//        String myData = "Developed at ICAR-Central institute for cotton research,regional station,Coimbatore - 641 003, TamilNadu ,India www.cicr.org.in";
//        WebView webView = (WebView) findViewById(R.id.webView1);
//        webView.loadData(String.format(htmlText, myData), "text/html", "utf-8");

        TextView  Textviewabout = (TextView) findViewById(R.id.Textviewabout);
        Textviewabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent appabout = new Intent(getApplicationContext(), Aboutapp.class);
                startActivity(appabout);
            }
        });

        TextView  Txtviewdisclaimer = (TextView) findViewById(R.id.Txtviewdisclaimer);
        Txtviewdisclaimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent disclaimer = new Intent(getApplicationContext(), Disclaimer.class);
                startActivity(disclaimer);
            }
        });

        TextView  Txtcopyright = (TextView) findViewById(R.id.Txtcopyright);
        Txtcopyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent copyright = new Intent(getApplicationContext(), Copyright.class);
                startActivity(copyright);
            }
        });

        ImageView img =  (ImageView) findViewById(R.id.imageView4);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InitialIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(InitialIntent);

            }
        });

    }
}
