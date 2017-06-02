package com.rick.designpattern.state;

/**
 * Created by MyPC on 2017/6/2.
 */
public abstract class LiftState {
    private Context mContext;

    public LiftState(Context mContext) {
        this.mContext = mContext;
    }

    /**
     * 电梯开门状态处理
     */
    abstract void open();


    /**
     * 电梯关门状态
     */
    abstract void close();

    /**
     * 电梯运行状态，如上楼、下楼
     */
    abstract void run();

    /**
     * 电梯停止状态
     */
    abstract void stop();


    public Context getmContext() {
        return mContext;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }
}
