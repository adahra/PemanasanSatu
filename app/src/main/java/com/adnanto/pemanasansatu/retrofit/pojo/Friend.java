package com.adnanto.pemanasansatu.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adnanto on 8/31/16.
 */
public class Friend {
    @Expose
    @SerializedName(value = "username")
    private String username;
    @Expose
    @SerializedName(value = "bio")
    private String bio;
    @Expose
    @SerializedName(value = "verified")
    private Verified verified;
    @Expose
    @SerializedName(value = "name")
    private String name;
    @Expose
    @SerializedName(value = "bangsa")
    private List<Object> bangsa = new ArrayList<Object>();
    @Expose
    @SerializedName(value = "avatar")
    private Avatar avatar;
    @Expose
    @SerializedName(value = "statistic")
    private Statistic statistic;
    @Expose
    @SerializedName(value = "action")
    private Action action;
    @Expose
    @SerializedName(value = "id")
    private int id;
    @Expose
    @SerializedName(value = "is_private")
    private boolean isPrivate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Verified getVerified() {
        return verified;
    }

    public void setVerified(Verified verified) {
        this.verified = verified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getBangsa() {
        return bangsa;
    }

    public void setBangsa(List<Object> bangsa) {
        this.bangsa = bangsa;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public Statistic getStatistic() {
        return statistic;
    }

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }
}
