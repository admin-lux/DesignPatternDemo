package com.rick.designpattern.state;

/**
 * Created by MyPC on 2017/6/2.
 */
public class StoppingState extends LiftState {
    public StoppingState(Context mContext) {
        super(mContext);
    }

    @Override
    void open() {
        getmContext().setmLiftState(getmContext().getmOpeningState());
        getmContext().open();
    }

    @Override
    void close() {
        getmContext().setmLiftState(getmContext().getmClosingState());
        getmContext().close();
    }

    @Override
    void run() {
        getmContext().setmLiftState(getmContext().getmRunningState());
        getmContext().run();
    }

    @Override
    void stop() {
        System.out.println("lift is state in stop");
    }
}
