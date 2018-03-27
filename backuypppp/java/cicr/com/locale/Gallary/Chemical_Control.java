package cicr.com.locale.Gallary;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import cicr.com.locale.Adapter.ListAdapter.customButtonListener;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;

import android.widget.Button;
import android.widget.ListView;

import android.widget.PopupWindow;
import android.widget.TextView;

import android.widget.Toast;
import cicr.com.locale.Adapter.GlobalClass;
import cicr.com.locale.Adapter.ListAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.content.DialogInterface;
import cicr.com.locale.R;

import static cicr.com.locale.R.id.dismiss;


public class Chemical_Control extends Activity implements
        customButtonListener{

    TextView tv4,tv5,tv6,tv7,tv8;
    Button insecticide1,insecticide2,insecticide3,insecticide4,insecticide5,backbutton;

    private ListView listView;
    ListAdapter adapter;
    ArrayList<String> dataItems = new ArrayList<String>();
    String[] dataArray ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemicalcontrol);
        TextView title = (TextView) findViewById(R.id.title);
        TextView Pestnamediscrip = (TextView) findViewById(R.id.textView12);
        backbutton   = (Button) findViewById(R.id.back);
        // Calling Application class (see application tag in AndroidManifest.xml)
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
        // Get Title from global/application context
        final String Title  = globalVariable.getTitle();

      //  Toast.makeText(Chemical_Control.this,Title,Toast.LENGTH_LONG).show();
switch (Title) {
    case  "Aphid": {
        title.setText("The identified Pest is aphid");
        Pestnamediscrip.setText(Html.fromHtml("The Following insecticide recommended for the control of aphid.(<i><b>There is option to select brands for the insecticide</b></i>)"));
        dataArray = getResources().getStringArray(R.array.Aphids_chemical_brand);
        break;
    }
    case "Whitefly":
    {
        title.setText("The identified Pest is whitefly" );
        Pestnamediscrip.setText(Html.fromHtml("The Following insecticide recommended for the control of whitefly.(<i><b>There is option to select brands for the insecticide</b></i>)"));
        dataArray = getResources().getStringArray(R.array.Whitefly_chemical_brand);
        break;
    }
    case "Jassid":
    {
        title.setText("The identified Pest is jassid" );
        Pestnamediscrip.setText(Html.fromHtml("The Following insecticide recommended for the control of jassid.(<i><b>There is option to select brands for the insecticide</b></i>)"));
        dataArray = getResources().getStringArray(R.array.Jassid_chemical_brand);
        break;
    }
    case "American bollworm":
    {
        title.setText("The identified Pest is American bollworm" );
        title.setSingleLine();
        Pestnamediscrip.setText(Html.fromHtml("The Following insecticide recommended for the control of American bollworm.(<i><b>There is option to select brands for the insecticide</b></i>)"));
        dataArray = getResources().getStringArray(R.array.american_bollworm_chemical_brand);
        break;
    }
    case  "Pink Bollworm":
    {
        title.setText("The identified Pest is Pink Bollworm" );
        title.setSingleLine();
        Pestnamediscrip.setText(Html.fromHtml("The Following insecticide recommended for the control of Pink Bollworm.(<i><b>There is option to select brands for the insecticide</b></i>)"));
        dataArray = getResources().getStringArray(R.array.pink_bollworm_chemical_brand);
        break;
    }
    case "Spotted and Spiny Bollworm":
    {
        title.setText("The identified Pest is Spotted and Spiny Bollworm" );
        title.setSingleLine();
        Pestnamediscrip.setText(Html.fromHtml("The Following insecticide recommended for the control of Spotted and Spiny Bollworm.(<i><b>There is option to select brands for the insecticide</b></i>)"));
        dataArray = getResources().getStringArray(R.array.spotted_spiny_bollworm_chemical_brand);
        break;
    } case "Thrips":
    {
        title.setText("The identified Pest is Thrips" );
        title.setSingleLine();
        Pestnamediscrip.setText(Html.fromHtml("The Following insecticide recommended for the control of Thrips.(<i><b>There is option to select brands for the insecticide</b></i>)"));
        dataArray = getResources().getStringArray(R.array.thrips_chemical_brand);
        break;
    }
    case "Leafworm or Tobacco caterpillar":
    {
        title.setText("The identified Pest is Leafworm or Tobacco caterpillar" );
        title.setSingleLine();
        Pestnamediscrip.setText(Html.fromHtml("The Following insecticide recommended for the control of Leafworm or Tobacco caterpillar.(<i><b>There is option to select brands for the insecticide</b></i>)"));
        dataArray = getResources().getStringArray(R.array.leafworm_tobacco_caterpillar_chemical_brand);
        break;
    }
}



        List<String> dataTemp = Arrays.asList(dataArray);
        dataItems.addAll(dataTemp);
        listView = (ListView) findViewById(R.id.mobile_list);
        adapter = new ListAdapter(Chemical_Control.this, dataItems);
        adapter.setCustomButtonListner(Chemical_Control.this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    final int position, long id) {

                String main = listView.getSelectedItem().toString();
                Toast.makeText(Chemical_Control.this,main,Toast.LENGTH_LONG).show();
            }
        });
