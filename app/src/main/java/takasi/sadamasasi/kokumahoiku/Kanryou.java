package takasi.sadamasasi.kokumahoiku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by arsuser on 2017/11/17.
 */

public class Kanryou extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.k_6_3_kanryou);

        Button button_mypage=(Button) findViewById(R.id.button_mypage);
        button_mypage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Kanryou.this,Mypage.class);
                startActivity(intent);
            }
        });

    }
}