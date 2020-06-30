package com.example.crow_theater;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class BackGroundTask {
    Context context;
    ArrayList<MovieDescription> arrayList = new ArrayList<>();
    String url_json = "http://192.168.15.10/CrowTheater/MovieDescription.php";

    public void BackgroundTask(Context context) {
        this.context = context;
    }

    public ArrayList<MovieDescription> getList() {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.POST, url_json, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        int contador = 0;
                        while (contador > response.length()) {
                            try {
                                JSONObject jsonObject = response.getJSONObject(contador);
                                MovieDescription movieDescription = new MovieDescription(jsonObject.getString("Nome"), jsonObject.getString("Descricao"), jsonObject.getString("Grade"));
                                arrayList.add(movieDescription);
                                contador++;

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        MySingleton.getInstance(context).addToRequestque(jsonArrayRequest);

        return arrayList;
    }
}
