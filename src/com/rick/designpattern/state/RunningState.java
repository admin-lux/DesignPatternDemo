package com.rick.designpattern.state;

/**
 * Created by MyPC on 2017/6/2.
 */
public class RunningState extends LiftState {
    public RunningState(Context mContext) {
        super(mContext);
    }

    @Override
    void open() {
        throw new NullPointerException("lift is state in run");
    }

    @Override
    void close() {
        throw new NullPointerException("lift is state in run");
    }

    @Override
    void run() {
        System.out.println("lift is state in run");
    }

    @Override
    void stop() {
        getmContext().setmLiftState(getmContext().getmStoppingState());
        getmContext().stop();
    }
}
