package com.teamyoco.echee.handlingrotation;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {
    private MyRetainedFragment dataFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataFragment = (MyRetainedFragment) getFragmentManager().findFragmentByTag("data");

        if (dataFragment == null) {
            dataFragment = new MyRetainedFragment();
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.rlContainer, dataFragment, "data")
                    .addToBackStack("data")
                    .commit();
        }

    }

    public void onDestroy() {
        super.onDestroy();
    }
}
