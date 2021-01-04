package com.upt.cti.smartwallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private TextView tStatus;
    private EditText eSearch,eIncome,eExpenses;
    private Button bUpdate;

    private DatabaseReference databasereference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tStatus = (TextView) findViewById(R.id.tStatus);
        eSearch = (EditText) findViewById(R.id.eSearch);
        eIncome = (EditText) findViewById(R.id.eIncome);
        eExpenses = (EditText) findViewById(R.id.eExpenses);
        bUpdate = (Button) findViewById(R.id.bUpdate);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        databasereference = database.getReference();
    }

    public void clickUpdate(View view) {

    }

    public void clicked(View view) {
        switch (view.getId()) {
            case R.id.eSearch: if(!eSearch.getText().toString().isEmpty()) {
                String currentMonth = eSearch.getText().toString().toLowerCase();

                tStatus.setText("Searching....");
                createNewDbListener();
            }
            else {
                Toast.makeText(this,"Search field may not be empty", Toast.LENGTH_LONG);
            }
            break;
            case R.id.bUpdate:
               break;
        }
    }
}
