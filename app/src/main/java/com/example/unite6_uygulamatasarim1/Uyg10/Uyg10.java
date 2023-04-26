package com.example.unite6_uygulamatasarim1.Uyg10;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.unite6_uygulamatasarim1.R;

public class Uyg10 extends AppCompatActivity {
    ActivityResultLauncher<Intent> galeryResultLauncher;
    ActivityResultLauncher<String> izinlerResultLauncher;

    ImageView imageView;
    Intent galeri = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10);
        imageView = findViewById(R.id.imageView);
        metotGaleryResultLauncher();
        metotIzinlerResultLauncher();


    }

    public void metotIzinlerResultLauncher() {
        izinlerResultLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback<Boolean>() {
            @Override
            public void onActivityResult(Boolean result) {
                if (result == true) {
                    //İzin var, galeriye gidilecektir.
                    Intent galeri = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    galeryResultLauncher.launch(galeri);
                } else {
                    //İzin istenmesi gerekecektir.
                    Toast.makeText(Uyg10.this, "İzin vermeniz gerekir.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void galeriyeGit(View view) {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
            izinlerResultLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE);
        } else {
            Intent galeri = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.
                    EXTERNAL_CONTENT_URI);
            galeryResultLauncher.launch(galeri);
        }
    }

    public void metotGaleryResultLauncher() {
        galeryResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == RESULT_OK) {
                    Intent intentSonuc = result.getData();
                    if (intentSonuc != null) {
                        Uri fotoVeri = intentSonuc.getData();
                        imageView.setImageURI(fotoVeri);
                    }
                }
            }
        });
    }
}





