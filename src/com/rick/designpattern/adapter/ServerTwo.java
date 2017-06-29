package com.rick.designpattern.adapter;

/**
 * Created by MyPC on 2017/6/29.
 */
public class ServerTwo implements PlayerCount {
    @Override
    public String getServerName() {
        return "2服";
    }

    @Override
    public int getPlayerCount() {
        return Utility.getOnlinePlayerCount(2);
    }
}
