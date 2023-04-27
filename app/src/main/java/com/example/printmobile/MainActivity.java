package com.example.printmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrintManager printManager = (PrintManager) getSystemService(Context.PRINT_SERVICE);

        PrintJob printJob = printManager.print("My Print Job", new MyPrintDocumentAdapter(this), null);


    }
}

