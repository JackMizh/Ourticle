package com.example.ourticle.fragments;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.ourticle.DashboardActivity;
import com.example.ourticle.R;

public class DashboardFragment extends Fragment {

    private boolean isClick = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        ImageView ivBookmark =  root.findViewById(R.id.ivBookmark);
        ImageView ivBookmark2 =  root.findViewById(R.id.ivBookmark2);
        ImageView ivBookmark3 =  root.findViewById(R.id.ivBookmark3);

        ivBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isClick){
                    ivBookmark.setImageDrawable(ContextCompat.getDrawable(root.getContext(), R.drawable.ic_bookmark));
                    Toast.makeText(root.getContext(), "Article Saved", Toast.LENGTH_LONG).show();
                    isClick = false;
                } else{
                    ivBookmark.setImageDrawable(ContextCompat.getDrawable(root.getContext(), R.drawable.ic_baseline_bookmark_border_24));
                    isClick = true;
                }

            }
        });

        ivBookmark2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isClick){
                    ivBookmark2.setImageDrawable(ContextCompat.getDrawable(root.getContext(), R.drawable.ic_bookmark));
                    Toast.makeText(root.getContext(), "Article Saved", Toast.LENGTH_LONG).show();
                    isClick = false;
                } else{
                    ivBookmark2.setImageDrawable(ContextCompat.getDrawable(root.getContext(), R.drawable.ic_baseline_bookmark_border_24));
                    isClick = true;
                }

            }
        });

        ivBookmark3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isClick){
                    ivBookmark3.setImageDrawable(ContextCompat.getDrawable(root.getContext(), R.drawable.ic_bookmark));
                    Toast.makeText(root.getContext(), "Article Saved", Toast.LENGTH_LONG).show();
                    isClick = false;
                } else{
                    ivBookmark3.setImageDrawable(ContextCompat.getDrawable(root.getContext(), R.drawable.ic_baseline_bookmark_border_24));
                    isClick = true;
                }

            }
        });

        return root;

    }
}