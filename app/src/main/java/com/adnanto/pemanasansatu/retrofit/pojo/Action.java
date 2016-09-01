package com.adnanto.pemanasansatu.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by adnanto on 8/31/16.
 */
public class Action {
    @Expose
    @SerializedName(value = "is_muted")
    private boolean isMuted;
    @Expose
    @SerializedName(value = "is_follow")
    private boolean isFollow;
    @Expose
    @SerializedName(value = "has_blocked")
    private boolean hasBlocked;
    @Expose
    @SerializedName(value = "is_pending")
    private boolean isPending;
    @Expose
    @SerializedName(value = "is_block")
    private boolean isBlock;

    public boolean isMuted() {
        return isMuted;
    }

    public void setMuted(boolean muted) {
        isMuted = muted;
    }

    public boolean isFollow() {
        return isFollow;
    }

    public void setFollow(boolean follow) {
        isFollow = follow;
    }

    public boolean isHasBlocked() {
        return hasBlocked;
    }

    public void setHasBlocked(boolean hasBlocked) {
        this.hasBlocked = hasBlocked;
    }

    public boolean isPending() {
        return isPending;
    }

    public void setPending(boolean pending) {
        isPending = pending;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }
}
