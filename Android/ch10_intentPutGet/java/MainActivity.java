package com.example.ch10_intentputget;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 액티비티");

        android.util.Log.d("액티비티1","1111111");

        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                android.util.Log.d("액티비티1","22222_클릭");

                EditText edtNum1 = (EditText) findViewById(R.id.edtNum1);
                EditText edtNum2 =null;// = (EditText) findViewById(R.id.edtNum2);

                Intent intent = new Intent(getApplicationContext(),
                        SecondActivity.class);
                intent.putExtra("Num1",
                        Integer.parseInt(edtNum1.getText().toString()));

                android.util.Log.d("액티비티1","첫번째-"+edtNum1.getText().toString());

                intent.putExtra("Num2",
                        Integer.parseInt(edtNum2.getText().toString()));



                //부호를 넘긴다~!
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.rg1);

//                int id = rg1.getCheckedRadioButtonId();

                switch(rg1.getCheckedRadioButtonId())
                {
                    case R.id.rdo1:
                        intent.putExtra("Op", 1);
                        break;
                    case R.id.rdo2:
                        intent.putExtra("Op", 2);
                        break;
                    case R.id.rdo3:
                        intent.putExtra("Op", 3);
                        break;
                    case R.id.rdo4:
                        intent.putExtra("Op", 4);
                        break;
                }

//                if(id == R.id.rdo1)
//                    intent.putExtra("Operator", "+");
//                else if(id == R.id.rdo2)
//                    intent.putExtra("Operator", "-");
//                else if(id == R.id.rdo3)
//                    intent.putExtra("Operator", "*");
//                else if(id == R.id.rdo4)
//                    intent.putExtra("Operator", "/");

                startActivityForResult(intent, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK)
        {
            int hap = data.getIntExtra("Hap", 0);
            Toast.makeText(getApplicationContext(), "합계 :" + hap,
                    Toast.LENGTH_SHORT).show();
        }
    }

}
