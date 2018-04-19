package com.myrp.a16023022.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn = (Button)findViewById(R.id.button1);
    RadioGroup radioG = (RadioGroup) findViewById(R.id.radioGroup);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedButtonId = radioG.getCheckedRadioButtonId();
                RadioButton radioB = (RadioButton)findViewById(selectedButtonId);
                Toast.makeText(getBaseContext(), radioB.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
