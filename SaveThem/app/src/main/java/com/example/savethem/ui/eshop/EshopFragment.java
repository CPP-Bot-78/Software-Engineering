package com.example.savethem.ui.eshop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.savethem.databinding.FragmentEshopBinding;
import com.example.savethem.ui.eshop.ProductsPageViewModel;

public class EshopFragment extends Fragment
{
    private FragmentEshopBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProductsPageViewModel productsPageViewModel =
                new ViewModelProvider(this).get(ProductsPageViewModel.class);

        binding = FragmentEshopBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textEshop;
        productsPageViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

