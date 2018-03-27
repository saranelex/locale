package cicr.com.locale.Gallary;


import android.graphics.Color;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import cicr.com.locale.Adapter.GlobalClass;
import cicr.com.locale.R;

import static cicr.com.locale.R.color.gray;

public class DialogActivity extends Activity implements OnClickListener,TextToSpeech.OnInitListener {

    Button backbutton, audio_btn;
    private MediaPlayer mediaPlayer;
    private TextToSpeech tts;
    Locale myLocale;
    TextView txtt,tv2,tv3,tv4,tv5,tv6,tv7,tv8;
    TableRow trow2,trow4,trow6,trow8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);
       // final String title = getIntent().getStringExtra("title");
        final  String txttitle = getIntent().getStringExtra("txttitle");
        // Calling Application class (see application tag in AndroidManifest.xml)
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
// Get Title from global/application context
        final String Title  = globalVariable.getTitle();

        tts = new TextToSpeech(this, this);
        txtt = (TextView) findViewById(R.id.title);
        TextView tv1 = (TextView)findViewById(R.id.tv1);
         tv2 = (TextView)findViewById(R.id.tv2);
         tv3 = (TextView)findViewById(R.id.tv3);
         tv4 = (TextView)findViewById(R.id.tv4);
         tv5 = (TextView)findViewById(R.id.tv5);
         tv6 = (TextView)findViewById(R.id.tv6);
        tv7 = (TextView)findViewById(R.id.tv7);
        tv8 = (TextView)findViewById(R.id.tv8);
        trow2 = (TableRow) findViewById(R.id.tableRow2);
        trow4 = (TableRow) findViewById(R.id.tableRow4);
        trow6 = (TableRow) findViewById(R.id.tableRow6);
        trow8 = (TableRow) findViewById(R.id.tableRow8);


        backbutton = (Button) findViewById(R.id.back);
        audio_btn = (Button) findViewById(R.id.audio_btn_id);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });



