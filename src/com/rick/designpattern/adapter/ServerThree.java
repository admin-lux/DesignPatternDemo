package com.rick.designpattern.adapter;

/**
 * Created by MyPC on 2017/6/29.
 */
public class ServerThree implements PlayerCount {
    @Override
    public String getServerName() {
        return "3服";
    }

    @Override
    public int getPlayerCount() {
        return Utility.getOnlinePlayerCount(3);
    }
}
