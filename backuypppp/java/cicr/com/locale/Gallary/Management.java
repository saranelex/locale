package cicr.com.locale.Gallary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cicr.com.locale.Adapter.GlobalClass;
import cicr.com.locale.R;

public class Management extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);

        Button Checimal_Control = (Button) findViewById(R.id.Chemical_Control);
        Button Biological_Controlon = (Button) findViewById(R.id.Biological_Controlon);
        Button Cul_mach_control = (Button) findViewById(R.id.Cul_mach_control);
        Button backbutton= (Button) findViewById(R.id.back);
        TextView txtt = (TextView) findViewById(R.id.title);
      //  final String title = getIntent().getStringExtra("title");
// Calling Application class (see application tag in AndroidManifest.xml)
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
        // Get Title from global/application context
        final String Title  = globalVariable.getTitle();


        switch (Title){
            case "Aphid":
            {
                txtt.setText("The identified Pest is aphid" );
                break;
            }
            case "Whitefly":{
                txtt.setText("The identified Pest is whitefly");
                break;
            }
            case "Jassid": {
                txtt.setText("The identified Pest is jassid");
                break;
            }
            case "American bollworm":{
                txtt.setText("The identified Pest is American bollworm");
                txtt.setSingleLine();
                break;
            }
            case  "Pink Bollworm": {
                txtt.setText("The identified Pest is Pink Bollworm");
                txtt.setSingleLine();
                break;
            }
            case "Spotted and Spiny Bollworm": {
                txtt.setText("The identified Pest is Spotted and Spiny Bollworm");
                txtt.setSingleLine();
                break;
            }
            case "Leafworm or Tobacco caterpillar": {
                txtt.setText("The identified Pest is Leafworm or Tobacco caterpillar");
                txtt.setSingleLine();
               break;
            }
            case "Thrips": {
                txtt.setText("The identified Pest is Thrips");
                txtt.setSingleLine();
                break;
            }
        }


        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        Checimal_Control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chemicalIntent = new Intent(getApplicationContext(), Etl.class);
               // chemicalIntent.putExtra("title", title);
                startActivity(chemicalIntent);
            }
        });
        Biological_Controlon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent biocontrolIntent = new Intent(getApplicationContext(),DialogActivity.class);
                biocontrolIntent.putExtra("txttitle","Biological Control");
              //  biocontrolIntent.putExtra("title", title);
                startActivity(biocontrolIntent);
            }
        });
        Cul_mach_control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent naturalcontrolIntent = new Intent(getApplicationContext(),DialogActivity.class);
                naturalcontrolIntent.putExtra("txttitle","Cultural and Mechanical Control");
                startActivity(naturalcontrolIntent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}

