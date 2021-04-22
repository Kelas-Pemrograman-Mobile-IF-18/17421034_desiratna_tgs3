package com.desiratna.prj3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNilaiA, edtNilaiB;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNilaiA = (EditText) findViewById(R.id.edtNilaiA);
        edtNilaiB = (EditText) findViewById(R.id.edtNilaiB);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnTambah= (Button) findViewById(R.id.btnTambah);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

                int hasil = nilaiA + nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });
    }
}