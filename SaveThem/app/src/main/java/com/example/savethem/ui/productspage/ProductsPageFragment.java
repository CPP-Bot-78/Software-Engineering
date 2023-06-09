package com.example.savethem.ui.productspage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.savethem.databinding.ProductsPageBinding;

import java.util.zip.Inflater;

public class ProductsPageFragment extends Fragment
{
    private ProductsPageBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProductsPageViewModel productsPageViewModel =
                new ViewModelProvider(this).get(ProductsPageViewModel.class);

        Inflater FragmentProductsPageBinding;
        binding = ProductsPageBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}



