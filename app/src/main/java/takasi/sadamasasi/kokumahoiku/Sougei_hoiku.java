package takasi.sadamasasi.kokumahoiku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by arsuser on 2017/11/16.
 */

public class Sougei_hoiku extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.k3_1_sougei_hoiku);

        Button button_back=(Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sougei_hoiku.this,Mypage.class);
                startActivity(intent);
            }
        });

        Button button_keltutei=(Button) findViewById(R.id.button_keltutei);
        button_keltutei.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sougei_hoiku.this,Sougei_kakunin.class);
                startActivity(intent);
            }
        });
    }
}