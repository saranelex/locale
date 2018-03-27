package cicr.com.locale.Gallary;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import cicr.com.locale.Adapter.GlobalClass;
import cicr.com.locale.R;

/**
 * Created by harish on 08-12-2016.
 */

public class Etl extends Activity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etl);
        final Intent PesticideIntent = new Intent(Etl.this, Chemical_Control.class);

        TextView Pestname = (TextView) findViewById(R.id.title);
        ImageView immpst = (ImageView) findViewById(R.id.imageView);
        final Button rb1 = (Button) findViewById(R.id.BELOW_50DAYS);
        final Button rb2 = (Button) findViewById(R.id.BELOW_2_Nymphs);
        final Button rb3 = (Button) findViewById(R.id.ABOVE_50_DAYS);
        final Button rb4 = (Button) findViewById(R.id.ABOVE_2_Nymphs);
        // Button btn = (Button) findViewById(R.id.checketl);
        Button backbutton= (Button) findViewById(R.id.back);
        TextView buttondescription = (TextView) findViewById(R.id.buttondescription);

        //   final String title_jas = getIntent().getStringExtra("title");
// Calling Application class (see application tag in AndroidManifest.xml)
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
        // Get Title from global/application context
        final String Title  = globalVariable.getTitle();

        int displayWidth = getWindowManager().getDefaultDisplay().getHeight();
        immpst.getLayoutParams().height = displayWidth / 4;

        switch (Title){
            case "Aphid":
            {
                Pestname.setText("The identified Pest is aphid");
                immpst.setImageResource(R.drawable.id_aphid_thumb);
                rb2.setText(R.string.aphids_beloweti);
                rb4.setText(R.string.aphids_aboveeti);
                rb1.setVisibility(View.GONE);
                rb3.setVisibility(View.GONE);
                break;
            }
            case "Whitefly":{
                Pestname.setText("The identified Pest is whitefly" );
                immpst.setImageResource(R.drawable.id_whitefly_thumb);
                rb2.setText(R.string.whitefly_beloweti);
                rb4.setText(R.string.whitefly_aboveeti);
                rb1.setVisibility(View.GONE);
                rb3.setVisibility(View.GONE);
                break;
            }
            case "Jassid": {
                Pestname.setText("The identified Pest is jassid" );
                immpst.setImageResource(R.drawable.id_jassid_thumb);
                rb2.setText(R.string.jasside_beloweti);
                rb4.setText(R.string.jasside_aboveeti);
                buttondescription.setText("Grade II:  Crinkling and curling of few leaves in the lower portion of plant+ marginal yellowing of leaves\n\n" +
                        "Grade III: Crinkling and curling of leaves almost all over the plant.\n\n" +
                        "Grade IV: Extreme curling, crinkling, yellowing, bronzing\n");

                buttondescription.setBackgroundColor(Color.parseColor("#D3D3D3"));
                rb1.setVisibility(View.GONE);
                rb3.setVisibility(View.GONE);
                break;
            }
            case "American bollworm":{
                Pestname.setText("The identified Pest is American bollworm" );
                Pestname.setSingleLine();
                immpst.setImageResource(R.drawable.id_bollworm_thumb);
                rb2.setText(R.string.american_bolworm_beloweti);
                rb4.setText(R.string.american_bolworm_aboveeti);
                rb1.setVisibility(View.GONE);
                rb3.setVisibility(View.GONE);
                break;
            }  case  "Pink Bollworm": {
                Pestname.setText("The identified Pest is Pink Bollworm");
                Pestname.setSingleLine();
                immpst.setImageResource(R.drawable.pink_bollworm);
                rb2.setText(R.string.pinkbollworm_beloweti);
                rb4.setText(R.string.pinkbollworm_aboveeti);
                rb1.setText(R.string.pinkbollworm_beloweti1);
                rb3.setText(R.string.pinkbollworm_aboveeti1);
                break;
            }
            case "Spotted and Spiny Bollworm": {
                Pestname.setText("The identified Pest is Spotted and Spiny Bollworm");
                Pestname.setSingleLine();
                immpst.setImageResource(R.drawable.spotted_spiny_bollworm);
                rb2.setText(R.string.spiny_bollworm_beloweti);
                rb4.setText(R.string.spiny_bollworm_aboveeti);
                rb1.setVisibility(View.GONE);
                rb3.setVisibility(View.GONE);
                break;
            }
            case "Leafworm or Tobacco caterpillar": {
                Pestname.setText("The identified Pest is Leafworm or Tobacco caterpillar");
                Pestname.setSingleLine();
                immpst.setImageResource(R.drawable.leafworm_tobacco_caterpillar);
                rb2.setText(R.string.leafworm_beloweti);
                rb4.setText(R.string.leafworm_aboveeti);
             //   row2text21.setText(Html.fromHtml("Chlorantraniliprole<br> 18.5% SC"));

                rb1.setText("Less than 5 full grown larvae on less than 10 plant out of sample of 20 plants per acre at early to peak vegetative stage.\n" +
                        "  (OR)\n " +
                        " One skeletonised leaves per plant on 10 plants out of sample of 20 plants per acre upto 60 days after sowing.");
                rb3.setText("More than 4 full grown larvae on more than 9 plant out of sample of 20 plants per acre at early to peak vegetative stage.\n" +
                        "       (OR)\n" +
                        "More than one skeletonised leaves per plant on 10 plants out of sample of 20 plants per acre upto 60 days after sowing.");
                break;
            }
            case "Thrips": {
                Pestname.setText("The identified Pest is Thrips");
                Pestname.setSingleLine();
                immpst.setImageResource(R.drawable.thrips);
                rb2.setText(R.string.thrips_beloweti);
                rb4.setText(R.string.thrips_aboveeti);
                rb1.setVisibility(View.GONE);
                rb3.setVisibility(View.GONE);
                buttondescription.setText("Grade II: Silvery patches on underside leaves above mid canopy\n\n" +
                        "Grade III: Light brown patches visible alongside of veins\n\n" +
                        "Grade IV: Stiffness of leaves to severe rusty appearance of the crop\n");
                buttondescription.setBackgroundColor(Color.parseColor("#D3D3D3"));
                buttondescription.setBackgroundColor(Color.parseColor("#D3D3D3"));
                break;
            }
        }



