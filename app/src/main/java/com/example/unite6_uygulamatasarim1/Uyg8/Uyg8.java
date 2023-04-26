package com.example.unite6_uygulamatasarim1.Uyg8;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.unite6_uygulamatasarim1.R;

public class Uyg8 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8);
    }

    public void fragment1Gecis(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BirinciFragment birinciFragment = new BirinciFragment();
        fragmentTransaction.replace(R.id.frameLayout_Main,birinciFragment);
        fragmentTransaction.commit();
    }
    public void fragment2Gecis(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        IkinciFragment ikinciFragment = new IkinciFragment();
        fragmentTransaction.replace(R.id.frameLayout_Main,ikinciFragment);
        fragmentTransaction.commit();
    }
}
