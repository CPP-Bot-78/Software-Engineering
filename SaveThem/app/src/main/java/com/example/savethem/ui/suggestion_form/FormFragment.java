package com.example.savethem.ui.suggestion_form;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.savethem.databinding.FragmentSuggestionFormBinding;

public class FormFragment extends Fragment {

    private FragmentSuggestionFormBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FormViewModel homeViewModel =
                new ViewModelProvider(this).get(FormViewModel.class);

        binding = FragmentSuggestionFormBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        /*final TextView textView = binding.text;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);*/
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}