package takasi.sadamasasi.kokumahoiku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by arsuser on 2017/11/16.
 */

public class Itizi_kakunin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.k2_3_itizihoiku_kakunin);


        Button button＿keltutei=(Button) findViewById(R.id.button＿keltutei);
        button＿keltutei.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Itizi_kakunin.this,Kanryou.class);
                startActivity(intent);
            }
        });

        Button button_back=(Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Itizi_kakunin.this,Itizi_time.class);
                startActivity(intent);
            }
        });
    }
}