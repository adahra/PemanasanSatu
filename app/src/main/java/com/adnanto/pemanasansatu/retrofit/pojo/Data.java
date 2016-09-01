package com.adnanto.pemanasansatu.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adnanto on 8/31/16.
 */
public class Data {
    @Expose
    @SerializedName(value = "status")
    private int status;
    @Expose
    @SerializedName(value = "timestamp")
    private int timestamp;
    @Expose
    @SerializedName(value = "friends")
    private List<Friend> friends = new ArrayList<Friend>();
    @Expose
    @SerializedName(value = "status_lang")
    private String statusLang;
    @Expose
    @SerializedName("groups")
    private List<Group> groups = new ArrayList<>();

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public String getStatusLang() {
        return statusLang;
    }

    public void setStatusLang(String statusLang) {
        this.statusLang = statusLang;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
