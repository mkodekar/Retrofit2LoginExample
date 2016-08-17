package com.example.pritesh.retrofitsample;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {


    List<Pojo> books;

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text = (TextView)findViewById(R.id.text1);


        String url = "http://e-magicindia.com/";


        final ProgressDialog loading = ProgressDialog.show(this,"Fetching Data","Please wait...",false,false);


        RestAdapter radapter=new RestAdapter.Builder().setEndpoint(url).build();

        My restInt=radapter.create(My.class);



        restInt.getUser("yash", "yash", new Callback<Pojo>() {
            @Override
            public void success(Pojo pojo, Response response) {

                loading.dismiss();

                String msg = pojo.get0().getCity();

                System.out.println("SIZ:" + msg);



            }

            @Override
            public void failure(RetrofitError error) {

                loading.dismiss();

                System.out.println("SIZ:" + error.getMessage());



            }
        });
    }
}
