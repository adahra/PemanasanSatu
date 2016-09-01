package com.adnanto.pemanasansatu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnFollowing;
    private Button btnFollowers;
    private Button btnGroup;
    private boolean isFollow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFollowing = (Button) findViewById(R.id.btnMainFollowing);
        btnFollowing.setOnClickListener(this);
        btnFollowers = (Button) findViewById(R.id.btnMainFollowers);
        btnFollowers.setOnClickListener(this);
        btnGroup = (Button) findViewById(R.id.btnMainGroup);
        btnGroup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMainFollowing:
                Intent intentFollowing = new Intent(MainActivity.this, FollowerFollowing.class);
                startActivity(intentFollowing);
                break;
            case R.id.btnMainFollowers:
                Intent intentFollowers = new Intent(MainActivity.this, FollowerFollowing.class);
                intentFollowers.putExtra("follower", isFollow);
                startActivity(intentFollowers);
                break;
            case R.id.btnMainGroup:
                Intent intentGroup = new Intent(MainActivity.this, Community.class);
                startActivity(intentGroup);
                break;
        }
    }
}
