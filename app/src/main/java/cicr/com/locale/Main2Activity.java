package cicr.com.locale;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import cicr.com.locale.Adapter.GlobalClass;
import cicr.com.locale.Gallary.MainActivity_Image_Gallery;



public class Main2Activity extends Activity {




    ImageView flower_img,stem_img,leaf_img,boll_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        flower_img = (ImageView) findViewById(R.id.flower_imageView1);
        stem_img   = (ImageView) findViewById(R.id.stem_imageView3);
        leaf_img   = (ImageView) findViewById(R.id.leaf_imageView2);
        boll_img   = (ImageView) findViewById(R.id.boll_imageView4);

// Calling Application class (see application tag in AndroidManifest.xml)
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();

        flower_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentflower = new Intent(getApplicationContext(),MainActivity_Image_Gallery.class);
                globalVariable.setFlower_Leaf("flower_images");
               // intentflower.putExtra("flower_leaf_stem_boll", "flower_images");
                startActivity(intentflower);
            }
        });

        stem_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentflower = new Intent(getApplicationContext(),MainActivity_Image_Gallery.class);
                globalVariable.setFlower_Leaf("stem_images");
                //  intentflower.putExtra("flower_leaf_stem_boll","stem_images");
                startActivity(intentflower);
            }
        });
        leaf_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentflower = new Intent(getApplicationContext(),MainActivity_Image_Gallery.class);
                globalVariable.setFlower_Leaf("leaf_images");
             //   intentflower.putExtra("flower_leaf_stem_boll", "leaf_images");
                startActivity(intentflower);
            }
        });

        boll_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentflower = new Intent(getApplicationContext(),MainActivity_Image_Gallery.class);
                globalVariable.setFlower_Leaf("boll_images");
//                intentflower.putExtra("flower_leaf_stem_boll","boll_images");
                startActivity(intentflower);
            }
        });
    }
}
