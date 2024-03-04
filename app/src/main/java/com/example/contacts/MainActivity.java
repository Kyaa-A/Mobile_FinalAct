package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    public CardView telegram, discord, facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        /*BUTTON*/
       button = (Button) findViewById(R.id.button);
       button.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){openActivity2();}
       });

       telegram =(CardView) findViewById(R.id.telegram);
       telegram.setOnClickListener(this::onClick);

       discord =(CardView) findViewById(R.id.discord);
       discord.setOnClickListener(this::onClick);

       facebook =(CardView) findViewById(R.id.facebook);
       facebook.setOnClickListener(this::onClick);

    }

    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void onClick(View view){
        Intent i;

        if(view.getId() == R.id.telegram){
            i = new Intent(this,Telegram.class);
            startActivity(i);
        }else if(view.getId() == R.id.discord){
            i = new Intent(this,Discord.class);
            startActivity(i);
        }else if(view.getId() == R.id.facebook){
            i = new Intent(this,Facebook.class);
            startActivity(i);
        }else if(view.getId() == R.id.instagram){
            i = new Intent(this,Instagram.class);
            startActivity(i);
        }else if(view.getId() == R.id.pinterest){
            i = new Intent(this,Pinterest.class);
            startActivity(i);
        }else if(view.getId() == R.id.youtube){
            i = new Intent(this,Youtube.class);
            startActivity(i);
        }
    }
}