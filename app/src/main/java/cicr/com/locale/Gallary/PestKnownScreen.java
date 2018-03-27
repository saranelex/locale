package cicr.com.locale.Gallary;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Locale;

import cicr.com.locale.Adapter.GlobalClass;
import cicr.com.locale.Adapter.GridViewAdapterPest;
import cicr.com.locale.R;

    public class PestKnownScreen extends Activity {
        private GridView gridView;
        private GridViewAdapterPest gridAdapter;
        TextToSpeech t1;
        Button audio_btn;
        TextView relattxt_title;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.pestknownscreen);
            audio_btn = (Button) findViewById(R.id.audio_btn_id);
            Button backbutton= (Button) findViewById(R.id.gallery_back);

          //  TextView txt_title = (TextView) findViewById(R.id.textView10);

            //relattxt_title = (TextView) findViewById(R.id.textView7);
            //relattxt_title.setSingleLine();
            //relattxt_title.setText(getString(R.string.image_related2));
            //final String flower_im = getIntent().getStringExtra("flower_leaf_stem_boll");
            // Calling Application class (see application tag in AndroidManifest.xml)
            //  final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
// Get Title from global/application context
            //   final String flower_im  = globalVariable.getFlower_Leaf();

            //txt_title.setText("Related Images");
//        if(flower_im.equals("flower_images")) {
//            txt_title.setText("Flower Damage");
//        }	else if(flower_im.equals("stem_images")) {
//            txt_title.setText("Stem Damage");
//        }else if(flower_im.equals("leaf_images")) {
//            txt_title.setText("Leaf Damage");
//        }else if(flower_im.equals("boll_images")) {
//            txt_title.setText("Boll Damage");
//        }
            audio_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String toSpeak = relattxt_title.getText().toString();
                    //  Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                    t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

                }
            });
            t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if(status != TextToSpeech.ERROR) {
                        t1.setLanguage(Locale.UK);
                        t1.setSpeechRate(0.8f);
                    }
                }
            });


            gridView = (GridView) findViewById(R.id.pest_gridView);
            gridAdapter = new GridViewAdapterPest(this, R.layout.pest_grid_item_layout, getData1());
            gridView.setAdapter(gridAdapter);

            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                    ImageItem item = (ImageItem) parent.getItemAtPosition(position);

                    Bitmap bitmap= item.getImage();// your bitmap
                    ByteArrayOutputStream bs = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);
//
                   // Toast.makeText(cicr.com.locale.Gallary.PestKnownScreen.this,bs.toByteArray().toString(),Toast.LENGTH_LONG).show();
                    //	Toast.makeText(Image_MainActivity.this, temp.toString(), Toast.LENGTH_LONG).show();
                    //Create intent

                     GlobalClass globalVariable = (GlobalClass) getApplicationContext();
                    switch (item.getTitle()) {
                        case "Aphid" : {
                            globalVariable.setTitle("Aphid");
                            break;
                        }case "American bollworm" : {
                            globalVariable.setTitle("American bollworm");
                            break;
                        } case "Jassid": {
                            globalVariable.setTitle("Jassid");
                            break;
                        }case "Whitefly": {
                            globalVariable.setTitle("Whitefly");
                            break;
                        }case "Pink Bollworm": {
                            globalVariable.setTitle("Pink Bollworm");
                            break;
                        }case "Spotted and Spiny Bollworm": {
                            globalVariable.setTitle("Spotted and Spiny Bollworm");
                            break;
                        }case "Thrips": {
                            globalVariable.setTitle("Thrips");
                            break;
                        }case "Leafworm or Tobacco caterpillar": {
                            globalVariable.setTitle("Leafworm or Tobacco caterpillar");
                            break;
                        }
                    }

                    Intent intent = new Intent(cicr.com.locale.Gallary.PestKnownScreen.this, Description_Image_Activity.class);
                         intent.putExtra("title", item.getTitle());
                    //  intent.putExtra("byteArray",bs.toByteArray());
