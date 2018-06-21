package com.by.evgeny07.govore.myhomework;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class StartDiagram extends Activity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Diagram(this));



    }
}
