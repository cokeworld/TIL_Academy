package com.example.ch10_intentputget;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Second 액티비티");

        android.util.Log.d("액티비티1","ssss11111");

        Intent inIntent = getIntent();
//        final int hapValue = inIntent.getIntExtra("Num1", 0)
//                + inIntent.getIntExtra("Num2", 0);
        int hapValue=0;

        int op = inIntent.getIntExtra("Op",0);

        android.util.Log.d("액티비티1","sssss22222");

        switch (op)
        {
            case 1: hapValue = inIntent.getIntExtra("Num1", 0)
                    + inIntent.getIntExtra("Num2", 0);
                break;
            case 2: hapValue = inIntent.getIntExtra("Num1", 0)
                    - inIntent.getIntExtra("Num2", 0);
                break;
            case 3: hapValue = inIntent.getIntExtra("Num1", 0)
                    * inIntent.getIntExtra("Num2", 0);
                break;
            case 4: hapValue = inIntent.getIntExtra("Num1", 0)
                    / inIntent.getIntExtra("Num2", 0);
                break;
            default:
                break;
        }

//        String op = inIntent.getStringExtra("Op");
//        if(op.equals("+")) {
//            hapValue = inIntent.getIntExtra("Num1", 0)
//                    + inIntent.getIntExtra("Num2", 0);
//        }
//        else if(op.equals("-")) {
//            hapValue = inIntent.getIntExtra("Num1", 0)
//                    - inIntent.getIntExtra("Num2", 0);
//        }
//        else if(op.equals("*")) {
//            hapValue = inIntent.getIntExtra("Num1", 0)
//                    * inIntent.getIntExtra("Num2", 0);
//        }
//        else if(op.equals("/")) {
//            hapValue = inIntent.getIntExtra("Num1", 0)
//                    / inIntent.getIntExtra("Num2", 0);
//        }

        Button btnReturn = (Button) findViewById(R.id.btnReturn);

        final int finalHapValue = hapValue;

        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent outIntent = new Intent(getApplicationContext(),
                        MainActivity.class);
                outIntent.putExtra("Hap", finalHapValue);
                setResult(RESULT_OK, outIntent);
                finish();
            }
        });
    }
}