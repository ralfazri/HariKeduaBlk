package com.example.harikedua;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HitungHitungDuit extends AppCompatActivity {

    //buat variable global
    EditText edtNilaiPertama,edtNilaiKedua;
    Button btnHitung;
    TextView tvHasil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hitung_duit);

        //inisialisasi
        edtNilaiPertama = (EditText) findViewById(R.id.edt_nilai_pertama);
        edtNilaiKedua = (EditText) findViewById(R.id.edt_nilai_kedua);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        tvHasil = (TextView) findViewById(R.id.tv_hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(HitungHitungDuit.this, "Cek Uji Menguji", Toast.LENGTH_SHORT).show();
                hitungHitungDuit();
            }
        });
    }

    private void hitungHitungDuit() {

        String ambilNilaiPertama = edtNilaiPertama.getText().toString();
        String ambilNilaiKedua = edtNilaiKedua.getText().toString();



        if (ambilNilaiPertama.isEmpty()||ambilNilaiKedua.isEmpty()){
            Toast.makeText(this, "Ini kosong breh", Toast.LENGTH_SHORT).show();
        }else {
            int  hasil = Integer.parseInt(ambilNilaiPertama) +  Integer.parseInt(ambilNilaiKedua);

            tvHasil.setText("Hasilnya Adalah : Rp " + hasil);
            //dialog
            final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

            //attribut title dan message
            alertDialog.setTitle("Hasil dari penjumlahan");
            alertDialog.setMessage("Hasilnya adalah : " + hasil);
           // alertDialog.show(); (Dihapus karena ada alert tombolnya dund

            //agar gak bisa di cancel dari klik lain harus dari oke
            alertDialog.setCancelable(false);

            //dialog button ada 2 parameter("nama button", Listenernya)
            alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    edtNilaiPertama.setText("");
                    edtNilaiKedua.setText("");
                }
            });

            //negative Button
            alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    //punya 2 parameter (context/activity dia berasal, dan pindah kemana)
                    Intent pindahKeactivityLain = new Intent(HitungHitungDuit.this, WebviewActivity.class);
                    // di satart
                    startActivity(pindahKeactivityLain);
                }
            });

            alertDialog.show();

        }



    }
}
