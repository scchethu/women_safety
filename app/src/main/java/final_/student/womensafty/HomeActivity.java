
package final_.student.womensafty;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HomeActivity extends AppCompatActivity {
TextView tv_fromDate,tv_toDate;
Button btnGet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        FirebaseMessaging.getInstance().subscribeToTopic("women_safety").addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_LONG).show();
            }
        });

        tv_fromDate=findViewById(R.id.sdate);
        tv_toDate=findViewById(R.id.edate);
        tv_fromDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentDate(tv_fromDate);
            }
        });
        tv_toDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentDate(tv_toDate);
            }
        });
        btnGet=(Button)findViewById(R.id.go);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  tvw.setText("Selected Date: "+ picker.getDayOfMonth()+"/"+ (picker.getMonth() + 1)+"/"+picker.getYear());
                Intent intent=new Intent(getApplicationContext(),ShowAnalyticActivity.class);
                intent.putExtra("sdate",tv_fromDate.getText().toString());
                intent.putExtra("edate",tv_toDate.getText().toString());
                startActivity(intent);
            }
        });
    }
    public void getCurrentDate(final TextView tvDate) {

        DatePickerDialog datePickerDialog = new DatePickerDialog(HomeActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                tvDate.setText(simpleDateFormat.format(calendar.getTime()));
            }


        }, Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
    }

