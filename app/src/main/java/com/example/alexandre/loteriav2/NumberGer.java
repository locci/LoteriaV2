package com.example.alexandre.loteriav2;

import java.util.ArrayList;

/**
 * Created by alexandre on 30/01/18.
 */

public class NumberGer {

    public ArrayList<Integer> buildListOfNumber(int NumberTotal, int Range) {

        ArrayList<Integer> NumberOutList = new ArrayList<>();
        int Cont = 0;
        int NumberChoose = 0;

        while (Cont < NumberTotal) {

            NumberChoose = (int)(Math.random()*Range);
            if(!NumberOutList.contains(NumberChoose)) {

                NumberOutList.add(NumberChoose);
                Cont++;

            }


        }

        return NumberOutList;

    }

}
