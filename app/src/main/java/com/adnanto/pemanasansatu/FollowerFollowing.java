package com.adnanto.pemanasansatu;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.adnanto.pemanasansatu.lib.DataAdapter;
import com.adnanto.pemanasansatu.retrofit.DataInterface;
import com.adnanto.pemanasansatu.retrofit.ServiceGenerator;
import com.adnanto.pemanasansatu.retrofit.pojo.Data;
import com.adnanto.pemanasansatu.retrofit.pojo.Friend;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FollowerFollowing extends AppCompatActivity {
    private final String TAG = FollowerFollowing.class.getSimpleName();
    private ListView lvFolFol;
    private List<Friend> friends = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);
        lvFolFol = (ListView) findViewById(R.id.lvCommunity);

        getData();
    }

    private void getData() {
        final ProgressDialog progressDialog = ProgressDialog.show(FollowerFollowing.this,
                "Memuat...", "Silakan Tunggu!", false, false);


        DataInterface dataInterface = ServiceGenerator.createService(DataInterface.class);
        Call<Data> call = dataInterface.dataUserFollowing();
        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                progressDialog.dismiss();

                friends = response.body().getFriends();

                String[] dataFriend = new String[friends.size()];
                String[] dataAvatar = new String[friends.size()];
                String[] dataName = new String[friends.size()];
                boolean[] dataAction = new boolean[friends.size()];

                for (int i = 0; i < friends.size(); i++) {
                    dataFriend[i] = friends.get(i).getUsername();
                    dataAvatar[i] = friends.get(i).getAvatar().getSmall();
                    dataName[i] = friends.get(i).getName();
                    dataAction[i] = friends.get(i).getAction().isFollow();
                }

                DataAdapter dataAdapter = new DataAdapter(FollowerFollowing.this, dataAvatar, dataFriend, dataName, dataAction);
                lvFolFol.setAdapter(dataAdapter);

            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                progressDialog.dismiss();
                Log.e(TAG, t.toString());
            }
        });
    }
}
