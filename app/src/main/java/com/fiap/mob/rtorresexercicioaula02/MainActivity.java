package com.fiap.mob.rtorresexercicioaula02;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgJogador, imgPC;
    private TextView edtMessage;
    private int[] intImgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intImgs = new int[6];
        intImgs[0] = R.drawable.dado1;
        intImgs[1] = R.drawable.dado2;
        intImgs[2] = R.drawable.dado3;
        intImgs[3] = R.drawable.dado4;
        intImgs[4] = R.drawable.dado5;
        intImgs[5] = R.drawable.dado6;

        imgJogador = (ImageView) findViewById(R.id.imgJogador);
        imgPC = (ImageView) findViewById(R.id.imgPC);
        edtMessage = (TextView) findViewById(R.id.lblVencedor);
    }

    public void mtdJogar(View v){
        Random rJogador = new Random();
        Random rPC = new Random();

        int intJogador = rJogador.nextInt(5);
        int intPC = rPC.nextInt(5);

        imgJogador.setImageResource(intImgs[intJogador+1]);
        imgPC.setImageResource(intImgs[intPC+1]);

        edtMessage.setText((intJogador == intPC ? "Empate!" : (intJogador > intPC ? "Jogador Venceu!" : "Computador Venceu!")));
    }
}
