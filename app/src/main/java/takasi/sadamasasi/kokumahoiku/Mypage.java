package takasi.sadamasasi.kokumahoiku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by arsuser on 2017/11/16.
 */

public class Mypage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.k1_1_mypage);


        Button button_itizi = (Button) findViewById(R.id.button_itizi);
        button_itizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mypage.this, Sougei_hoiku.class);
                startActivity(intent);
            }
        });
        Button button_sougei = (Button) findViewById(R.id.button_sougei);
        button_sougei.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mypage.this, Itizi_hoiku.class);
                startActivity(intent);
            }

        });
    }




}





