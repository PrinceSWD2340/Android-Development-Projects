package com.example.adapterlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnNext;
    TextView txtIns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s= getString(R.string.notifyToast);
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }

    public void next(View view) {
        btnNext=(Button) findViewById(R.id.btnNext);
        txtIns=(TextView) findViewById(R.id.ins);

        Intent nextIntent = new Intent(this,NextActivity.class);
        nextIntent.putExtra("ins",txtIns.getText().toString());
        startActivity(nextIntent);
    }
}
