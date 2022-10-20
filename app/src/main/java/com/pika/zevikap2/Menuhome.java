package com.pika.zevikap2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Menuhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuhome);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "MULAI", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "stop", Toast.LENGTH_SHORT).show();
    }
     @Override
    protected void onRestart(){
      super.onRestart();
         Toast.makeText(this, "restart", Toast.LENGTH_SHORT).show();
     }
     @Override
    protected void onResume(){
        super.onResume();
         Toast.makeText(this, "resume", Toast.LENGTH_SHORT).show();
     }
     @Override
    protected void onPause(){
        super.onPause();
         Toast.makeText(this, "pause", Toast.LENGTH_SHORT).show();
     }
     @Override
    protected void onDestroy(){
        super.onDestroy();
         Toast.makeText(this,  "destroy", Toast.LENGTH_SHORT).show();
     }
}
