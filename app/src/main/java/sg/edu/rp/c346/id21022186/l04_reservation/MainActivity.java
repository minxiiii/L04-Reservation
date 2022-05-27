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
                Toast.makeText(MainActivity.this, "the button is clicked", Toast.LENGTH_SHORT).show();
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


                tvDisplay.setText(textName);
                tvDisplay.setText(textHp);
                tvDisplay.setText(textPax);
                tvDisplay.setText(textDay);
                tvDisplay.setText(textTime);

                String value = ((RadioButton) findViewById(area.getCheckedRadioButtonId()))
                        .getText().toString();
                tvDisplay.setText(value);

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