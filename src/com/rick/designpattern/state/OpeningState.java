package com.rick.designpattern.state;

/**
 * Created by MyPC on 2017/6/2.
 */
public class OpeningState extends LiftState {
    public OpeningState(Context mContext) {
        super(mContext);
    }

    @Override
    void open() {
        System.out.println("lift is state in open");
    }

    @Override
    void close() {
        getmContext().setmLiftState(getmContext().getmClosingState());
        getmContext().close();
    }

    @Override
    void run() {
        throw new NullPointerException("lift is state in open");
    }

    @Override
    void stop() {
        getmContext().setmLiftState(getmContext().getmStoppingState());
        getmContext().stop();
    }
}
