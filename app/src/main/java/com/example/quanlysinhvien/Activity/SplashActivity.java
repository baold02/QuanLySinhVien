
package com.example.quanlysinhvien.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.quanlysinhvien.R;

public class SplashActivity extends AppCompatActivity {
   ImageView Hinh;
   TextView txtPow, txtTen, txtQl;
   ProgressBar progressBar;
   static int TimeOut_Millis = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        AnhXa();
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        },TimeOut_Millis);
    }
    private void AnhXa(){
        Hinh = findViewById(R.id.imgHinh);
        txtPow = findViewById(R.id.txtPower);
        txtTen = findViewById(R.id.txtHoTen);
        txtQl = findViewById(R.id.txtQl);

    }
}