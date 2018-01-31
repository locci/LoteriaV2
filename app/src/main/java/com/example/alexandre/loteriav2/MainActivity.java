package com.example.alexandre.loteriav2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

//import static com.example.alexandre.loteriav2.R.id.NumberOuttextView2;

public class MainActivity extends AppCompatActivity {

    private static final int MEGASENASIX = 6;
    private static final int MEGASENARANGE = 60;
    private static final int QUINANACINCO = 5;
    private static final int QUINARANGE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView NameMegaSena = (TextView) findViewById(R.id.NameMegaSenaExtView);
        NameMegaSena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView NumberOuttextView2 = (TextView) findViewById(R.id.numberOuttextView);
                String outNumberForTextView = "";
                NumberGer ng = new NumberGer();
                ArrayList<Integer> outNumber;
                outNumber = ng.buildListOfNumber(MEGASENASIX, MEGASENARANGE);

                for (int i = 0; i < outNumber.size(); i++) {

                    outNumberForTextView = outNumberForTextView + " " + outNumber.get(i);

                }

                outNumberForTextView = NumberOuttextView2.getText().toString().substring(0,4) + " " + outNumberForTextView;
                NumberOuttextView2.setText("");
                NumberOuttextView2.setText(outNumberForTextView);


            }
        });

        TextView NameQuina = (TextView) findViewById(R.id.QuinaTextView);
        NameQuina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView QuinaNumber = (TextView) findViewById(R.id.QuinaNumberOuttextView2);
                String outNumberForTextView = "";
                NumberGer ng = new NumberGer();
                ArrayList<Integer> outNumber;
                outNumber = ng.buildListOfNumber(QUINANACINCO, QUINARANGE);

                for (int i = 0; i < outNumber.size(); i++) {

                    outNumberForTextView = outNumberForTextView + " " + outNumber.get(i);

                }

                outNumberForTextView = QuinaNumber.getText().toString().substring(0,4) + " " + outNumberForTextView;
                QuinaNumber.setText("");
                QuinaNumber.setText(outNumberForTextView);

            }
        });

    }
}
