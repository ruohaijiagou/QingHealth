package com.qingyunxuetang.qinghealth.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qingyunxuetang.qinghealth.R;

/**
 * Created by zhouwei on 17/3/20.
 */

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, null);
        return rootView;
    }

    public static HomeFragment newInstance(String from){
        HomeFragment homeFragment = new HomeFragment();
        return homeFragment;
    }
}