//        Spinner smallmspin=(Spinner) findViewById(R.id.spinner);
//        Spinner largespin = (Spinner) findViewById(R.id.spinner2);
//        Integer[] itemslarge = new Integer[]{51,52,53,54,55,56,57,58,59,60};
//        Integer[] itemssmall = new Integer[]{1,2,3,4,5,6,7,8,9,10};
//     //   ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_item, items);
//
//        ArrayAdapter<Integer> smadapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_dropdown_item, itemssmall);
//        smallmspin.setAdapter(smadapter);
//
//        ArrayAdapter<Integer> largeadapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_dropdown_item, itemslarge);
//        largespin.setAdapter(largeadapter);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        rb1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
             //   showPopup();

                   showPopup();

            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                    showPopup();


            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                   // PesticideIntent.putExtra("title_jas_new", title_jas);
                    startActivity(PesticideIntent);



            }
        });
        rb4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                  //  PesticideIntent.putExtra("title_jas_new", title_jas);
                    startActivity(PesticideIntent);


            }
        });
    }
    private void showPopup() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Economic Threshold Level");
        builder.setMessage("The Pest infestation is below Economic Threshold Level(ETL) no need for any insecticide application");
        builder.setPositiveButton("OK", null);//second parameter used for onclicklistener
       // builder.setNegativeButton("Cancel", null);
        builder.show();


//        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style. MyAlertDialogStyle);
//        builder.setTitle("Economic Threshold Level");
//       // builder.setMessage("Select your Choice");
//
//        LayoutInflater inflater = getLayoutInflater();
//        View Layout = inflater.inflate(R.layout.popup, null);
//        builder.setView(Layout);
//        builder.setPositiveButton("OK", null);
//        builder.show();

//        builder.setPositiveButton("Ok",
//                new DialogInterface.OnClickListener() {
//
//                    public void onClick(DialogInterface dialog, int which) {
//                        // Do nothing but close the dialog
//                    }
//                });
//
//        // Remember, create doesn't show the dialog
//        AlertDialog helpDialog = builder.create();
//        helpDialog.show();
    }


    @Override
    public void onBackPressed() {
                super.onBackPressed();
        this.finish();
    }
}
