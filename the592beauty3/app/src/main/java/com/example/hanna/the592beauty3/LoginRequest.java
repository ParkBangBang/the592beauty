package com.example.hanna.the592beauty3;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest{
    private static final String LOGIN_REQUEST_URL = "https://phreshout999.000webhostapp.com/Login2.php";
    private Map<String, String> params;

    public LoginRequest(String ID, String Password, Response.Listener<String> listener){
        super(Request.Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("ID", ID);
        params.put("Password", Password);
    }

    @Override
    public Map<String, String> getParams(){
        return params;
    }
}
