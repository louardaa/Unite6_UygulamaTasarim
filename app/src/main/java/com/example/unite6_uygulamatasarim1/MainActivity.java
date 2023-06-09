package com.example.unite6_uygulamatasarim1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.unite6_uygulamatasarim1.Uyg1.Uyg1;
import com.example.unite6_uygulamatasarim1.Uyg10.Uyg10;
import com.example.unite6_uygulamatasarim1.Uyg2.Uyg2;
import com.example.unite6_uygulamatasarim1.Uyg3.Uyg3;
import com.example.unite6_uygulamatasarim1.Uyg8.BirinciFragment;
import com.example.unite6_uygulamatasarim1.Uyg8.IkinciFragment;
import com.example.unite6_uygulamatasarim1.Uyg8.Uyg8;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void uyg1Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg1.class);
        startActivity(i);
    }
    public void uyg2Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2.class);
        startActivity(i);
    }
    public void uyg3Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg3.class);
        startActivity(i);
    }
    public void uyg8Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg8.class);
        startActivity(i);
    }
    public void uyg10Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg10.class);
        startActivity(i);
    }

}