package com.example.epos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class table extends AppCompatActivity {
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        btn=findViewById(R.id.apply);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(table.this,price.class);
                startActivity(intent);
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(table.this);

                // Setting Dialog Title
                alertDialog.setTitle("Success");

                // Setting Dialog Message
                alertDialog.setMessage("Your Order Transferd to Kitchen.");

                // Setting Positive "Yes" Button
                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User pressed YES button. Write Logic Here
                        Toast.makeText(getApplicationContext(), "You clicked on YES",
                                Toast.LENGTH_SHORT).show();
                    }
                });


                // Showing Alert Message
                alertDialog.show();

            }
        });
    }
}
