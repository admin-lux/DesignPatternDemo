package com.rick.designpattern.state;

/**
 * Created by MyPC on 2017/6/2.
 */
public class ClosingState extends LiftState {
    public ClosingState(Context mContext) {
        super(mContext);
    }

    @Override
    void open() {
        getmContext().setmLiftState(getmContext().getmOpeningState());
        getmContext().open();
    }

    @Override
    void close() {
        System.out.println("lift is state in close");
    }

    @Override
    void run() {
        getmContext().setmLiftState(getmContext().getmRunningState());
        getmContext().run();
    }

    @Override
    void stop() {
        getmContext().setmLiftState(getmContext().getmStoppingState());
        getmContext().stop();
    }
}
