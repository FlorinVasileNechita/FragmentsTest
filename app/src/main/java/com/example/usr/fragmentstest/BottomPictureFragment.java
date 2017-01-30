package com.example.usr.fragmentstest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by usr on 1/30/2017.
 */

public class BottomPictureFragment extends Fragment {

    TextView topTextView, bottomTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);

        topTextView = (TextView) view.findViewById(R.id.textView);
        bottomTextView = (TextView) view.findViewById(R.id.textView2);
        
        return view;
    }

    public void setText(String top, String bottom) {
        topTextView.setText(top);
        bottomTextView.setText(bottom);
    }
}
