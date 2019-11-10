package com.example.harikedua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewActivity extends AppCompatActivity {

    //global variabel

    WebView webViewYoyutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        //new di jAVA itu untuk menaru di ram untuk ambil alamat, untuk menaroh tempat di memori
        //inisialisasi(setiap variabel widget butuh banget inisialisasi)
        webViewYoyutube = (WebView) findViewById(R.id.webview_youtube);

        //attribut
        webViewYoyutube.loadUrl("https://www.youtube.com");
        webViewYoyutube.getSettings().setJavaScriptEnabled(true);
        webViewYoyutube.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {

        if (webViewYoyutube.canGoBack()){
            webViewYoyutube.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
