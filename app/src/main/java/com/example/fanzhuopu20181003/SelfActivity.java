package com.example.fanzhuopu20181003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SelfActivity extends AppCompatActivity {
    private EditText editText;
    private List<String> strings = new ArrayList<>();
    private SelfView selfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self);
        editText = findViewById(R.id.edit);
        selfView = findViewById(R.id.self_view);
        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString().trim();
                if (TextUtils.isEmpty(s)) {
                    Toast.makeText(SelfActivity.this, "内容不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                strings.add(s);
                selfView.setListData(strings);
            }
        });
    }
}
