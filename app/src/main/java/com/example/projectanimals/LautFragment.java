package com.example.projectanimals;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LautFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LautFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LautFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LautFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LautFragment newInstance(String param1, String param2) {
        LautFragment fragment = new LautFragment();
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
        View view = inflater.inflate(R.layout.fragment_laut, container, false);
        Button kepitingbutton = view.findViewById(R.id.kepitingbutton);
        Button nemobutton = view.findViewById(R.id.nemobutton);
        Button kurabutton = view.findViewById(R.id.kurabutton);
        Button pausbutton = view.findViewById(R.id.pausbutton);
        Button hiubutton = view.findViewById(R.id.hiubutton);

        kepitingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kepitingbutton(v);
            }
        });

        nemobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nemobutton(v);
            }
        });

        kurabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kurabutton(v);
            }
        });

        pausbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausbutton(v);
            }
        });

        hiubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hiubutton(v);
            }
        });

        return view;
    }
    public void kepitingbutton(View view) {
        Intent intent = new Intent(getContext(), KepitingActivity.class);
        startActivity(intent);
    }
    public void nemobutton(View view) {
        Intent intent = new Intent(getContext(), NemoActivity.class);
        startActivity(intent);
    }
    public void kurabutton(View view) {
        Intent intent = new Intent(getContext(),kuraActivity.class);
        startActivity(intent);
    }
    public void pausbutton(View view) {
        Intent intent = new Intent(getContext(), PausActivity.class);
        startActivity(intent);
    }
    public void hiubutton(View view) {
        Intent intent = new Intent(getContext(), HiuActivity.class);
        startActivity(intent);
    }
}