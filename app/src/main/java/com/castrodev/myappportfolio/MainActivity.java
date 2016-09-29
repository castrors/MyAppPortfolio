package com.castrodev.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showApp(View view){
        Toast.makeText(this, String.format(getString(R.string.this_button_will_launch), ((Button)view).getText()), Toast.LENGTH_LONG).show();
    }

}
