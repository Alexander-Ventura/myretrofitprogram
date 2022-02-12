package com.example.myretrofitprogram;

public class ApiKeys {

    ApiKeys api = new ApiKeys();
    public String key = "GOOGLE_API_KEY";

    public void key(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
