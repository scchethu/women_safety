package final_.student.womensafty;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        String msg=getIntent().getStringExtra("msg").replace("P","%");
        msg=msg.replace("A","\uD83D\uDE20");
        msg=msg.replace("H","\uD83D\uDE03");
        msg=msg.replace("S","\uD83D\uDE25");
        msg=msg.replace("N","\uD83D\uDE10");
        msg=msg.replace("Z","\uD83D\uDE32");
        msg=msg.replace("D","\uD83E\uDD22");
        msg=msg.replace("F","\uD83D\uDE28");
        StringRequest stringRequest=new StringRequest(Request.Method.GET,
                constants.IP + constants.TYPE3 + "msg="+ msg, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Toast.makeText(NotificationActivity.this, "data added", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}
