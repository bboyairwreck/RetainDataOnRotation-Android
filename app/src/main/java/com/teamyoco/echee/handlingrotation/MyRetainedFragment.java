package com.teamyoco.echee.handlingrotation;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MyRetainedFragment extends Fragment {
    private String name = "[Insert Name]";
    private int numClicks = 0;

    public MyRetainedFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // retain this fragment
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_clicker, container, false);

        final Button btnClickMe = (Button) view.findViewById(R.id.btnClickMe);
        TextView tvNumClicks = (TextView) view.findViewById(R.id.tvNumClicks);
        tvNumClicks.setText(numClicks + "");

        TextView tvName = (TextView) view.findViewById(R.id.tvName);
        tvName.setText(name);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numClicks++;

                TextView tvNumClicks = (TextView) view.findViewById(R.id.tvNumClicks);
                tvNumClicks.setText(numClicks + "");
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
