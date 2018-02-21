package net.heltner.ap_myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "net.heltner.ap_myfirstapp.ADDRESS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Log.i("Address", "onCreate");
    }

    public void submitAddress(View view) {
        Intent intent = new Intent(this, BirthdayActivity.class);
        EditText editText = findViewById(R.id.editAddress);
        String address = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, address);

        String name = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
        intent.putExtra(MainActivity.EXTRA_MESSAGE, name);

        System.out.println(intent.getStringExtra(MainActivity.EXTRA_MESSAGE));

        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Address", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Address", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Address", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Address", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Address", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Address", "onDestroy");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.i("Address", "onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("Address", "onRestoreInstanceState");
    }
}
