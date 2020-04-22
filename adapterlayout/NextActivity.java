package com.example.adapterlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.widget.TextView;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {
    TextView ins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        ins =(TextView)findViewById(R.id.ins);

        Bundle bundle = getIntent().getExtras();
        ins.setText(bundle.getString("ins"));

        String s= getString(R.string.notifyToast);
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }
}
