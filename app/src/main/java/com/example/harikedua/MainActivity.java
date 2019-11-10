package com.example.harikedua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvUang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ini munculin log klean guys
        Log.e("TAG", "ini oncreate method");
        // ini munculin toast klean guys
        Toast.makeText(this, "Ini onCreate", Toast.LENGTH_SHORT).show();

        //buat method
        hitungDuit();

    }

    private void hitungDuit() {
        //buat variable duit saya
        Double uangTransportHariIni = 25000.0;
        Double uangTransportBesok = 75000.0;
        Double hasilUangtTransport = uangTransportHariIni + uangTransportBesok;
        Toast.makeText(this, "Hasil uang hari ini : Rp." + hasilUangtTransport, Toast.LENGTH_SHORT).show();

        //buat variable
        tvUang = (TextView) findViewById(R.id.tv_uang);
        tvUang.setText("Hasil uang transposrt sebesar Rp "+hasilUangtTransport);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG", "ini onStart method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG", "ini onResume method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("TAG", "ini onRestart method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG", "ini onPause method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG", "ini onStop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG", "ini onDestroy method");
    }
}
