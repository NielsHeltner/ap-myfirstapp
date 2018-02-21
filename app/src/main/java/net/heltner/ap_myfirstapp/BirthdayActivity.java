package net.heltner.ap_myfirstapp;

import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class BirthdayActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "net.heltner.ap_myfirstapp.BIRTHDAY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
    }

    public void submitBirthday(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        DatePicker birthday = findViewById(R.id.editBirthday);
        String message = birthday.getDayOfMonth() + "/" + (birthday.getMonth() + 1) + "/" + birthday.getYear();
        intent.putExtra(EXTRA_MESSAGE, message);

        String address = getIntent().getStringExtra(AddressActivity.EXTRA_MESSAGE);
        intent.putExtra(AddressActivity.EXTRA_MESSAGE, address);

        String name = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
        intent.putExtra(MainActivity.EXTRA_MESSAGE, name);
        startActivity(intent);
    }
}
