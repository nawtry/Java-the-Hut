package ek327.finalproject;

/**
 * Created by nawtry on 12/7/15.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class createfrag extends Fragment {
    public static Fragment newInstance(Context context) {
        createfrag frag = new createfrag();
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.activity_create_an_event, null);
        return root;
    }
}
