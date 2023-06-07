package com.example.savethem.ui.encyclopedia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.savethem.databinding.FragmentEncyclopediaBinding;
public class EncyclopediaFragment extends Fragment {

    private FragmentEncyclopediaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EncyclopediaViewModel homeViewModel =
                new ViewModelProvider(this).get(EncyclopediaViewModel.class);

        binding = FragmentEncyclopediaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textEncyclopedia;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}