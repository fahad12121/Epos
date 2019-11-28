package com.example.epos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class price extends AppCompatActivity {
    TextView tv2, tv4;
    int qty = 0, price = 0;
    Button btn1,btn2,btn3,btn4;

    Button checkout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        btn1 = findViewById(R.id.lounge);
        btn2=findViewById(R.id.chicken);
        btn3=findViewById(R.id.beef);
        btn4=findViewById(R.id.veggie);
        tv2 = findViewById(R.id.tv2);
        tv4 = findViewById(R.id.tv4);
        checkout=findViewById(R.id.btn_checkout);

checkout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent =new Intent(price.this,table.class);
        startActivity(intent);
    }
});
    }


    public void smallpizza(View view) {
        qty = qty+1;
        String pr = btn1.getText().toString();
        int pri = Integer.parseInt(pr.replaceAll("[^0-9]", ""));
        price = price + pri;
        tv2.setText(Integer.toString(qty));
        tv4.setText(Integer.toString(price));
         checkout.setVisibility(View.VISIBLE);
    }


    public void medium(View view) {
        qty = qty+1;
        String pr = btn2.getText().toString();
        int pri = Integer.parseInt(pr.replaceAll("[^0-9]", ""));
        price = price + pri;
        tv2.setText(Integer.toString(qty));
        tv4.setText(Integer.toString(price));
        checkout.setVisibility(View.VISIBLE);
    }

    public void large(View view) {
        qty = qty+1;
        String pr = btn3.getText().toString();
        int pri = Integer.parseInt(pr.replaceAll("[^0-9]", ""));
        price = price + pri;
        tv2.setText(Integer.toString(qty));
        tv4.setText(Integer.toString(price));
        checkout.setVisibility(View.VISIBLE);
    }

    public void extra(View view) {
        qty = qty+1;
        String pr = btn4.getText().toString();
        int pri = Integer.parseInt(pr.replaceAll("[^0-9]", ""));
        price = price + pri;
        tv2.setText(Integer.toString(qty));
        tv4.setText(Integer.toString(price));
        checkout.setVisibility(View.VISIBLE);
    }


}