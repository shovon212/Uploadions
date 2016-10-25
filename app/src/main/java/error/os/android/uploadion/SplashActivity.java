package error.os.android.uploadion;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(1300);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{

                    Intent loginintent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(loginintent);
                    finish();
                }
            }


        };
        timer.start();

    }

}






