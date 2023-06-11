package com.example.savethem.ui.eshop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.savethem.R;
import com.example.savethem.databinding.FragmentEshopBinding;
import com.example.savethem.product;
import com.example.savethem.eshop;
import com.example.savethem.ui.productspage.ProductsPageViewModel;

public class EshopFragment extends Fragment
{
    private FragmentEshopBinding binding;
    private String selected = "all";
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EshopViewModel eshopViewModel =
                new ViewModelProvider(this).get(EshopViewModel.class);

        binding = FragmentEshopBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public void showFilteredShop()
    {
        int[] wishlist = new int[20];
        int[] productId = new int[20];
        product whiteMug = new product("white Mug", 1, 100, 2, "WFF", "Mug", "WFF", "Protect the Oceans", R.drawable.mug);
        product whiteShirt = new product("white T-Shirt", 2, 100, 10, "Arcturos", "TShirt", "Arcturos", "Adopt an Animal", R.drawable.tshirt);
        eshop Eshop = new eshop(productId,wishlist);
        Eshop.setProductId(1); //productId[0]=1, whiteMug
        Eshop.setProductId(2); //productId[1]=2, whiteShirt
        Eshop.setProductId(2); //productId[1]=2, whiteShirt
    }
    public void buyProduct(View view)
    {
        System.out.println("I worked");
    }
    public void addToWishlist(View view)
    {
        System.out.println("I worked");
    }

    public void all_filter(View view)
    {
        System.out.println("I worked");
    }

    public void tshirt_filter(View view)
    {
        System.out.println("I worked");
    }

    public void mug_filter(View view)
    {
        System.out.println("I worked");
    }
}

