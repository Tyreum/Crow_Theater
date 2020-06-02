package com.example.crow_theater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.w3c.dom.Text;

public class Register extends AppCompatActivity {

    Button btnNewReg;
    EditText txtLoginReg;
    EditText txtPasswordReg;
    EditText txtEmailReg;

    String serverURL = "http://192.168.15.10/CrowTheater/CrowTheater_server.php";

    RequestQueue requestQueue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnNewReg = findViewById(R.id.btnNewReg);
        //Habilitando o cache (para melhor performace)
        Cache cache = new DiskBasedCache(getCacheDir(),1024 * 1024);
        //Habilitando a rede
        Network network = new BasicNetwork(new HurlStack());
        //Instanciando RequetQueue com o Cache e Network
        requestQueue = new RequestQueue(cache, network);
        //Iniciar RequestQueue
        requestQueue.start();

        String url = "https://www.example.com";

        btnNewReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final RequestQueue requestQueue = Volley.newRequestQueue(Request.Method.GET);
            }
        });
    }
}
