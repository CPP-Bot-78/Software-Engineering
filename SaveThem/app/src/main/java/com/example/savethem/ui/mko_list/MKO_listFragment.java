package com.example.savethem.ui.mko_list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.savethem.databinding.FragmentMkoListBinding;

public class MKO_listFragment extends Fragment {

    private FragmentMkoListBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MKO_listViewModel homeViewModel =
                new ViewModelProvider(this).get(MKO_listViewModel.class);

        binding = FragmentMkoListBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMkoList;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}