//                    intent.putExtra("pestt",item.getTitle());
                    intent.putExtra("imagenew",bs.toByteArray());
                    // intent.putExtra("image",item.getImage());
                    //Start details activity
                    startActivity(intent);
                }
            });
            backbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBackPressed();
                }
            });


        }

        /**
         * Prepare some dummy data for gridview
         */

        private ArrayList<ImageItem> getData1() {
            final ArrayList<ImageItem> imageItems = new ArrayList<ImageItem>();

            // Calling Application class (see application tag in AndroidManifest.xml)
           // final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
// Get Title from global/application context
         //   final String Title  = globalVariable.getTitle();

            String[] pestknown1  = getResources().getStringArray(R.array.pestknown);
            String nameofpest = "";

                    TypedArray imgs = getResources().obtainTypedArray(R.array.pestknown);

                    for (int i = 0; i < imgs.length(); i++) {
                        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));



if(pestknown1[i].equals("res/drawable/american_bollworm.jpg")){
    nameofpest = pestknown1[i].replace("res/drawable/american_bollworm.jpg","American bollworm");
    System.out.print("hello" +nameofpest );
//    imageItems.add(new ImageItem(bitmap,pestknown1[i].replace("res/drawable/american_bollworm.jpg","American Bollworm")));

} else if(pestknown1[i].equals("res/drawable/aphid.jpg")){
    nameofpest = pestknown1[i].replace("res/drawable/aphid.jpg","Aphid");
//    imageItems.add(new ImageItem(bitmap,pestknown1[i].replace("res/drawable/aphid.jpg","Aphid")));

} else if(pestknown1[i].equals("res/drawable/jassid.jpg")){
    nameofpest= pestknown1[i].replace("res/drawable/jassid.jpg","Jassid");
//    imageItems.add(new ImageItem(bitmap,pestknown1[i].replace("res/drawable/jassid.jpg","Jassid")));

} else if(pestknown1[i].equals("res/drawable/pink_bollworm.jpg")){
    nameofpest= pestknown1[i].replace("res/drawable/pink_bollworm.jpg","Pink Bollworm");
//    imageItems.add(new ImageItem(bitmap,pestknown1[i].replace("res/drawable/pink_bollworm.jpg","Pink Bollworm")));

} else if(pestknown1[i].equals("res/drawable/spotted_spiny_bollworm.jpg")){
    nameofpest= pestknown1[i].replace("res/drawable/spotted_spiny_bollworm.jpg","Spotted and Spiny Bollworm");
//    imageItems.add(new ImageItem(bitmap,pestknown1[i].replace("res/drawable/spotted_spiny_bollworm.jpg","Spotted and Spiny Bollworm")));

} else if(pestknown1[i].equals("res/drawable/thrips.jpg")){
    nameofpest = pestknown1[i].replace("res/drawable/thrips.jpg","Thrips");
//    imageItems.add(new ImageItem(bitmap,pestknown1[i].replace("res/drawable/thrips.jpg","Thrips")));

} else if(pestknown1[i].equals("res/drawable/leafworm_tobacco_caterpillar.jpg")){
    nameofpest = pestknown1[i].replace("res/drawable/leafworm_tobacco_caterpillar.jpg","Leafworm or Tobacco caterpillar");
//         imageItems.add(new ImageItem(bitmap,pestknown1[i].replace("res/drawable/leafworm_tobacco_caterpillar.jpg","Leafworm or Tobacco caterpillar")));

} else if(pestknown1[i].equals("res/drawable/whitefly.jpg")){
    nameofpest = pestknown1[i].replace("res/drawable/whitefly.jpg","Whitefly");
//                imageItems.add(new ImageItem(bitmap,pestknown1[i].replace("res/drawable/whitefly.jpg","Whitefly")));

                        }
                        imageItems.add(new ImageItem(bitmap,nameofpest));
                        //  imageItems.add(new ImageItem(bitmap, "aphid" + i));
                    }

            return imageItems;
        }





        public void onPause(){
            if(t1 !=null){
                t1.stop();
                t1.shutdown();
            }
            super.onPause();
        }
        @Override
        public void onBackPressed() {
            super.onBackPressed();
            this.finish();

        }
    }
