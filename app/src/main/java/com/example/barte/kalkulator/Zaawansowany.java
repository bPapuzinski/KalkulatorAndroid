package com.example.barte.kalkulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Zaawansowany extends AppCompatActivity {

    String wysw="";
    int liczniknawiaskow=0;
    boolean dzialanieuz=true;
    boolean trygonometria =false;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("wysw",wysw);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        String wysw1 = savedInstanceState.getString("wysw");
        wysw=wysw1;
        final TextView wyswietlacz = findViewById(R.id.Wyswietlacz);
        wyswietlacz.setText(wysw);
        super.onRestoreInstanceState(savedInstanceState);
    }


    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zaawansowany);


        final TextView wyswietlacz = findViewById(R.id.Wyswietlacz);
        final Button przycisk0 =findViewById(R.id.Przycisk0);
        final Button przycisk1 =findViewById(R.id.Przycisk1);
        final Button przycisk2 =findViewById(R.id.Przycisk2);
        final Button przycisk3 =findViewById(R.id.Przycisk3);
        final Button przycisk4 =findViewById(R.id.Przycisk4);
        final Button przycisk5 =findViewById(R.id.Przycisk5);
        final Button przycisk6 =findViewById(R.id.Przycisk6);
        final Button przycisk7 =findViewById(R.id.Przycisk7);
        final Button przycisk8 =findViewById(R.id.Przycisk8);
        final Button przycisk9 =findViewById(R.id.Przycisk9);
        final Button przyciskpi =findViewById(R.id.PrzyciskPi);
        final Button przyciskkropka =findViewById(R.id.PrzyciskKropka);
        final Button przycisknawiaszamykajacy =findViewById(R.id.PrzyciskNawiaszZmykajacy);
        final Button przycisknawiasotwierajacy =findViewById(R.id.PrzyciskNawiaszOtwierajacy);
        final Button przyciskac =findViewById(R.id.PrzyciskAC);
        final Button przyciskc =findViewById(R.id.PrzyciskC);
        final Button przyciskplus =findViewById(R.id.PrzyciskPlus);
        final Button przyciskminus =findViewById(R.id.PrzyciskMinus);
        final Button przyciskrazy =findViewById(R.id.PrzyciskRazy);
        final Button przyciskdzielenie =findViewById(R.id.PrzyciskDzielenie);
        final Button przyciskrowna =findViewById(R.id.PrzyciskRowna);
        final Button przyciskplusminus =findViewById(R.id.PrzyciskPlusMinus);
        final Button przycisksqrt =findViewById(R.id.PrzyciskSqrt);
        final Button przyciskxdo2 =findViewById(R.id.PrzyciskXdo2);
        final Button przycisksin =findViewById(R.id.PrzyciskSin);
        final Button przyciskcos =findViewById(R.id.PrzyciskCos);
        final Button przycisktan =findViewById(R.id.PrzyciskTan);
        final Button przyciskln =findViewById(R.id.PrzyciskLn);
        final Button przycisklog =findViewById(R.id.PrzyciskLog);
        final Button przyciskxdoy =findViewById(R.id.PrzyciskXdoy);



        final Kalkulator kalkulator = new Kalkulator();
        przycisk0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("0",wyswietlacz);

            }
        });
        przycisk1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("1",wyswietlacz);

            }
        });
        przycisk2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("2",wyswietlacz);

            }
        });
        przycisk3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("3",wyswietlacz);

            }
        });
        przycisk4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("4",wyswietlacz);

            }
        });
        przycisk5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("5",wyswietlacz);

            }
        });
        przycisk6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("6",wyswietlacz);

            }
        });
        przycisk7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("7",wyswietlacz);

            }
        });
        przycisk8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("8",wyswietlacz);

            }
        });
        przycisk9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("9",wyswietlacz);

            }
        });
        przyciskpi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Double a= Math.PI;
                String pi=a.toString();
                liczby(pi,wyswietlacz);

            }
        });
        przyciskkropka.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int x=wysw.indexOf(".");
                if(x==(-1))
                {
                    if(wyswietlacz.length()==0) {
                        liczby("0.", wyswietlacz);
                    }
                    else{
                        liczby(".", wyswietlacz);
                    }
                }


            }
        });

        przycisknawiaszamykajacy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(dzialanieuz==false && liczniknawiaskow>0)
                {
                    wysw+=")";
                    wyswietlacz.setText(wysw);
                    trygonometria =false;
                    liczniknawiaskow--;
                }
            }
        });
        przycisknawiasotwierajacy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                    wysw+="(";
                    wyswietlacz.setText(wysw);
                    trygonometria =false;
                    liczniknawiaskow++;

            }
        });
        przyciskac.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wysw="";
                wyswietlacz.setText(wysw);

            }
        });
        przyciskc.setOnClickListener(new View.OnClickListener()//todo
        {
            @Override
            public void onClick(View v) {
                if(!wysw.equals("")) {
                    String[] temp = wysw.split(" ");
                    wysw="";
                    for(int i=0;i<temp.length-1;i++)
                    {
                        if(i==temp.length-1){
                            wysw+=temp[i];
                        }
                        else {
                            wysw += temp[i] + " ";
                        }
                    }
                    //if + - * /
                    //if te z nawiasem
                    wyswietlacz.setText(wysw);
                }


            }
        });

        przyciskplusminus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                wysw= kalkulator.plusminus(wysw);
                wyswietlacz.setText(wysw);
            }
        });
        przyciskplus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(dzialanieuz==true || trygonometria==true){

                }
                else {

                    wysw += " + ";
                    wyswietlacz.setText(wysw);
                    dzialanieuz=true;
                }

            }
        });
        przyciskminus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(dzialanieuz==true || trygonometria==true){
                    wysw += "-";
                    wyswietlacz.setText(wysw);
                    dzialanieuz = false;
                    trygonometria = false;
                }
                else {
                        wysw += " - ";
                        wyswietlacz.setText(wysw);
                        dzialanieuz = true;
                }

            }
        });
        przyciskrazy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(dzialanieuz==true || trygonometria==true){

                }
                else {

                    wysw += " * ";
                    wyswietlacz.setText(wysw);
                    dzialanieuz=true;
                }

            }
        });
        przyciskdzielenie.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(dzialanieuz==true || trygonometria==true){

                }
                else {

                    wysw += " / ";
                    wyswietlacz.setText(wysw);
                    dzialanieuz=true;
                }

            }
        });
        przycisksqrt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                wysw += "sqrt (";
                wyswietlacz.setText(wysw);
                trygonometria =true;
                liczniknawiaskow++;

            }
        });
        przyciskxdo2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {


                wysw += " ^2";
                wyswietlacz.setText(wysw);
                dzialanieuz=true;



            }
        });
        przycisksin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                wysw += "sin (";
                wyswietlacz.setText(wysw);
                trygonometria =true;
                liczniknawiaskow++;

            }
        });
        przyciskcos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                    wysw += "cos (";
                wyswietlacz.setText(wysw);
                trygonometria =true;
                liczniknawiaskow++;
            }
        });
        przycisktan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                wysw += "tan (";
                wyswietlacz.setText(wysw);
                trygonometria =true;
                liczniknawiaskow++;

            }
        });
        przyciskln.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                wysw += "ln (";
                wyswietlacz.setText(wysw);
                trygonometria =true;
                liczniknawiaskow++;

            }
        });
        przycisklog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                wysw += "log (";
                wyswietlacz.setText(wysw);
                trygonometria =true;
                liczniknawiaskow++;

            }
        });
        przyciskxdoy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                wysw += " ^";
                wyswietlacz.setText(wysw);
                trygonometria =true;

            }
        });
        przyciskrowna.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                for(int i=0;i<liczniknawiaskow;i++)
                {
                    wysw+=")";
                }
                String temp=kalkulator.rowna(wysw);
                wysw=temp;
                wyswietlacz.setText(wysw);
                liczniknawiaskow=0;
                dzialanieuz=true;
                trygonometria =false;
            }
        });

    }

    private void liczby(String a,TextView wyswietlacz) {

        trygonometria=false;
        dzialanieuz=false;
        wysw=wysw+a;
        wyswietlacz.setText(wysw);

    }
}
