package com.adnanto.pemanasansatu.retrofit;

import com.adnanto.pemanasansatu.retrofit.pojo.Data;
import com.adnanto.pemanasansatu.retrofit.pojo.Group;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by adnanto on 8/30/16.
 */
public interface DataInterface {
    @GET("sdp-latihan/following.php")
    Call<Data> dataUserFollowing();

    @GET("sdp-latihan/grouplist.php")
    Call<Data> dataGroup();

    @GET("sdp-latihan/follower.php")
    Call<Data> dataUserFollower();
}
