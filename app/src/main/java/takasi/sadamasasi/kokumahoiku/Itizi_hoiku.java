package takasi.sadamasasi.kokumahoiku;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;


import java.util.Date;

import static android.R.attr.id;


/**
 * Created by arsuser on 2017/11/16.
 */

public class Itizi_hoiku extends AppCompatActivity implements android.widget.CalendarView.OnDateChangeListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.k2_1_itizihoiku_yoyuku);

        CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(this);


    }

    @Override
    public void onSelectedDayChange(@NonNull android.widget.CalendarView view, int year, int month, int dayOfMonth) {
        Intent varIntent=new Intent(Itizi_hoiku.this,Itizi_time.class);

        startActivity(varIntent);
    }
}



