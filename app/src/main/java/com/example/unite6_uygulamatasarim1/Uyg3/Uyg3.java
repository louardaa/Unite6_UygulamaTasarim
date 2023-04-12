package com.example.unite6_uygulamatasarim1.Uyg3;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.unite6_uygulamatasarim1.R;

public class Uyg3 extends AppCompatActivity {

    EditText adiSoyadi;
    EditText telefonNumarasi;
    Button diger;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3);
    }
}
