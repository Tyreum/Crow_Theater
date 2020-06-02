package com.example.crow_theater;

import android.content.Context;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.android.volley.Request;
import com.android.volley.RequestQueue;

public class MySingleton {
    //Atributos ou variáveis Globais de acord com a documentação VolleyAPI
    private static MySingleton myInstance;
    private RequestQueue requestQueue;
    private ImageLoader imageLoader;
    private static Context myContext;

    //Método Construtor do objeto VolleyAPI
    public MySingleton(Context context) {
        myContext = context;
        this.requestQueue = requestQueue;
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(myContext.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized MySingleton getInstance(Context context) {
        if (myInstance == null) {
            myInstance = new MySingleton(context);
        }
        return myInstance;
    }

    public <T> void addToRequestque(Request <T> request) {
        requestQueue.add(request);
    }
}
