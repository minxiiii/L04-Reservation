package sg.edu.rp.c346.id21022186.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // variable making
    DatePicker dp;
    TimePicker tp;
    TextView name;
    TextView hp;
    TextView pax;
    Button btnReset;
    Button btnSubmit;
    TextView tvDisplay;
    RadioGroup area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link
        dp = findViewById(R.id.dp);
        tp = findViewById(R.id.tp);
        name = findViewById(R.id.name);
        hp = findViewById(R.id.phoneNumber);
        pax = findViewById(R.id.Pax);
        btnReset = findViewById(R.id.buttonReset);
        btnSubmit = findViewById(R.id.buttonSubmit);
        tvDisplay = findViewById(R.id.tvDisplay);
        area = findViewById(R.id.area);


        // link submit button to display the info for a while

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textName = "Name:" + name.getText().toString();
                String textHp = "Phone number: " + hp.getText().toString();
                String textPax = "Pax:" + pax.getText().toString();

                int day = dp.getDayOfMonth();
                int month = dp.getDayOfMonth();
                int year = dp.getYear();
                String textDay = "Day is" + day + "/" + month + "/" + year;

                int hour = tp.getCurrentHour();
                int min = tp.getCurrentMinute();
                String textTime = "Time is" + hour + ":" + min;


                Toast.makeText(MainActivity.this,textName , Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, textHp, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,textPax , Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, textDay, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,textTime , Toast.LENGTH_SHORT).show();

                String value = ((RadioButton) findViewById(area.getCheckedRadioButtonId()))
                        .getText().toString();
                Toast.makeText(MainActivity.this,value , Toast.LENGTH_SHORT).show();

            }
        });

        // reset button
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnReset.setOnClickListener((View.OnClickListener) btnReset);
            }
        });
    }}