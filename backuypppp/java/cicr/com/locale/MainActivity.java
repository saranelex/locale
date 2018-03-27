package cicr.com.locale;

import java.util.Locale;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import cicr.com.locale.Gallary.PestKnownScreen;

public class MainActivity extends Activity {

    Spinner spinnerctrl;
    Button pestunknownbtn,pestknownbtn;
    Locale myLocale;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pestknownbtn =(Button) findViewById(R.id.button);


        pestknownbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inttknown = new Intent(getApplicationContext(),PestKnownScreen.class);
                startActivity(inttknown);
            }
        });

                pestunknownbtn =(Button) findViewById(R.id.button1);
        spinnerctrl = (Spinner) findViewById(R.id.spinner1);

        pestunknownbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intt = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intt);
            }
        });


        spinnerctrl.setOnItemSelectedListener(new OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                if (pos == 1) {

//                    Toast.makeText(parent.getContext(),
//                            "You have selected Tamil", Toast.LENGTH_SHORT)
//                            .show();
                    setLocale("ta");
                } else if (pos == 2) {

//                    Toast.makeText(parent.getContext(),
//                            "You have selected Hindi", Toast.LENGTH_SHORT)
//                            .show();
                    setLocale("hi");
                } else if (pos == 3) {

//                    Toast.makeText(parent.getContext(),
//                            "You have selected English", Toast.LENGTH_SHORT)
//                            .show();
                    setLocale("en");
                }

            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
                setLocale("en");
            }

        });
    }

    private void setLocale(String lang) {

        myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        getBaseContext().getResources().updateConfiguration(conf,
                getBaseContext().getResources().getDisplayMetrics());

        this.finish();

        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        this.startActivity(intent);

//        Intent refresh = new Intent(this, MainActivity.class);
//        startActivity(refresh);

    }
}
