package com.example.datahora;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.FocusFinder;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Calendar calendario;
    SimpleDateFormat simpleDateFormat;
    String data;
    Button mBtnMostrar;
    TextView mTxTData;
    TextView mTxtHora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnMostrar  = findViewById(R.id.btnMostrarData);
        mTxTData  = findViewById(R.id.txtData);
        mTxtHora  = findViewById(R.id.txtHora);
        mBtnMostrar.setOnClickListener(this);
        calendario = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        TextClock textClock = (TextClock) findViewById(R.id.textClock);
        textClock.setFormat12Hour(null);
        //textClock.setFormat24Hour("dd/MM/yyyy hh:mm:ss a");
        String text = "dd/MM/yyyy hh:mm:ss";
        textClock.setFormat24Hour(text);

    }

    @Override
    public void onClick(View v){
        data = simpleDateFormat.format(calendario.getTime());
        mTxTData.setText(data);
        simpleDateFormat = new SimpleDateFormat("hh:MM:ss");
        data = simpleDateFormat.format(calendario.getTime());
        mTxtHora.setText(data);
        mTxTData.setVisibility(View.VISIBLE);
        mTxtHora.setVisibility(View.VISIBLE);
    }

}

