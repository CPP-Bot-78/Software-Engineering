package com.example.savethem.ui.suggestion_form;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.savethem.MainActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.savethem.R;
import com.example.savethem.databinding.FragmentSuggestionFormBinding;
import com.example.savethem.loggedInUser;
import com.example.savethem.suggestion;

public class FormFragment extends Fragment {

    private FragmentSuggestionFormBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FormViewModel homeViewModel =
                new ViewModelProvider(this).get(FormViewModel.class);

        binding = FragmentSuggestionFormBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
//button for suggestion form
        /*
        setContentView(R.layout.fragment_suggestion_form);
        Button buttonApplySuggestion = findViewById(R.id.buttonApplySuggestion);
        buttonApplySuggestion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText editText1 = findViewById(R.id.InsertSpeciesName);
                EditText editText2 = findViewById(R.id.suggestionLocation);
                EditText editText3 = findViewById(R.id.SuggestionInfo);
                EditText editText4 = findViewById(R.id.suggestionAnimalType);
                String inputName = editText1.getText().toString();
                String inputLocation = editText2.getText().toString();
                String inputInfo = editText3.getText().toString();
                String inputType = editText4.getText().toString();
                suggestion NewSug =new suggestion(id, currentUser, inputName, inputInfo, inputLocation, inputType);
                id++;
            }
        });
 */


        return root;
    }



        @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

