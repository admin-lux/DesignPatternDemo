package com.rick.designpattern.state;

/**
 * Created by MyPC on 2017/6/2.
 */
public class Context {
    private OpeningState mOpeningState = new OpeningState(this);
    private ClosingState mClosingState = new ClosingState(this);
    private RunningState mRunningState = new RunningState(this);
    private StoppingState mStoppingState = new StoppingState(this);

    private LiftState mLiftState;

    public Context() {
        setmLiftState(getmStoppingState());
        getmLiftState().setmContext(this);
    }

    public void open() {
        mLiftState.open();
    }

    public void close() {
        mLiftState.close();
    }

    public void run() {
        mLiftState.run();
    }

    public void stop() {
        mLiftState.stop();
    }

    public OpeningState getmOpeningState() {
        return mOpeningState;
    }

    public ClosingState getmClosingState() {
        return mClosingState;
    }

    public RunningState getmRunningState() {
        return mRunningState;
    }

    public StoppingState getmStoppingState() {
        return mStoppingState;
    }

    public LiftState getmLiftState() {
        return mLiftState;
    }

    public void setmLiftState(LiftState mLiftState) {
        this.mLiftState = mLiftState;
    }
}
