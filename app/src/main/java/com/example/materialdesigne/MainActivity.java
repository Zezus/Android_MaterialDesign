package com.example.materialdesigne;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> users = new ArrayList<>();
        User firstUser = new User();
        firstUser.setId(1);
        firstUser.setLogin("admim");
        firstUser.setPassword("admin");
        firstUser.setImage(R.mipmap.ic_launcher);

        User secondUser = new User();
        firstUser.setId(2);
        firstUser.setLogin("admim2");
        firstUser.setPassword("admin2");
        firstUser.setImage(R.mipmap.ic_launcher);

        User thirdUser = new User();
        firstUser.setId(3);
        firstUser.setLogin("admim3");
        firstUser.setPassword("admin3");
        firstUser.setImage(R.mipmap.ic_launcher);


        users.add(firstUser);
        users.add(secondUser);
        users.add(thirdUser);

        listView = findViewById(R.id.am_cities_lv);

        UsersAdapter adapter = new UsersAdapter(getApplicationContext(), users);
        listView.setAdapter(adapter);


    }
}
