package takasi.sadamasasi.kokumahoiku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by arsuser on 2017/11/16.
 */

public class Itizi_time extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.k2_2_itizihoiku_time);

        Button button_kakunin=(Button)findViewById(R.id.button_kakunin);
        button_kakunin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Itizi_time.this,Itizi_kakunin.class);
                startActivity(intent);
            }
        });
    }
}