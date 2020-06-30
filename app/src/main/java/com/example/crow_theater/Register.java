package com.example.crow_theater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

import static com.android.volley.Request.*;
import static com.android.volley.Request.Method.POST;

public class Register extends AppCompatActivity {

    private Button btnNewReg;
    EditText txtNameReg;
    EditText txtDescriptionReg;
    EditText txtGradeReg;

    String serverURL = "@string/httphost";

    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnNewReg = findViewById(R.id.btnNewCreation);
        //Habilitando o cache (para melhor performace)
        Cache cache = new DiskBasedCache(getCacheDir(),1024 * 1024);
        //Habilitando a rede
        Network network = new BasicNetwork(new HurlStack());
        //Instanciando RequetQueue com o Cache e Network
        requestQueue = new RequestQueue(cache, network);
        //Iniciar RequestQueue
        requestQueue.start();

        String url = "https://www.example.com";

        btnNewReg = (Button) findViewById(R.id.btnNewCreation);

        btnNewReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMain();
                Toast.makeText(getApplicationContext(),"Movie Created!",Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void openActivityMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
