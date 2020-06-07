package final_.student.womensafty;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    protected void onStart() {
        super.onStart();
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && getIntent().getExtras().containsKey("msg")) {
            Intent i;
                i = new Intent(this, NotificationActivity.class);
            i.putExtras(getIntent().getExtras());
            startActivity(i);
            finish();
        }else
        {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                    finish();
                }
            }, 2000);

        }
    }
}
