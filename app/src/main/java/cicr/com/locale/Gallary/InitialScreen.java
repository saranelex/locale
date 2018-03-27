package cicr.com.locale.Gallary;

/**
 * Created by HARISH on 9/4/2017.
 */
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import cicr.com.locale.MainActivity;
import cicr.com.locale.R;

public class InitialScreen extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_initial);
        super.onCreate(savedInstanceState);

        ImageView intialtxt =  (ImageView) findViewById(R.id.imageView3);

        intialtxt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent InitialIntent = new Intent(InitialScreen.this, display.class);
                startActivity(InitialIntent);

            }
        });

    }
}
