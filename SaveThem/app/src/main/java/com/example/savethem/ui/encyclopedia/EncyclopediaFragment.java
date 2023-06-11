package com.example.savethem.ui.encyclopedia;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.savethem.R;
import com.example.savethem.databinding.FragmentEncyclopediaBinding;
public class EncyclopediaFragment extends Fragment {

    private FragmentEncyclopediaBinding binding;
    private PopupWindow popupWindow;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EncyclopediaViewModel homeViewModel =
                new ViewModelProvider(this).get(EncyclopediaViewModel.class);

        binding = FragmentEncyclopediaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        View rootView = inflater.inflate(R.layout.fragment_encyclopedia, container, false);

        Button button = rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the pop-up window
                popupWindow.showAtLocation(rootView, Gravity.CENTER, 0, 0);
            }
        });
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}