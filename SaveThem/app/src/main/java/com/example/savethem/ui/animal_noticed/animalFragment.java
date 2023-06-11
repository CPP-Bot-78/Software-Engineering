package com.example.savethem.ui.animal_noticed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.savethem.databinding.ReportAnimalFoundBinding;
import com.example.savethem.ui.animal_noticed.animalViewModel;

public class animalFragment extends Fragment {

    private ReportAnimalFoundBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        animalViewModel homeViewModel =
                new ViewModelProvider(this).get(animalViewModel.class);

        binding = ReportAnimalFoundBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}