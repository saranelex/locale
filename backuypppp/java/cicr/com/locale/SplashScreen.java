package cicr.com.locale;

/**
 * Created by HARISH on 9/3/2017.
 */
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

import cicr.com.locale.Gallary.InitialScreen;

public class SplashScreen extends Activity{
    private static  int SPLASH_TIME_OUT = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this,InitialScreen.class);
                startActivity(i);
                finish();
            }
        } , SPLASH_TIME_OUT);

    }
}
