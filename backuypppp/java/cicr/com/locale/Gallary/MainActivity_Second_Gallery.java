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
import cicr.com.locale.Adapter.GridViewAdapter;
import cicr.com.locale.R;

public class MainActivity_Second_Gallery extends Activity  {
    private GridView gridView;
    private GridViewAdapter gridAdapter;
    TextToSpeech t1;
    Button audio_btn;
    TextView relattxt_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second_gallery);
        audio_btn = (Button) findViewById(R.id.audio_btn_id);
        Button backbutton= (Button) findViewById(R.id.second_gallery_back);

        TextView txt_title = (TextView) findViewById(R.id.textView10);

         relattxt_title = (TextView) findViewById(R.id.textView7);
        relattxt_title.setSingleLine();
        relattxt_title.setText(getString(R.string.image_related2));
        //final String flower_im = getIntent().getStringExtra("flower_leaf_stem_boll");
        // Calling Application class (see application tag in AndroidManifest.xml)
      //  final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
// Get Title from global/application context
     //   final String flower_im  = globalVariable.getFlower_Leaf();

        txt_title.setText("Related Images");
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


        gridView = (GridView) findViewById(R.id.small_gridView);
        gridAdapter = new GridViewAdapter(this, R.layout.grid_item_layout, getData());
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ImageItem item = (ImageItem) parent.getItemAtPosition(position);

                Bitmap bitmap= item.getImage();// your bitmap
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);
                Intent intent = new Intent(MainActivity_Second_Gallery.this, Description_Image_Activity.class);
           //     intent.putExtra("title", item.getTitle());
              //  intent.putExtra("byteArray",bs.toByteArray());
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

    private ArrayList<ImageItem> getData() {
        final ArrayList<ImageItem> imageItems = new ArrayList<ImageItem>();
        // Calling Application class (see application tag in AndroidManifest.xml)
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
// Get Title from global/application context
        final String Title  = globalVariable.getTitle();
      //  Toast.makeText(MainActivity_Second_Gallery.this,Title,Toast.LENGTH_LONG).show();

        String[] aphid1                         = getResources().getStringArray(R.array.aphid);
        String[] jassid1                        = getResources().getStringArray(R.array.jassid);
        String[] whitefly1                      = getResources().getStringArray(R.array.whitefly);
        String[] american_bollworm1             = getResources().getStringArray(R.array.american_bollworm);
        String[] spotted_spiny_bollworm1        = getResources().getStringArray(R.array.spotted_spiny_bollworm);
        String[] pink_bollworm1                 = getResources().getStringArray(R.array.pink_bollworm);
        String[] thrips1                        = getResources().getStringArray(R.array.thrips);
        String[] leafworm_tobacco_caterpillar1  = getResources().getStringArray(R.array.leafworm_tobacco_caterpillar);
//String title="";
//      //  if(flower_im.equals("Flower_Image_1")) {
//        if(Title != null && !Title.isEmpty()){
//            title = "Aphid";
//        }
        switch (Title) {

            case "Aphid" : {
                TypedArray imgs = getResources().obtainTypedArray(R.array.aphid);

                for (int i = 0; i < imgs.length(); i++) {
                    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                    imageItems.add(new ImageItem(bitmap,aphid1[i].replace("res/drawable/","")));
                    //  imageItems.add(new ImageItem(bitmap, "aphid" + i));
                }break;
            }case "American bollworm" : {
                TypedArray imgs = getResources().obtainTypedArray(R.array.american_bollworm);

                for (int i = 0; i < imgs.length(); i++) {
                    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                    imageItems.add(new ImageItem(bitmap,american_bollworm1[i].replace("res/drawable/","")));
                    //  imageItems.add(new ImageItem(bitmap, "aphid" + i));
                }break;
            } case "Jassid" : {
                TypedArray imgs = getResources().obtainTypedArray(R.array.jassid);

                for (int i = 0; i < imgs.length(); i++) {
                    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                    imageItems.add(new ImageItem(bitmap,jassid1[i].replace("res/drawable/","")));
                    // imageItems.add(new ImageItem(bitmap, "jassid" + i));
                }break;

            }case "Whitefly" : {
                TypedArray imgs = getResources().obtainTypedArray(R.array.whitefly);

                for (int i = 0; i < imgs.length(); i++) {
                    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                    imageItems.add(new ImageItem(bitmap, whitefly1[i].replace("res/drawable/", "")));
//                imageItems.add(new ImageItem(bitmap, "whitefly" + i));
                }break;

            }
            case "Pink Bollworm" : {
                TypedArray imgs = getResources().obtainTypedArray(R.array.pink_bollworm);

                for (int i = 0; i < imgs.length(); i++) {
                    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                    imageItems.add(new ImageItem(bitmap, pink_bollworm1[i].replace("res/drawable/", "")));
//                imageItems.add(new ImageItem(bitmap, "whitefly" + i));
                }break;

            }case "Spotted and Spiny Bollworm" : {
                TypedArray imgs = getResources().obtainTypedArray(R.array.spotted_spiny_bollworm);

                for (int i = 0; i < imgs.length(); i++) {
                    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                    imageItems.add(new ImageItem(bitmap, spotted_spiny_bollworm1[i].replace("res/drawable/", "")));
//                imageItems.add(new ImageItem(bitmap, "whitefly" + i));
                }break;

            }case "Thrips" : {
                TypedArray imgs = getResources().obtainTypedArray(R.array.thrips);

                for (int i = 0; i < imgs.length(); i++) {
                    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                    imageItems.add(new ImageItem(bitmap, thrips1[i].replace("res/drawable/", "")));
//                imageItems.add(new ImageItem(bitmap, "whitefly" + i));
                }break;

            }case "Leafworm or Tobacco caterpillar" : {
                TypedArray imgs = getResources().obtainTypedArray(R.array.leafworm_tobacco_caterpillar);

                for (int i = 0; i < imgs.length(); i++) {
                    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                    imageItems.add(new ImageItem(bitmap, leafworm_tobacco_caterpillar1[i].replace("res/drawable/", "")));
//                imageItems.add(new ImageItem(bitmap, "whitefly" + i));
                }
                break;

            }

        }

        return imageItems;
    }

           /*
        if(flower_im.equals("f1ap3.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.aphid);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,aphid1[i].replace("res/drawable/","")));
                //  imageItems.add(new ImageItem(bitmap, "aphid" + i));
            }
        }else if(flower_im.equals("f2ap4.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.aphid);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,aphid1[i].replace("res/drawable/","")));
              //  imageItems.add(new ImageItem(bitmap, "aphid" + i));
            }
        }if(flower_im.equals("f3ab1.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.american_bollworm);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,american_bollworm1[i].replace("res/drawable/","")));
                //  imageItems.add(new ImageItem(bitmap, "aphid" + i));
            }
        }else if(flower_im.equals("f4ab2.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.american_bollworm);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,american_bollworm1[i].replace("res/drawable/","")));
                //  imageItems.add(new ImageItem(bitmap, "aphid" + i));
            }
        }if(flower_im.equals("f5ab3.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.american_bollworm);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,american_bollworm1[i].replace("res/drawable/","")));
                //  imageItems.add(new ImageItem(bitmap, "aphid" + i));
            }
        }else if(flower_im.equals("f6ab4.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.american_bollworm);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,american_bollworm1[i].replace("res/drawable/","")));
                //  imageItems.add(new ImageItem(bitmap, "aphid" + i));
            }
        }if(flower_im.equals("f7ab5.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.american_bollworm);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,american_bollworm1[i].replace("res/drawable/","")));
                //  imageItems.add(new ImageItem(bitmap, "aphid" + i));
            }
        }else if(flower_im.equals("f8ab6.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.american_bollworm);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,american_bollworm1[i].replace("res/drawable/","")));
                //  imageItems.add(new ImageItem(bitmap, "aphid" + i));
            }
        }

      else if(flower_im.equals("l3ap6.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.aphid);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,aphid1[i].replace("res/drawable/","")));
               // imageItems.add(new ImageItem(bitmap, "aphid" + i));
            }

        }
        else if(flower_im.equals("l9ja1.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.jassid);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,jassid1[i].replace("res/drawable/","")));
               // imageItems.add(new ImageItem(bitmap, "jassid" + i));
            }

        }
        else if(flower_im.equals("l10ja2.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.jassid);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,jassid1[i].replace("res/drawable/","")));
               // imageItems.add(new ImageItem(bitmap, "jassid" + i));
            }

        }
        else if(flower_im.equals("l11ja3.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.jassid);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,jassid1[i].replace("res/drawable/","")));
               // imageItems.add(new ImageItem(bitmap, "jassid" + i));
            }

        } else if(flower_im.equals("l12ja4.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.jassid);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,jassid1[i].replace("res/drawable/","")));
//                imageItems.add(new ImageItem(bitmap, "jassid" + i));
            }

        } else if(flower_im.equals("l13ja5.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.jassid);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,jassid1[i].replace("res/drawable/","")));
//                imageItems.add(new ImageItem(bitmap, "jassid" + i));
            }

        } else if(flower_im.equals("l4wf1.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.whitefly);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,whitefly1[i].replace("res/drawable/","")));
//                imageItems.add(new ImageItem(bitmap, "whitefly" + i));
            }
        } else if(flower_im.equals("l5wf2.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.whitefly);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,whitefly1[i].replace("res/drawable/","")));
//                imageItems.add(new ImageItem(bitmap, "whitefly" + i));
            }

        }else if(flower_im.equals("l6wf3.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.whitefly);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,whitefly1[i].replace("res/drawable/","")));
//                imageItems.add(new ImageItem(bitmap, "whitefly" + i));
            }

        }else if(flower_im.equals("l7wf4.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.whitefly);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,whitefly1[i].replace("res/drawable/","")));
//                imageItems.add(new ImageItem(bitmap, "whitefly" + i));
            }

        }else if(flower_im.equals("l8wf5.jpg")) {
            TypedArray imgs = getResources().obtainTypedArray(R.array.whitefly);

            for (int i = 0; i < imgs.length(); i++) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
                imageItems.add(new ImageItem(bitmap,whitefly1[i].replace("res/drawable/","")));
//                imageItems.add(new ImageItem(bitmap, "whitefly" + i));
            }

        }


*/




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
