package takasi.sadamasasi.kokumahoiku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Hello!",Toast.LENGTH_SHORT).show();
        Button Reg = new Button(this);

        Reg = (Button)findViewById(R.id.entry_button);

       Reg.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this,"登録",Toast.LENGTH_SHORT).show(); //クリックされたらトーストを出すようにする
    }
}
