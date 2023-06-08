package com.example.savethem.ui.eshop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.savethem.R;
import com.example.savethem.databinding.FragmentEshopBinding;
import com.example.savethem.product;
import com.example.savethem.eshop;
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
        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    ///*
        int[] wishlist = new int[20];
        int[] productId = new int[20];

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        product whiteMug = new product(1,100,2,"WFF","Mug","WFF","Protect the Oceans");
        product whiteShirt = new product(2,100,10,"Arcturos","TShirt","Arcturos","Adopt an Animal");
        eshop Eshop = new eshop(productId,wishlist);
        Eshop.setProductId(1); //productId[0]=1, whiteMug
        Eshop.setProductId(2); //productId[1]=2, whiteShirt
    }

     //*/
    /*
    private Object findViewById;
    Button btnApply = findViewById(R.layout.fragment_eshop);

     //*/
    public void all_filter()
    {

    }
    public void mug_filter()
    {

    }
    public void tshirt_filter()
    {

    }
    public void showFilteredShop()
    {

    }
}

