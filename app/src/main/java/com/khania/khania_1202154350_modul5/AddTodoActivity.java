package com.khania.khania_1202154350_modul5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddTodoActivity extends AppCompatActivity {

    EditText name, description, priority;
    TodoHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_todo);

        //deklarasi objek yang digunakan
        name = findViewById(R.id.name);
        description = findViewById(R.id.desc);
        priority = findViewById(R.id.priority);
        db = new TodoHelper(this);
    }

    //Method ketika tombol back ditekan
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(AddTodoActivity.this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }

    //Method ketika tombol tambah ditekan
    public void tambah(View view) {
        if (db.insertdata(new TodoModel(name.getText().toString(), description.getText().toString(), priority.getText().toString()))) {
            Toast.makeText(this, "Todo added", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
            this.finish();
        } else {
            Toast.makeText(this, "Adding todo failed", Toast.LENGTH_SHORT).show();
            name.setText(null);
            description.setText(null);
            priority.setText(null);
        }
    }
}
