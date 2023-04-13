package com.india.custom_appbar_android;

import static com.india.custom_appbar_android.R.id.option_save;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolBar = findViewById(R.id.toolbar);

        setSupportActionBar(toolBar);

        /*

            In the customized toolbar, we can place three things
            *   Back Button
            *   Title of the toolbar
            *   OptionView

         */

        // setting up the back button

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Save button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        
    }

    //  onCreateOptionsMenu, this function is used to apply the option menu in the tool bar


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    // this method is use to verify the clicked option on the option view

        @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemID = item.getItemId();
        if(itemID == R.id.option_new){
            Toast.makeText(this,"New Option Selected",Toast.LENGTH_SHORT).show();
        }else if(itemID == R.id.option_save){
            Toast.makeText(this,"Save Option Selected",Toast.LENGTH_SHORT).show();
        }else if(itemID == R.id.option_open){
            Toast.makeText(this,"Open Option Selected",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


}