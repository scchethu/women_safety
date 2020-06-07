package final_.student.womensafty;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShowAnalyticActivity extends AppCompatActivity {
RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_analytic);
        rv=findViewById(R.id.rv);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, constants.IP+constants.TYPE4+"date="+getIntent().getStringExtra("date"),
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        if(response.equals("-1")) {
                            Toast.makeText(getApplicationContext(), "Server Error", Toast.LENGTH_SHORT).show();
                            return;
                        }else{
                           // Toast.makeText(ShowAnalyticActivity.this, getIntent().getStringExtra("date"), Toast.LENGTH_SHORT).show();
                            try {
                                constants.dataList.clear();
                                JSONArray jsonArray=new JSONArray(response);
                                for(int i=0;i<jsonArray.length();i++)
                                {
                                    JSONObject object=jsonArray.getJSONObject(i);
                                    constants.dataList.add(new data(object.getInt("id"),
                                            object.getString("msg"),object.getString("date")));
                                }

                                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                                rv.setLayoutManager(mLayoutManager);
                                rv.setItemAnimator(new DefaultItemAnimator());
                               rv.setAdapter(new Adapter());


                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}
