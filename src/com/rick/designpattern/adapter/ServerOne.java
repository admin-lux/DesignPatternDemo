package com.rick.designpattern.adapter;

/**
 * Created by MyPC on 2017/6/29.
 */
public class ServerOne implements PlayerCount {
    @Override
    public String getServerName() {
        return "1服";
    }

    @Override
    public int getPlayerCount() {
        return new ServerFirst().getOnlinePlayerCount();
    }
}
