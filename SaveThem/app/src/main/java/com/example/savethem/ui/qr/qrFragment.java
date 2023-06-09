package com.example.savethem.ui.qr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.savethem.databinding.FragmentQrBinding;

public class qrFragment extends Fragment {

    private FragmentQrBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        qrViewModel homeViewModel =
                new ViewModelProvider(this).get(qrViewModel.class);

        binding = FragmentQrBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }
    /*
    Button button = (Button) findViewById(R.id.supabutton);
    button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Log.d("BUTTONS", "User tapped the Supabutton");
        }
    });
    */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}