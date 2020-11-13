package com.example.ch12_sqlite;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edtName, edtNumber, edtNameResult, edtNumberResult;
    Button btnInit, btnInsert, btnSelect;
    Button btnUpdate, btnDelete;

    myDBHelper myHelper;//1단계: DDL - Create, Alter, Drop
    SQLiteDatabase sqlDB;//2단계: DML - select, insert, update, delete

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("가수 그룹 관리 DB");

        edtName = (EditText) findViewById(R.id.edtName);
        edtNumber = (EditText) findViewById(R.id.edtNumber);
        edtNameResult = (EditText) findViewById(R.id.edtNameResult);
        edtNumberResult = (EditText) findViewById(R.id.edtNumberResult);

        btnInit = (Button) findViewById(R.id.btnInit);
        btnInsert = (Button) findViewById(R.id.btnInsert);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnSelect = (Button) findViewById(R.id.btnSelect);

        myHelper = new myDBHelper(MainActivity.this);

        btnSelect.callOnClick();

        btnInit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase();
                myHelper.onUpgrade(sqlDB, 1, 2); // 인수는 아무거나 입력하면 됨.
                sqlDB.close();

                btnSelect.callOnClick();
            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase();
                sqlDB.execSQL("INSERT INTO groupTBL VALUES ( '"
                        + edtName.getText().toString() + "' , "
                        + edtNumber.getText().toString() + ");");
                sqlDB.close();
                Toast.makeText(getApplicationContext(), "입력됨",
                        Toast.LENGTH_SHORT).show();

                btnSelect.callOnClick();
            }
        });

        //수정
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase();

//                sqlDB.execSQL("INSERT INTO groupTBL VALUES ( '"
//                        + edtName.getText().toString() + "' , "
//                        + edtNumber.getText().toString() + ");");

                String strNum = edtNumber.getText().toString();
                String strName = edtName.getText().toString();

                if(strName.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "이름이 없어요", Toast.LENGTH_SHORT).show();
                    sqlDB.close();
                    return;
                }
                else
                {
                    String query ="";
                    query += " Update ";
                    query += "        groupTBL ";
                    query += " Set ";
                    query += "        gNumber = "+strNum;
                    query += " where ";
                    query += "        gName = '"+strName+"';";

                    sqlDB.execSQL(query);

                    Toast.makeText(getApplicationContext(), "수정됨",
                            Toast.LENGTH_SHORT).show();

                    btnSelect.callOnClick();
                }

                sqlDB.close();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase();

//                sqlDB.execSQL("INSERT INTO groupTBL VALUES ( '"
//                        + edtName.getText().toString() + "' , "
//                        + edtNumber.getText().toString() + ");");

                String strName = edtName.getText().toString();

                if(strName.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "이름이 없어요", Toast.LENGTH_SHORT).show();
                    sqlDB.close();
                    return;
                }
                else {
                    String query = "";
                    query += " Delete ";
                    query += "        from ";
                    query += "              groupTBL ";
                    query += " where ";
                    query += "         gName = '" + strName + "'";

                    sqlDB.execSQL(query);

                    sqlDB.close();
                    Toast.makeText(getApplicationContext(), "삭제됨",
                            Toast.LENGTH_SHORT).show();

                    btnSelect.callOnClick();
                }
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sqlDB = myHelper.getReadableDatabase();
                Cursor cursor;
                cursor = sqlDB.rawQuery("SELECT * FROM groupTBL;", null);

                String strNames = "그룹이름" + "\r\n" + "--------" + "\r\n";
                String strNumbers = "인원" + "\r\n" + "--------" + "\r\n";

                while (cursor.moveToNext()) {
                    strNames += cursor.getString(0) + "\r\n";
                    strNumbers += cursor.getString(1) + "\r\n";
                }

                edtNameResult.setText(strNames);
                edtNumberResult.setText(strNumbers);

                cursor.close();
                sqlDB.close();
            }
        });

    }


    public class myDBHelper extends SQLiteOpenHelper {
        public myDBHelper(Context context) {
            super(context, "groupDB", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE  groupTBL ( gName CHAR(20) PRIMARY KEY, gNumber INTEGER);");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS groupTBL");
            onCreate(db);
        }
    }
}
