package com.rizki_tri_ipanda.radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_ti:
                if (checked)
                    Toast.makeText(getApplicationContext(),
                    "S1 - Teknik Informatika", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_si:
                if (checked)
                    Toast.makeText(getApplicationContext(),
                    "S1 - Sistem Informasi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_ka:
                if (checked)
                    Toast.makeText(getApplicationContext(),
                    "S1 - Komputerisasi Akuntansi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_mi:
                if (checked)
                    Toast.makeText(getApplicationContext(),
                    "S1 - Manajemen Informatika", Toast.LENGTH_SHORT).show();
                break;
            }
        }           
}
