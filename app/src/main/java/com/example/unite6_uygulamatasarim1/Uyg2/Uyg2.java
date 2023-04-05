package com.example.unite6_uygulamatasarim1.Uyg2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.example.unite6_uygulamatasarim1.R;

public class Uyg2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2);
        System.out.println("onCreate Çalıştı!" );
    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart Çalıştı!" );
    }


    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume Çalıştı!" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause Çalıştı!" );
    }
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop Çalıştı!");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy Çalıştı!");
    }
}




