package com.example.urvish.dbflowdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.urvish.dbflowdemo.model.Books
import com.raizlabs.android.dbflow.sql.language.Select
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnsubmit.setOnClickListener {
            //INSERT INTO books_table VALUES (1,"Book1")
            var book = Books()
            book.name = editText.text.toString()
            book.save()
            var books = Select().from(Books::class.java).queryList();
            Log.d("Books", books.toString())
            textView.setText("");
            for (book in books) {
                textView.append(book.name + "\n")
            }
        }

    }
}
