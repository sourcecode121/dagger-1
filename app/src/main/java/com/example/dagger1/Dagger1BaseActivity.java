package com.example.dagger1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Dagger1BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Injector.inject(this);
    }
}
