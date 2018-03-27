package cicr.com.locale.Gallary;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Locale;
//import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import cicr.com.locale.Adapter.GlobalClass;
import cicr.com.locale.Adapter.GridViewAdapter;
import cicr.com.locale.Main2Activity;
import cicr.com.locale.R;


public class MainActivity_Image_Gallery extends Activity  {

	private GridView gridView;
    private GridViewAdapter gridAdapter;
	TextToSpeech t1;
	Button audio_btn;
	TextView reltxt;
	Locale myLocale;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.image_gallery_main);


//				gridAdapter = new GridViewAdapter(this,)
		audio_btn = (Button) findViewById(R.id.audio_btn_id);
		Button backbutton= (Button) findViewById(R.id.gallery_back);
		TextView txt_title = (TextView) findViewById(R.id.textView10);

		 reltxt = (TextView) findViewById(R.id.txrela);

		// Calling Application class (see application tag in AndroidManifest.xml)
		final GlobalClass globalVariable_mew = (GlobalClass) getApplicationContext();
		// Get Title from global/application context
		final String flower_im  = globalVariable_mew.getFlower_Leaf();
		//final String flower_im = getIntent().getStringExtra("flower_leaf_stem_boll");

		if(flower_im.equals("flower_images")) {
			txt_title.setText("Flower Damage");
		}	else if(flower_im.equals("stem_images")) {
			txt_title.setText("Stem Damage");
		}else if(flower_im.equals("leaf_images")) {
			txt_title.setText("Leaf Damage");
		}else if(flower_im.equals("boll_images")) {
			txt_title.setText("Boll Damage");
		}


		    gridView = (GridView) findViewById(R.id.gridView);
	        gridAdapter = new GridViewAdapter(this, R.layout.grid_item_layout, getData());
	        gridView.setAdapter(gridAdapter);

	        gridView.setOnItemClickListener(new OnItemClickListener() {
	            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

					ImageItem item = (ImageItem) parent.getItemAtPosition(position);

					Bitmap bitmap= item.getImage();// your bitmap
					ByteArrayOutputStream bs = new ByteArrayOutputStream();
					bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);
				//	Toast.makeText(Image_MainActivity.this, temp.toString(), Toast.LENGTH_LONG).show();

                    String title = item.getTitle().toString();
					//Set title  in global/application context
				//	Toast.makeText(MainActivity_Image_Gallery.this,item.getTitle(),Toast.LENGTH_LONG).show();
					final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
					if(title.contains("ap")){
                            globalVariable.setTitle("Aphid");
//
                        } else if(title.contains("bw"))  {
                            globalVariable.setTitle("American bollworm");
                        } else if(title.contains("ja")) {
                            globalVariable.setTitle("Jassid");
                        } else if(title.contains("wf")) {
                            globalVariable.setTitle("Whitefly");
                        } else if(title.contains("pb")) {
                            globalVariable.setTitle("Pink Bollworm");
                        } else if(title.contains("ea")) {
                            globalVariable.setTitle("Spotted and Spiny Bollworm");
                        } else if(title.contains("th")) {
                            globalVariable.setTitle("Thrips");
                        } else if(title.contains("sp")) {
                            globalVariable.setTitle("Leafworm or Tobacco caterpillar");
                        }



					//Create intent
	                Intent intent = new Intent(MainActivity_Image_Gallery.this, MainActivity_Second_Gallery.class);
	                //intent.putExtra("title", item.getTitle());

                  //  intent.putExtra("flower_leaf_stem_boll", flower_im);
					//intent.putExtra("byteArray",bs.toByteArray());
                  //  Log.d("title",item.getTitle().toString());
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
		audio_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				String toSpeak = reltxt.getText().toString();
				//Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
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
	    }

	    /**
	     * Prepare some dummy data for gridview
	     */

	    private ArrayList<ImageItem> getData() {
	        final ArrayList<ImageItem> imageItems = new ArrayList<ImageItem>();
			// Calling Application class (see application tag in AndroidManifest.xml)
			final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
			 String flower_im  = globalVariable.getFlower_Leaf();
			//String flower_im = getIntent().getStringExtra("flower_leaf_stem_boll");
			switch (flower_im) {

				case "flower_images": {
					TypedArray imgs = getResources().obtainTypedArray(R.array.flower_ids);
					String[] testArray = getResources().getStringArray(R.array.flower_ids);

					for (int i = 0; i < imgs.length(); i++) {
						Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
						imageItems.add(new ImageItem(bitmap, testArray[i].replace("res/drawable/", "")));
						//imageItems.add(new ImageItem(bitmap, "Flower_Image_" + i));
					}
					break;
				}

				case "stem_images": {
					TypedArray imgs = getResources().obtainTypedArray(R.array.stem_ids);
					String[] testArray = getResources().getStringArray(R.array.stem_ids);
					for (int i = 0; i < imgs.length(); i++) {
						Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
						imageItems.add(new ImageItem(bitmap, testArray[i].replace("res/drawable/", "")));
						//imageItems.add(new ImageItem(bitmap, "Stem_Image_" + i));
					}
					break;
				}
				case "leaf_images": {
					TypedArray imgs = getResources().obtainTypedArray(R.array.leaf_ids);
					String[] testArray = getResources().getStringArray(R.array.leaf_ids);

					for (int i = 0; i < imgs.length(); i++) {
						Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
						imageItems.add(new ImageItem(bitmap, testArray[i].replace("res/drawable/", "")));
						//imageItems.add(new ImageItem(bitmap, "Stem_Image_" + i));
					}
					break;
				}
				case "boll_images": {
					TypedArray imgs = getResources().obtainTypedArray(R.array.boll_ids);
					String[] testArray = getResources().getStringArray(R.array.boll_ids);
					for (int i = 0; i < imgs.length(); i++) {
						Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
						imageItems.add(new ImageItem(bitmap, testArray[i].replace("res/drawable/", "")));
						//imageItems.add(new ImageItem(bitmap, "Stem_Image_" + i));
					}
					break;
				}
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
