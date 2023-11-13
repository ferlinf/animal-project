package com.example.projectanimals;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.widget.Button;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DaratFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DaratFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DaratFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DaratFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DaratFragment newInstance(String param1, String param2) {
        DaratFragment fragment = new DaratFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_darat, container, false);
        Button badak = view.findViewById(R.id.badak);
        Button jerapah = view.findViewById(R.id.jerapah);
        Button rawr = view.findViewById(R.id.rawr);
        Button koala = view.findViewById(R.id.koala);
        Button monyet = view.findViewById(R.id.monyet);

        badak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                badak(v);
            }
        });

        jerapah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jerapah(v);
            }
        });

        rawr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rawr(v);
            }
        });

        koala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                koala(v);
            }
        });

        monyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monyet(v);
            }
        });

        return view;
    }
    public void badak(View view) {
        Intent intent = new Intent(getContext(), BadakActivity.class);
        startActivity(intent);
    }
    public void jerapah(View view) {
        Intent intent = new Intent(getContext(), JerapahActivity.class);
        startActivity(intent);
    }
    public void rawr(View view) {
        Intent intent = new Intent(getContext(), RawrActivity.class);
        startActivity(intent);
    }
    public void koala(View view) {
        Intent intent = new Intent(getContext(), KoalaActivity.class);
        startActivity(intent);
    }
    public void monyet(View view) {
        Intent intent = new Intent(getContext(), MonyetActivity.class);
        startActivity(intent);
    }
}