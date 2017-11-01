package com.negier.coverbaidulangbottom.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.negier.coverbaidulangbottom.R;

/**
 * Created by NEGIER on 2017/11/1.
 */

public class VocabFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vocab, container, false);
        return view;
    }
}