if(txttitle.contains("Classification")){
    switch (Title) {

        case "Aphid": {
            txtt.setText("The identified Pest is aphid");
            tv1.setText(txttitle + " of aphid");
            tv2.setText(getString(R.string.aphid1));
            tv3.setText(getString(R.string.aphid2));
            tv4.setText(getString(R.string.aphid3));
            tv5.setText(getString(R.string.aphid4));
            tv6.setText(getString(R.string.aphid5));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;

        }
        case "Whitefly":{
            txtt.setText("The identified Pest is whitefly");
            tv1.setText(txttitle + " of whitefly");
            tv2.setText(getString(R.string.whitefly1));
            tv3.setText(getString(R.string.whitefly2));
            tv4.setText(getString(R.string.whitefly3));
            tv5.setText(getString(R.string.whitefly4));
            tv6.setText(getString(R.string.whitefly5));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }
        case "Jassid":
        {
            txtt.setText("The identified Pest is jassid");
            tv1.setText(txttitle + " of Jassid");
            tv2.setText(getString(R.string.jassid1));
            tv3.setText(getString(R.string.jassid2));
            tv4.setText(getString(R.string.jassid3));
            tv5.setText(getString(R.string.jassid4));
            tv6.setText(getString(R.string.jassid5));

            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }
        case "American bollworm":
            {
            txtt.setText("The identified Pest is American bollworm");
            txtt.setSingleLine();
            tv1.setText(txttitle + " of American bollworm");
            tv2.setText(getString(R.string.american_bollworm_cl1));
            String itaticstring = "Scientific Name: <b><i>helicoverpaarmigera</i></b> Hub";

            tv3.setText(Html.fromHtml(itaticstring));
            tv3.setSingleLine();

            tv4.setText(getString(R.string.american_bollworm_cl3));
            tv5.setText(getString(R.string.american_bollworm_cl4));
            tv6.setText(getString(R.string.american_bollworm_cl5));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
        }
        case  "Pink Bollworm":
        {
            txtt.setText("The identified Pest is Pink Bollworm");
            txtt.setSingleLine();
            tv1.setText(txttitle + " of Pink Bollworm");
            tv2.setText(getString(R.string.pink_bollworm_cl1));
            String itaticstring = "Scientific Name: <b><i> Pectinophora gossypiella </i></b> Saund.";

            tv3.setText(Html.fromHtml(itaticstring));
            tv3.setSingleLine();

            tv4.setText(getString(R.string.pink_bollworm_cl3));
            tv5.setText(getString(R.string.pink_bollworm_cl4));
            tv6.setText(getString(R.string.pink_bollworm_cl5));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }
        case "Spotted and Spiny Bollworm":
        {
            txtt.setText("The identified Pest is Spotted and Spiny Bollworm");
            txtt.setSingleLine();
            tv1.setText(txttitle + " of Spotted and Spiny Bollworm");
            tv2.setText(getString(R.string.spotted_spiny_bollworm_cl1));
            String itaticstring = "Scientific Name: <b><i>Earias vittella</i></b>Feb.<b><i>Earias.insulana</i></b> Bois";

            tv3.setText(Html.fromHtml(itaticstring));
            tv3.setSingleLine();

            tv4.setText(getString(R.string.spotted_spiny_bollworm_cl3));
            tv5.setText(getString(R.string.spotted_spiny_bollworm_cl4));
            tv6.setText(getString(R.string.spotted_spiny_bollworm_cl5));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }
        case "Leafworm or Tobacco caterpillar":
        {
            txtt.setText("The identified Pest is Leafworm or Tobacco caterpillar");
            txtt.setSingleLine();
            tv1.setText(txttitle + " of Leafworm or Tobacco caterpillar");
            tv2.setText(getString(R.string.leafworm_tobacco_caterpillar_cl1));
            String itaticstring = "Scientific Name: <b><i>Spodoptera litura Boisd</i></b>";

            tv3.setText(Html.fromHtml(itaticstring));
            tv3.setSingleLine();

            tv4.setText(getString(R.string.leafworm_tobacco_caterpillar_cl3));
            tv5.setText(getString(R.string.leafworm_tobacco_caterpillar_cl4));
            tv6.setText(getString(R.string.leafworm_tobacco_caterpillar_cl5));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }

        case "Thrips":
        {
            txtt.setText("The identified Pest is Thrips");
            txtt.setSingleLine();
            tv1.setText(txttitle + " of Thrips");
            tv2.setText(getString(R.string.thrips_cl1));
            String itaticstring = "Scientific Name: Thrips<b><i> tabaci Linde.</i></b>";

            tv3.setText(Html.fromHtml(itaticstring));
            tv3.setSingleLine();

            tv4.setText(getString(R.string.thrips_cl3));
            tv5.setText(getString(R.string.thrips_cl4));
            tv6.setText(getString(R.string.thrips_cl5));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }
    }
} else if (txttitle.contains("Identification")){
    switch (Title) {

        case "Aphid": {
            txtt.setText("The identified Pest is aphid");

            tv1.setText(txttitle + " of aphid");
            tv2.setText(getString(R.string.Aphids_idet1));
            tv3.setText(getString(R.string.Aphids_idet2));
            tv4.setText(getString(R.string.Aphids_idet3));
            tv5.setText(getString(R.string.Aphids_idet4));
            //   tv6.setText(getString(R.string.aphid5));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            //trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;

        }
        case "Whitefly": {
            txtt.setText("The identified Pest is whitefly");
            tv1.setText(txttitle + " of whitefly");
            tv2.setText(getString(R.string.whitefly_idet1));
            tv3.setText(getString(R.string.whitefly_idet2));
            tv4.setText(getString(R.string.whitefly_idet3));
            //tv5.setText(getString(R.string.whitefly_idet3));
            //  tv6.setText(getString(R.string.whitefly5));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }
        case "Jassid": {
            txtt.setText("The identified Pest is jassid");
            tv1.setText(txttitle + " of Jassid");
            tv2.setText(getString(R.string.jassid_idet1));
            tv3.setText(getString(R.string.jassid_idet2));
            tv4.setText(getString(R.string.jassid_idet3));
            tv5.setText(getString(R.string.jassid_idet4));

            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }
        case "American bollworm": {
            txtt.setText("The identified Pest is American bollworm");
            txtt.setSingleLine();
            tv1.setText(txttitle + " of American bollworm");
            tv2.setText(getString(R.string.american_bollworm_idet1));
            tv3.setText(getString(R.string.american_bollworm_idet2));
            tv4.setText(getString(R.string.american_bollworm_idet3));
            tv5.setText(getString(R.string.american_bollworm_idet4));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }
        case "Pink Bollworm": {
            txtt.setText("The identified Pest is Pink Bollworm");
            txtt.setSingleLine();
            tv1.setText(txttitle + " of Pink Bollworm");
            tv2.setText(getString(R.string.pink_bollworm_idet1));
            tv3.setText(getString(R.string.pink_bollworm_idet2));
            tv4.setText(getString(R.string.pink_bollworm_idet3));
            tv5.setText(getString(R.string.pink_bollworm_idet4));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }
        case "Spotted and Spiny Bollworm": {
            txtt.setText("The identified Pest is Pink Bollworm");
            txtt.setSingleLine();
            tv1.setText(txttitle + " of Pink Bollworm");
            tv2.setText(getString(R.string.spotted_spiny_bollworm_idet1));
            tv3.setText(getString(R.string.spotted_spiny_bollworm_idet2));
            tv4.setText(getString(R.string.spotted_spiny_bollworm_idet3));
            tv5.setText(getString(R.string.spotted_spiny_bollworm_idet4));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
//        trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }
        case "Leafworm or Tobacco caterpillar":{
            txtt.setText("The identified Pest is Leafworm or Tobacco caterpillar");
            txtt.setSingleLine();
            tv1.setText(txttitle + " of Leafworm or Tobacco caterpillar");
            tv2.setText(getString(R.string.leafworm_tobacco_caterpillar_idet1));
            tv3.setText(getString(R.string.leafworm_tobacco_caterpillar_idet2));
            tv4.setText(getString(R.string.leafworm_tobacco_caterpillar_idet3));
            tv5.setText(getString(R.string.leafworm_tobacco_caterpillar_idet4));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
//        trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }
        case "Thrips":{
            txtt.setText("The identified Pest is Thrips");
            txtt.setSingleLine();
            tv1.setText(txttitle + " of Thrips");
            tv2.setText(getString(R.string.thrips_idet1));
            tv3.setText(getString(R.string.thrips_idet2));
            tv4.setText(getString(R.string.thrips_idet3));
//            tv5.setText(getString(R.string.leafworm_tobacco_caterpillar_idet4));
            trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
            trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
//        trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
            break;
        }
    }
}else if (txttitle.contains("Damage Symptoms")){
        switch (Title) {
            case  "Aphid": {
        txtt.setText("The identified Pest is aphid" );
        tv1.setText(txttitle+ " of aphid");
        tv2.setText(getString(R.string.Aphids_syd1));
        tv3.setText(getString(R.string.Aphids_syd2));
        tv4.setText(getString(R.string.Aphids_syd3));
        tv5.setText(getString(R.string.Aphids_syd4));
      //  tv6.setText(getString(R.string.aphid5));
        trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
        trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
       // trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;

    }  case "Whitefly": {
        txtt.setText("The identified Pest is whitefly");
        tv1.setText(txttitle+ " of whitefly");
        tv2.setText(getString(R.string.whitefly_syd1));
        tv3.setText(getString(R.string.whitefly_syd2));
        tv4.setText(getString(R.string.whitefly_syd3));
        tv5.setText(getString(R.string.whitefly_syd4));
       // tv6.setText(getString(R.string.whitefly5));
        trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
        trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
       // trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
    }case "Jassid": {
        txtt.setText("The identified Pest is jassid");
        tv1.setText(txttitle+ " of Jassid");
        tv2.setText(getString(R.string.jassid_syd1));
        tv3.setText(getString(R.string.jassid_syd2));
        tv4.setText(getString(R.string.jassid_syd3));
        tv5.setText(getString(R.string.jassid_syd4));
        // tv6.setText(getString(R.string.whitefly5));
        trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
        trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
    }case "American bollworm": {
                txtt.setText("The identified Pest is American bollworm");
                txtt.setSingleLine();
                tv1.setText(txttitle + " of American bollworm");
                tv1.setSingleLine();
                tv2.setText(getString(R.string.american_bollworm_syd1));
                tv3.setText(getString(R.string.american_bollworm_syd2));
                tv4.setText(getString(R.string.american_bollworm_syd3));
                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                // trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                // tv5.setText(getString(R.string.american_bollworm_idet4));
                break;
        }case  "Pink Bollworm": {
                txtt.setText("The identified Pest is Pink Bollworm");
                tv1.setText(txttitle+ " of Pink Bollworm");
                tv2.setText(getString(R.string.pink_bollworm_syd1));
                tv3.setText(getString(R.string.pink_bollworm_syd2));
                tv4.setText(getString(R.string.pink_bollworm_syd3));
                tv5.setText(getString(R.string.pink_bollworm_syd4));
                 tv6.setText(getString(R.string.pink_bollworm_syd5));
                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
            case "Spotted and Spiny Bollworm": {
                txtt.setText("The identified Pest is Spotted and Spiny Bollworm");
                tv1.setText(txttitle+ " of Spotted and Spiny Bollworm");
                tv2.setText(getString(R.string.spotted_spiny_bollworm_syd1));
                tv3.setText(getString(R.string.spotted_spiny_bollworm_syd2));
                tv4.setText(getString(R.string.spotted_spiny_bollworm_syd3));
                tv5.setText(getString(R.string.spotted_spiny_bollworm_syd4));
               // tv6.setText(getString(R.string.pink_bollworm_syd5));
                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
               // row6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
            case "Leafworm or Tobacco caterpillar": {
                txtt.setText("The identified Pest is Leafworm or Tobacco caterpillar");
                tv1.setText(txttitle+ " of Leafworm or Tobacco caterpillar");
                tv2.setText(getString(R.string.leafworm_tobacco_caterpillar_syd1));
                tv3.setText(getString(R.string.leafworm_tobacco_caterpillar_syd2));
               // tv4.setText(getString(R.string.leafworm_tobacco_caterpillar_syd3));
                //tv5.setText(getString(R.string.jassid_syd4));
                // tv6.setText(getString(R.string.whitefly5));
                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;

            }   case "Thrips":{
                txtt.setText("The identified Pest is Thrips" );
                tv1.setText(txttitle+ " of Thrips");
                tv2.setText(getString(R.string.thrips_syd1));
                tv3.setText(getString(R.string.thrips_syd2));
                tv4.setText(getString(R.string.thrips_syd3));

                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;

            }

        }
}else if (txttitle.contains("Life History")){
        switch (Title) {
            case "Aphid": {
                txtt.setText("The identified Pest is aphid");
                tv1.setText(txttitle + " of aphid");
                tv2.setText(getString(R.string.Aphids_Lh1));
                tv3.setText(getString(R.string.Aphids_Lh2));
                tv4.setText(getString(R.string.Aphids_Lh3));
                tv5.setText(getString(R.string.Aphids_Lh4));
                tv6.setText(getString(R.string.Aphids_Lh5));
                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
            case "Whitefly": {
                txtt.setText("The identified Pest is whitefly");
                tv1.setText(txttitle + " of whitefly");
                tv2.setText(getString(R.string.whitefly_Lh1));
                tv3.setText(getString(R.string.whitefly_Lh2));
                tv4.setText(getString(R.string.whitefly_Lh3));
                tv5.setText(getString(R.string.whitefly_Lh4));
                // tv6.setText(getString(R.string.whitefly5));
                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
            case "Jassid": {
                txtt.setText("The identified Pest is jassid");
                tv1.setText(txttitle + " of Jassid");
                tv2.setText(getString(R.string.jassid_Lh1));
                tv3.setText(getString(R.string.jassid_Lh2));

                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
            case "American bollworm": {
                txtt.setText("The identified Pest is American bollworm");
                txtt.setSingleLine();
                tv1.setText(txttitle + " of American bollworm");
                tv2.setText(getString(R.string.american_bollworm_Lh1));
                tv3.setText(getString(R.string.american_bollworm_Lh2));
                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
            case  "Pink Bollworm": {
                txtt.setText("The identified Pest is Pink Bollworm" );
                txtt.setSingleLine();
                tv1.setText(txttitle+ " of Pink Bollworm");
                tv2.setText(getString(R.string.pink_bollworm_Lh1));
                tv3.setText(getString(R.string.pink_bollworm_Lh2));
                tv4.setText(getString(R.string.pink_bollworm_Lh3));

                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
            case "Spotted and Spiny Bollworm": {
                txtt.setText("The identified Pest is Spotted and Spiny Bollworm" );
                txtt.setSingleLine();
                tv1.setText(txttitle+ " of Spotted and Spiny Bollworm");
                tv2.setText(getString(R.string.spotted_spiny_bollworm_Lh1));
                tv3.setText(getString(R.string.spotted_spiny_bollworm_Lh2));
                tv4.setText(getString(R.string.spotted_spiny_bollworm_Lh3));
                tv5.setText(getString(R.string.spotted_spiny_bollworm_Lh4));
                tv6.setText(getString(R.string.spotted_spiny_bollworm_Lh5));
                tv7.setText(getString(R.string.spotted_spiny_bollworm_Lh6));

                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            } case "Leafworm or Tobacco caterpillar": {
                txtt.setText("The identified Pest is Leafworm or Tobacco caterpillar");
                tv1.setText(txttitle + " of Leafworm or Tobacco caterpillar");
                tv2.setText(getString(R.string.leafworm_tobacco_caterpillar_Lh1));
//                tv3.setText(getString(R.string.leafworm_tobacco_caterpillar_Lh2));

                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
            case "Thrips": {
                txtt.setText("The identified Pest is Thrips");
                tv1.setText(txttitle + " of Thrips");
                tv2.setText(getString(R.string.thrips_Lh1));
                tv3.setText(getString(R.string.thrips_Lh2));
                tv4.setText(getString(R.string.thrips_Lh3));
                tv5.setText(getString(R.string.thrips_Lh4));

                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
        }
}else if (txttitle.contains("Cultural and Mechanical Control")){
        switch (Title) {
            case "Aphid": {
                txtt.setText("The identified Pest is aphid");
                tv1.setText(txttitle + " of aphid");
                tv2.setText(getString(R.string.Aphids_Cmc1));
                tv3.setText(getString(R.string.Aphids_Cmc2));
                tv4.setText(getString(R.string.Aphids_Cmc3));
                tv5.setText(getString(R.string.Aphids_Cmc4));
                tv6.setText(getString(R.string.Aphids_Cmc5));
//                tv7.setText(getString(R.string.whitefly_Cmc6));
//                tv8.setText(getString(R.string.whitefly_Cmc7));

                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
            case "Whitefly": {
                txtt.setText("The identified Pest is whitefly");
                tv1.setText(txttitle + " of whitefly");
                tv2.setText(getString(R.string.whitefly_Cmc1));
                tv3.setText(getString(R.string.whitefly_Cmc2));
                tv4.setText(getString(R.string.whitefly_Cmc3));
                tv5.setText(getString(R.string.whitefly_Cmc4));
                tv6.setText(getString(R.string.whitefly_Cmc5));
                tv7.setText(getString(R.string.whitefly_Cmc6));
                tv8.setText(getString(R.string.whitefly_Cmc7));

                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow8.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
//        trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
            }
            case "Jassid": {
                txtt.setText("The identified Pest is jassid");
                tv1.setText(txttitle + " of Jassid");
                tv2.setText(getString(R.string.jassid_Cmc1));
                tv3.setText(getString(R.string.jassid_Cmc2));
                tv4.setText(getString(R.string.jassid_Cmc3));
                tv5.setText(getString(R.string.jassid_Cmc4));
                tv6.setText(getString(R.string.jassid_Cmc5));
                tv7.setText(getString(R.string.jassid_Cmc6));
                tv8.setText(getString(R.string.jassid_Cmc7));
                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow8.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
            case "American bollworm": {
                txtt.setText("The identified Pest is American bollworm");
                txtt.setSingleLine();
                tv1.setText(txttitle + " of American bollworm");
                tv2.setText(getString(R.string.american_bollworm_Cmc1));
                tv3.setText(getString(R.string.american_bollworm_Cmc2));
                tv4.setText(getString(R.string.american_bollworm_Cmc3));
                tv5.setText(getString(R.string.american_bollworm_Cmc4));
                tv6.setText(getString(R.string.american_bollworm_Cmc5));
                tv7.setText(getString(R.string.american_bollworm_Cmc6));
                tv8.setText(getString(R.string.american_bollworm_Cmc7));
                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow8.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            } case  "Pink Bollworm": {
                txtt.setText("The identified Pest is Pink Bollworm");
                txtt.setSingleLine();
                tv1.setText(txttitle + " of Pink Bollworm");
                tv2.setText(getString(R.string.pink_bollworm_Cmc1));
                tv3.setText(getString(R.string.pink_bollworm_Cmc2));
                tv4.setText(getString(R.string.pink_bollworm_Cmc3));
                tv5.setText(getString(R.string.pink_bollworm_Cmc4));
                tv6.setText(getString(R.string.pink_bollworm_Cmc5));
                tv7.setText(getString(R.string.pink_bollworm_Cmc6));
            //    tv8.setText(getString(R.string.pink_bollworm_Cmc1));
                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }  case "Spotted and Spiny Bollworm": {
                txtt.setText("The identified Pest is Spotted and Spiny Bollworm");
                txtt.setSingleLine();
                tv1.setText(txttitle + " of Spotted and Spiny Bollworm");
                tv2.setText(getString(R.string.spotted_spiny_bollworm_Cmc1));
                tv3.setText(getString(R.string.spotted_spiny_bollworm_Cmc2));
                tv4.setText(getString(R.string.spotted_spiny_bollworm_Cmc3));
                tv5.setText(getString(R.string.spotted_spiny_bollworm_Cmc4));
                tv6.setText(getString(R.string.spotted_spiny_bollworm_Cmc5));
//                tv7.setText(getString(R.string.spotted_spiny_bollworm_Cmc1));
                //    tv8.setText(getString(R.string.pink_bollworm_Cmc1));
                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                //  trow8.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
            case "Leafworm or Tobacco caterpillar": {
                txtt.setText("The identified Pest is Leafworm or Tobacco caterpillar");
                tv1.setText(txttitle + " of Leafworm or Tobacco caterpillar");
                tv2.setText(getString(R.string.leafworm_tobacco_caterpillar_Cmc1));
                tv3.setText(getString(R.string.leafworm_tobacco_caterpillar_Cmc2));
                tv4.setText(getString(R.string.leafworm_tobacco_caterpillar_Cmc3));

                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
            case "Thrips": {
                txtt.setText("The identified Pest is Thrips");
                tv1.setText(txttitle + " of Leafworm or Thrips");
                tv2.setText(getString(R.string.thrips_Cmc1));
                tv3.setText(getString(R.string.thrips_Cmc2));
                tv4.setText(getString(R.string.thrips_Cmc3));
                tv5.setText(getString(R.string.thrips_Cmc4));

                trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }

        }
            }
            else if (txttitle.contains("Biological Control")){
               switch (Title) {
                case "Aphid": {
                    txtt.setText("The identified Pest is aphid");
                    tv1.setText(txttitle + " of aphid");
                    tv2.setText(getString(R.string.Aphids_bc1));
                    tv3.setText(getString(R.string.Aphids_bc2));
                    tv4.setText(getString(R.string.Aphids_bc3));
                    tv5.setText(getString(R.string.Aphids_bc4));

                    trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    break;
                }
                case "Whitefly": {
                    txtt.setText("The identified Pest is whitefly");
                    tv1.setText(txttitle + " of whitefly");
                    tv2.setText(getString(R.string.whitefly_bc1));
                    tv3.setText(getString(R.string.whitefly_bc2));
                    tv4.setText(getString(R.string.whitefly_bc3));
                    tv5.setText(getString(R.string.whitefly_bc4));
                    tv6.setText(getString(R.string.whitefly_bc5));
                    tv7.setText(getString(R.string.whitefly_bc6));

                    trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    break;
                }
                case "Jassid": {
                    txtt.setText("The identified Pest is jassid");
                    tv1.setText(txttitle + " of Jassid");
                    tv2.setText(getString(R.string.jassid_bc1));
                    tv3.setText(getString(R.string.jassid_bc2));
                    tv4.setText(getString(R.string.jassid_bc3));
                    tv5.setText(getString(R.string.jassid_bc4));
                    tv6.setText(getString(R.string.jassid_bc5));
                    tv7.setText(getString(R.string.jassid_bc6));
                    trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    break;
                }
                case "American bollworm": {
                    txtt.setText("The identified Pest is American bollworm");
                    txtt.setSingleLine();
                    tv1.setText(txttitle + " of American bollworm");
                    tv1.setSingleLine();
                    tv2.setText(getString(R.string.american_bollworm_bc1));
                    tv3.setText(getString(R.string.american_bollworm_bc2));
                    tv4.setText(getString(R.string.american_bollworm_bc3));
                    tv5.setText(getString(R.string.american_bollworm_bc4));
                    tv6.setText(getString(R.string.american_bollworm_bc5));
                    tv7.setText(getString(R.string.american_bollworm_bc6));
                    tv8.setText(getString(R.string.american_bollworm_bc7));
                    trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    trow8.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    break;
                }
                case  "Pink Bollworm": {
                    txtt.setText("The identified Pest is Pink Bollworm");
                    txtt.setSingleLine();
                    tv1.setText(txttitle + " of Pink Bollworm");
                    tv1.setSingleLine();
                    tv2.setText(getString(R.string.pink_bollworm_bc1));
                    tv3.setText(getString(R.string.pink_bollworm_bc2));
                    tv4.setText(getString(R.string.pink_bollworm_bc3));
                    tv5.setText(getString(R.string.pink_bollworm_bc4));

                    trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
//                    trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                    break;
                }
                   case "Spotted and Spiny Bollworm": {
                       txtt.setText("The identified Pest is Spotted and Spiny Bollworm");
                       txtt.setSingleLine();
                       tv1.setText(txttitle + " of Spotted and Spiny Bollworm");
                       tv1.setSingleLine();
                       tv2.setText(getString(R.string.spotted_spiny_bollworm_bc1));
                       tv3.setText(getString(R.string.spotted_spiny_bollworm_bc2));
                       tv4.setText(getString(R.string.spotted_spiny_bollworm_bc3));
//                       tv5.setText(getString(R.string.pink_bollworm_bc4));

                       trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                       trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
//                    trow6.setBackgroundColor(Color.parseColor("#D3D3D3"));
                       break;//                    trow8.setBackgroundColor(Color.parseColor("#D3D3D3"));
                   }
                   case "Leafworm or Tobacco caterpillar": {
                       txtt.setText("The identified Pest is Leafworm or Tobacco caterpillar");
                       txtt.setSingleLine();
                       tv1.setText(txttitle + " of Leafworm or Tobacco caterpillar");
                       tv1.setSingleLine();
                       tv2.setText(getString(R.string.leafworm_tobacco_caterpillar_bc1));
                       tv3.setText(getString(R.string.leafworm_tobacco_caterpillar_bc2));
                       tv4.setText(getString(R.string.leafworm_tobacco_caterpillar_bc3));
                       tv5.setText(getString(R.string.leafworm_tobacco_caterpillar_bc4));

                       trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                       trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                       break;
                   }
                   case "Thrips": {
                       txtt.setText("The identified Pest is Thrips");
                       txtt.setSingleLine();
                       tv1.setText(txttitle + " of Leafworm or Thrips");
                       tv1.setSingleLine();
                       tv2.setText(getString(R.string.thrips_bc1));
                       tv3.setText(getString(R.string.thrips_bc2));
                       tv4.setText(getString(R.string.thrips_bc3));
                       tv5.setText(getString(R.string.thrips_bc4));

                       trow2.setBackgroundColor(Color.parseColor("#D3D3D3"));
                       trow4.setBackgroundColor(Color.parseColor("#D3D3D3"));
                       break;
                   }
            }
    }



//        tts=new TextToSpeech(DialogActivity.this,new TextToSpeech.OnInitListener() {
//            @Override
//            public void onInit(int status) {
//                if(status!=TextToSpeech.ERROR) {
//                    tts.setLanguage(Locale.US);
//                }
//            }
//        });

        audio_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                speakOut();
           //     tts.speak(txtt.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                //  mediaplayer.setDataSource(context, Uri.parse("android.resource://urpackagename/res/raw/urmp3name");
               // audioPlayer(title);

            }
        });
    }
    @Override
    public void onDestroy() {
        // Don't forget to shutdown tts!
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    @Override
    public void onInit(int status) {

        if (status == TextToSpeech.SUCCESS) {
            tts.setSpeechRate(0.8f);
            int result = tts.setLanguage(Locale.US);

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } else {
                audio_btn.setEnabled(true);
                //speakOut();
            }

        } else {
            Log.e("TTS", "Initilization Failed!");
        }

    }
    private void speakOut() {
        String sptxt = null;

        sptxt = tv2.getText().toString()+"::"+tv3.getText().toString()+"::"+tv4.getText().toString()+"::"+tv5.getText().toString()+"::"+tv6.getText().toString();
        tts.speak(sptxt,TextToSpeech.QUEUE_FLUSH,null);



       // String text = txtt.getText().toString();
//        tts.speak(tv2.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
//        tts.speak(tv3.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
//        tts.speak(tv4.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
//        tts.speak(tv5.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
//        tts.speak(tv6.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);

       // tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }



    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.back:

                showToastMessage("Ok Button Clicked");
                this.finish();

                break;

//            case R.id.cancel_btn_id:
//
//                showToastMessage("Cancel Button Clicked");
//                this.finish();
//
//                break;
        }

    }
    public void audioPlayer(String fileName){

        fileName = fileName.toLowerCase();

        try {

            int resID=getResources().getIdentifier(fileName, "raw", getPackageName());

            //set up MediaPlayer
            mediaPlayer= MediaPlayer.create(this,resID);
            mediaPlayer.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        { //Back key pressed
            //Things to Do
            if(mediaPlayer!= null)
            {
                mediaPlayer.stop();
                mediaPlayer=null;
            }
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    void showToastMessage(String message) {
//        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT)
//                .show();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();

    }


}