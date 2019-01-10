package com.example.urvish.livedatademo;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewResult;
    private Button mBtnSubmit;
    private EditText mEdittextName;
    private MyViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdittextName=findViewById(R.id.edittextname);
        mBtnSubmit=findViewById(R.id.btnsubmit);
        mTextViewResult=findViewById(R.id.livedataresult);
        mBtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.getmName().setValue(mEdittextName.getText().toString().isEmpty()?"":mEdittextName.getText().toString());
            }
        });
        mViewModel= ViewModelProviders.of(MainActivity.this).get(MyViewModel.class);
        Observer<String> name=new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                mTextViewResult.setText(s);
            }
        };
        mViewModel.getmName().observe(this,name);

    }
}
