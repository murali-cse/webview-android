package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText url;
    WebView webView;
    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = findViewById(R.id.url);
        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        go = findViewById(R.id.button);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String site_address = url.getText().toString();
                if(site_address.length()>0){
                    webView.loadUrl(site_address);
                }
            }
        });

    }
}