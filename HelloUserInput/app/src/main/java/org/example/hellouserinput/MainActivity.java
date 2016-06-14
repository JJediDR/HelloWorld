package org.example.hellouserinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private TextView Salut;
    private EditText Name;

    public void Button(View v) {
        Button button = (Button) v;

        Salut = (TextView)findViewById(R.id.Hello);
        Name = (EditText)findViewById(R.id.Name);
        Salut.setText(getString(R.string.Hello) + " " + Name.getText());
    }



}
