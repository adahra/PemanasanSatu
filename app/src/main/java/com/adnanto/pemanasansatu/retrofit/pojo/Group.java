package com.adnanto.pemanasansatu.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adnanto on 8/31/16.
 */
public class Group {
    @Expose
    @SerializedName(value = "verified")
    private Verified verified;
    @Expose
    @SerializedName(value = "description")
    private String description;
    @Expose
    @SerializedName(value = "bangsa_name")
    private String bangsaName;
    @Expose
    @SerializedName(value = "room_list")
    private List<RoomList> roomLists = new ArrayList<RoomList>();
    @Expose
    @SerializedName(value = "id")
    private int id;
    @Expose
    @SerializedName(value = "topic")
    private Topic topic;
    @Expose
    @SerializedName(value = "action")
    private Action action;
    @Expose
    @SerializedName(value = "avatar")
    private Avatar avatar;
    @Expose
    @SerializedName(value = "statistic")
    private Statistic statistic;
    @Expose
    @SerializedName(value = "policy")
    private Policy policy;
    @Expose
    @SerializedName(value = "header_image")
    private String headerImage;
    @Expose
    @SerializedName(value = "name")
    private String name;

    public Verified getVerified() {
        return verified;
    }

    public void setVerified(Verified verified) {
        this.verified = verified;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBangsaName() {
        return bangsaName;
    }

    public void setBangsaName(String bangsaName) {
        this.bangsaName = bangsaName;
    }

    public List<RoomList> getRoomLists() {
        return roomLists;
    }

    public void setRoomLists(List<RoomList> roomLists) {
        this.roomLists = roomLists;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
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

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
