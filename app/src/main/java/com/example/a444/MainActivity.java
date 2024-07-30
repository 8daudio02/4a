package com.example.a444;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void onClick (View view) {
        Log.i("Info ","Button pressed");
        EditText editText = (EditText) findViewById(R.id.editText);
        String name = editText.getText().toString();
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("data",name);
        startActivity(intent);

    }
}