//         tv4 = (TextView)findViewById(R.id.row4txt4);
//         tv5 = (TextView)findViewById(R.id.row5txt5);
//         tv6 = (TextView)findViewById(R.id.row6txt6);
//         tv7 = (TextView)findViewById(R.id.row7txt7);
//         tv8 = (TextView)findViewById(R.id.row8txt8);
//        TableRow trow5,trow7;
//        trow5 = (TableRow) findViewById(R.id.tableRow5);
//        trow7 = (TableRow) findViewById(R.id.tableRow7);
//
//         insecticide1 = (Button) findViewById(R.id.insecticide1);
//         insecticide2 = (Button) findViewById(R.id.insecticide2);
//         insecticide3 = (Button) findViewById(R.id.insecticide3);
//         insecticide4 = (Button) findViewById(R.id.insecticide4);
//         insecticide5 = (Button) findViewById(R.id.insecticide5);


       // final String title_jas = getIntent().getStringExtra("title_jas_new");




//        insecticide1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                insecticide.putExtra("insecticide_brand",tv4.getText().toString());
//                startActivity(insecticide);
//            }
//        });
//        insecticide2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                insecticide.putExtra("insecticide_brand",tv5.getText().toString());
//                startActivity(insecticide);
//            }
//        });
//        insecticide3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                insecticide.putExtra("insecticide_brand",tv6.getText().toString());
//                startActivity(insecticide);
//            }
//        });
//
//        insecticide4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                insecticide.putExtra("insecticide_brand",tv7.getText().toString());
//                startActivity(insecticide);
//            }
//        });
//        insecticide5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                insecticide.putExtra("insecticide_brand",tv8.getText().toString());
//                startActivity(insecticide);
//            }
//        });
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();

    }
    @Override
    public void onButtonClickListner(int position, String value) {
//        AlertDialog.Builder alertDialog = new AlertDialog.Builder(Chemical_Control.this);
//        LayoutInflater inflater = getLayoutInflater();
//        View convertView = (View) inflater.inflate(R.layout.popup_application, null);
//        alertDialog.setView(convertView);
//        alertDialog.setTitle("List");
//        alertDialog.show();

        String[] items = {"AAAAAA","BBBBBBB", "CCCCCCC","DDDDDDDD"};
        AlertDialog.Builder builder = new AlertDialog.Builder(Chemical_Control.this);
        //set the title for alert dialog
        builder.setTitle("Choose names: ");
        //set items to alert dialog. i.e. our array , which will be shown as list view in alert dialog
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override public void onClick(DialogInterface dialog, int item) {
                //setting the button text to the selected itenm from the list
                button.setText(items[item]);
            }
        });
        //Creating CANCEL button in alert dialog, to dismiss the dialog box when nothing is selected
        builder .setCancelable(false)
                .setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
                    @Override  public void onClick(DialogInterface dialog, int id) {
                        //When clicked on CANCEL button the dalog will be dismissed
                        dialog.dismiss();
                    }
                });
        //Creating alert dialog
        AlertDialog alert =builder.create();
        //Showingalert dialog
        alert.show();

        // Intent insecticide = new Intent(Chemical_Control.this,BrandOption.class);
        Toast.makeText(Chemical_Control.this,value,Toast.LENGTH_LONG).show();
      //  insecticide.putExtra("insecticide_brand",value);
      //          startActivity(insecticide);
//        Toast.makeText(Chemical_Control.this, "Button click " + value,
//                Toast.LENGTH_SHORT).show();

    }
}
