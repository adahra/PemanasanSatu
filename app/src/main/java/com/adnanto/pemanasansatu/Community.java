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
import com.adnanto.pemanasansatu.retrofit.pojo.Group;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Community extends AppCompatActivity {
    private static final String TAG = Community.class.getSimpleName();
    private ListView lvGroup;
    private List<Group> groupList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);
        lvGroup = (ListView) findViewById(R.id.lvCommunity);

        getGroup();
    }

    private void getGroup() {
        final ProgressDialog progressDialog = ProgressDialog.show(Community.this,
                "Memuat...", "Silakan Tunggu!", false, false);

        DataInterface dataInterface = ServiceGenerator.createService(DataInterface.class);
        Call<Data> dataCall = dataInterface.dataGroup();
        dataCall.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                progressDialog.dismiss();

                groupList = response.body().getGroups();

                String[] dataAvatar = new String[groupList.size()];
                String[] dataName = new String[groupList.size()];
                String[] dataDescription = new String[groupList.size()];
                String[] dataStatistic = new String[groupList.size()];
                for (int i = 0; i < groupList.size(); i++) {
                    dataAvatar[i] = groupList.get(i).getAvatar().getSmall();
                    dataName[i] = groupList.get(i).getName().trim();
                    dataDescription[i] = groupList.get(i).getDescription().trim();
                    dataStatistic[i] = String.valueOf(groupList.get(i).getStatistic().getUser()).concat(" members");
                }

                DataAdapter dataAdapter = new DataAdapter(Community.this, dataAvatar, dataName,
                        dataDescription, dataStatistic);
                lvGroup.setAdapter(dataAdapter);
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                progressDialog.dismiss();

            }
        });
    }
}
