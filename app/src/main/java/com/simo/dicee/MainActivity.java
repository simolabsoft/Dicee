package com.simo.dicee;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] dices = {R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};
        Button rollButton ;
        rollButton = (Button)findViewById(R.id.rollBtn);
        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Log.d("","the button has been pressed");
                Random random = new Random();
                int number1 = random.nextInt(6);
               // Log.d("","the random number is : "+number);
                leftDice.setImageResource(dices[number1]);
                int number2 = random.nextInt(6);
                rightDice.setImageResource(dices[number2]);
                if(number1 == number2)
                {
                    Context context = getApplicationContext();
                    CharSequence text = "You Winn";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

    }
}
