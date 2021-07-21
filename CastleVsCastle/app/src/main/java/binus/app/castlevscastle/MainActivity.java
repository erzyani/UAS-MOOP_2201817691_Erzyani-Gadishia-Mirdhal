package binus.app.castlevscastle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import binus.app.castlevscastle.gameplay.BattleWorker;
import binus.app.castlevscastle.gameplay.Castle;
import binus.app.castlevscastle.gameplay.HorseCastle;
import binus.app.castlevscastle.gameplay.SteelCastle;

import  java.lang.Thread;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Activity myActivity = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        HorseCastle c1 = new HorseCastle();
        SteelCastle c2 = new SteelCastle();


        /** init armies for each Castle c1 and c2
         *
         */



        Castle fightingCastles[] = new Castle[2];
        fightingCastles[0] = c2;
        fightingCastles[1] = c1;

        initCastleImageBattle(fightingCastles);

        final Button btn = findViewById(R.id.fightNowBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                BattleWorker bw = new BattleWorker(myActivity, c1, c2);
                new Thread(bw).run();


            }
        });
    }


    private void initCastleImageBattle(Castle[] castles) {
        //assume castles has 2 members

        Castle left = castles[0];
        Castle right = castles[1];

        loadCastleImage(findViewById(R.id.castleLeft),left);
        loadCastleImage(findViewById(R.id.castleRight),right);

    }

    private void loadCastleImage (ImageView iView, Castle ct) {
        if (ct instanceof HorseCastle) {
            iView.setBackgroundResource(R.drawable.amongputih);
        }else if (ct instanceof SteelCastle) {
            iView.setBackgroundResource(R.drawable.amongkuning);
        }else  {
            iView.setBackgroundResource(R.drawable.amongputih);
        }
    }



}