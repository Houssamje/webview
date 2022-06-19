package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
private EditText testurl;
static Button btnnav;
private WebView wver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testurl =findViewById(R.id.editTexturel);
        btnnav =findViewById(R.id.butnavige);
        wver =findViewById(R.id.webv);
        btnnav.setOnClickListener(new View.OnClickListener() {
            @Override
public void onClick(View v) {
                wver.setWebViewClient(new WebViewClient());
                wver.loadUrl(testurl.getText().toString());
            }
        });
        Rosovoiretainternet rosovoiretainternet =new Rosovoiretainternet();
        IntentFilter intentFilter =new IntentFilter();
        intentFilter.addAction("indroid.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        registerReceiver(rosovoiretainternet,intentFilter);
    }
    public  static  void  EnableButton(Boolean activf ){
        btnnav.setEnabled(activf);
    }
}