package com.testing.mymoduletestcore;

import com.testing.mymoduletest1.MyModel;

public class MyCoreCls {
    private MyModel myModel;

    public MyCoreCls() {}

    public MyCoreCls(MyModel myModel) {
        this.myModel = myModel;
    }

    public MyModel getMyModel() {
        return myModel;
    }

    public void setMyModel(MyModel myModel) {
        this.myModel = myModel;
    }
}
