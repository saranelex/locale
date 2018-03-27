package cicr.com.locale.Gallary;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Matrix;
import java.util.ResourceBundle;

import cicr.com.locale.Adapter.GlobalClass;
import cicr.com.locale.R;
import uk.co.senab.photoview.PhotoViewAttacher;

public class Description_Image_Activity extends Activity {


    private ResourceBundle resources;
    PhotoViewAttacher mAttacher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_image);

        Button backbutton= (Button) findViewById(R.id.back);
        Button Identification  = (Button) findViewById(R.id.Identification);
        Button Classification  = (Button) findViewById(R.id.Classification);
        Button Damage_symptoms = (Button) findViewById(R.id.damage_symptoms);
        Button Life_history    = (Button) findViewById(R.id.life_history);

        TextView txtt = (TextView) findViewById(R.id.title);
        ImageView imageView123 = (ImageView) findViewById(R.id.image_url);
        Intent mIntent = getIntent();

        // Calling Application class (see application tag in AndroidManifest.xml)
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
// Get Title from global/application context
         String Title  = globalVariable.getTitle();
       // title =  title.replace("res/drawable/", "");
       // int intValue = mIntent.getIntExtra("intVariableName", 0);
//        final String pesttitle = getIntent().getStringExtra("pestt");
//        final  Bitmap bitmap = getIntent().getParcelableExtra("imagenew");
        final boolean bitmap = getIntent().hasExtra("imagenew");
               // ImageView imageView = (ImageView) findViewById(R.id.image);
      //  Toast.makeText(Description_Image_Activity.this,Title,Toast.LENGTH_LONG).show();

//        String titlepest;
//        if(Title != null && !Title.isEmpty()){
//            titlepest = Title;
//
//        }else{
//            titlepest = pesttitle;
//        }
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
            case "American bollworm": {
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

        /*if(Title.equals("Aphid")) {
            txtt.setText("The identified Pest is aphid" );
        }else if(Title.equals("Whitefly")) {
            txtt.setText("The identified Pest is whitefly");
        } else if(Title.equals("Jassid")) {
            txtt.setText("The identified Pest is jassid");
        }else if(Title.equals("American bollworm")) {
            txtt.setText("The identified Pest is American bollworm");
            txtt.setSingleLine();
        }else if(Title.equals("Thrips")) {
            txtt.setText("The identified Pest is Thrips");
        }
        else if(Title.equals("Pink Bollworm")) {
            txtt.setText("The identified Pest is Pink Bollworm");
            txtt.setSingleLine();
        }
        else if(Title.equals("Spotted and Spiny Bollworm")) {
            txtt.setText("The identified Pest is Spotted and Spiny Bollworm");
            txtt.setSingleLine();
        }
        else if(Title.equals("Leafworm or Tobacco caterpillar")) {
            txtt.setText("The identified Pest is Leafworm or Tobacco caterpillar");
            txtt.setSingleLine();
        }
*/
    if(bitmap == true) {
        final Bitmap b = BitmapFactory.decodeByteArray(getIntent().getByteArrayExtra("imagenew"), 0, getIntent().getByteArrayExtra("imagenew").length);

        int displayWidth = getWindowManager().getDefaultDisplay().getHeight();
        imageView123.getLayoutParams().height = displayWidth / 2;

        imageView123.setImageBitmap(b);

        mAttacher = new PhotoViewAttacher(imageView123);
    }
        final Button management_button = (Button) findViewById(R.id.management);
     //   Button audiobutton = (Button) findViewById(R.id.audiobutton);
//        imageView123.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               // loadPhoto(imageView123, 500,500);
//                showImage(b);
//            }
//        });

//        audiobutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                //  mediaplayer.setDataSource(context, Uri.parse("android.resource://urpackagename/res/raw/urmp3name");
//                audioPlayer(title);
//
//            }
//        });
        Identification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Identification();
            }
        });
        Classification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Classification();
            }
        });
        Damage_symptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Damage_symptoms();
            }
        });
        Life_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Life_history();
            }
        });
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        management_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Description_Image_Activity.this, Management.class);
               // i.putExtra("title", title);
                startActivity(i);
            }
        });
    }




    public void Classification(){
        Intent i = new Intent(Description_Image_Activity.this, DialogActivity.class);
     //   i.putExtra("title", title);
        i.putExtra("txttitle","Classification");
        startActivity(i);
    }
    public void Identification(){
        Intent i = new Intent(Description_Image_Activity.this, DialogActivity.class);
      //  i.putExtra("title", title);
        i.putExtra("txttitle","Identification");
        startActivity(i);
    }
    public void Damage_symptoms(){
        Intent i = new Intent(Description_Image_Activity.this, DialogActivity.class);
       // i.putExtra("title", title);
        i.putExtra("txttitle","Damage Symptoms");
        startActivity(i);
    }
    public void Life_history(){
        Intent i = new Intent(Description_Image_Activity.this, DialogActivity.class);
      //  i.putExtra("title", title);
        i.putExtra("txttitle","Life History");
        startActivity(i);
    }
//    public void showImage(Bitmap bitmap) {
//
//        final Dialog builder = new Dialog(this);
//        builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        builder.setCancelable(true);
//        builder.getWindow().setBackgroundDrawable(
//                new ColorDrawable(android.graphics.Color.TRANSPARENT));
//
//        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
//            @Override
//            public void onDismiss(DialogInterface dialogInterface) {
//                //nothing;
//                builder.dismiss();
//            }
//        });
//
//        ImageView imageView = new ImageView(this);
//        imageView.setImageBitmap(bitmap);
//
//        //imageView.setImageURI(imageUri);
//
//        builder.addContentView(imageView, new RelativeLayout.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT));
//        builder.show();
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                builder.dismiss();
//            }
//        });
//    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();

    }
//    private void loadPhoto(ImageView imageView, int width, int height) {
//
//        ImageView tempImageView = imageView;
//
//
//        AlertDialog.Builder imageDialog = new AlertDialog.Builder(this);
//        LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
//
//        View layout = inflater.inflate(R.layout.custom_fullimage_dialog,
//                (ViewGroup) findViewById(R.id.layout_root));
//        ImageView image = (ImageView) layout.findViewById(R.id.fullimage);
//        image.setImageDrawable(tempImageView.getDrawable());
//        imageDialog.setView(layout);
//
//        imageDialog.setPositiveButton(resources.getString(String.valueOf(R.string.ok_button)), new DialogInterface.OnClickListener(){
//
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
//            }
//
//        });
//
//
//        imageDialog.create();
//        imageDialog.show();
//    }

//    @Override
//    public boolean onMenuItemClick(MenuItem menuItem) {
//        switch (menuItem.getItemId()) {
//            case R.id.chemical_control:
//                Toast.makeText(this, "Comedy Clicked", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.bio_control:
//                Toast.makeText(this, "Movies Clicked", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.natural_control:
//                Toast.makeText(this, "Music Clicked", Toast.LENGTH_SHORT).show();
//                return true;
//        }
//        return false;
//    }
}
