package takasi.sadamasasi.kokumahoiku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by arsuser on 2017/11/17.
 */

public class Sougei_kakunin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.k3_2_sougei_kakunin);

        Button button_back=(Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sougei_kakunin.this,Sougei_hoiku.class);
                startActivity(intent);
            }
        });

        Button button_keltutei=(Button) findViewById(R.id.button_keltutei);
        button_keltutei.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sougei_kakunin.this,Kanryou.class);
                startActivity(intent);
            }
        });
    }
}
