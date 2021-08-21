package com.example.pythonrestapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apicontroller {

    // Open CMD & type ipconfig to get your IPv4 address

    // to set local url download ngrok and place the installed
    // file into c drive windows
    // then system 32 and paste it here.
    // Then open cmd and type "ngrok http 80"
    // then click enter copy the url path then start doing

//    static final String url = "http://192.168.43.12/ecommapi/";
    static final String url = "https://parseapi.back4app.com/";
    private static apicontroller clientobject;
    private static Retrofit retrofit;

    apicontroller()
    {
        retrofit = new Retrofit.Builder()
                       .baseUrl(url)
                       .addConverterFactory(GsonConverterFactory.create())
                       .build();
    }

    public static synchronized apicontroller getInstance()
    {
        if (clientobject == null)
            clientobject = new apicontroller();
        return clientobject;
    }

    apiset getapi()
    {
        return retrofit.create(apiset.class);
    }

}
