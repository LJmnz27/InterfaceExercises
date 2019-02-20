package org.pursuit.fragmentinterfaceexercise;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.fragmentinterfaceexercise.controller.SimpleRVAdapter;

import java.security.AccessControlContext;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RVFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RVFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters

    String[] strings = {"1", "2", "3", "4", "5", "6", "7"};


    public RVFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static RVFragment newInstance() {
        RVFragment fragment = new RVFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView rv = new RecyclerView(getContext());
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(new SimpleRVAdapter(strings));
        return rv;
    }

}
