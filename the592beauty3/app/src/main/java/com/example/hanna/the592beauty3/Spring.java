package com.example.hanna.the592beauty3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

/**
 * Created by nightprimula on 2017-04-13.
 */

public class Spring extends Activity {

    Button bNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring);
        ColorWeight weight = (ColorWeight) getApplicationContext();
        weight.setTone("spring");
        bNext = (Button)findViewById(R.id.bNext);
        bNext.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                finish();
                startActivity(intent);
            }
        });
    }
}