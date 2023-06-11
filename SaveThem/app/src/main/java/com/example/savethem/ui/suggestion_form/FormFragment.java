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
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.savethem.R;
import com.example.savethem.databinding.FragmentQrBinding;
import com.example.savethem.databinding.FragmentSuggestionFormBinding;
import com.example.savethem.loggedInUser;
import com.example.savethem.suggestion;

public class FormFragment extends Fragment {

    private FragmentSuggestionFormBinding binding;
    private int id=0; //suggestionId
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    loggedInUser currentUser = new loggedInUser(001,"Kurios", "Kapoios", "Perioxi", "kurioskapoios@gmail.com","Alles pithanes plirofories");



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_suggestion_form, container, false);

        binding = FragmentSuggestionFormBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        //button for suggestion form
        Button buttonApplySuggestion = rootView.findViewById(R.id.buttonApplySuggestion);
        buttonApplySuggestion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                editText1 = rootView.findViewById(R.id.InsertSpeciesName);
                editText2 = rootView.findViewById(R.id.suggestionLocation);
                editText3 = rootView.findViewById(R.id.SuggestionInfo);
                editText4 = rootView.findViewById(R.id.suggestionAnimalType);
                String inputName = editText1.getText().toString();
                String inputLocation = editText2.getText().toString();
                String inputInfo = editText3.getText().toString();
                String inputType = editText4.getText().toString();
                suggestion NewSug =new suggestion(id, currentUser, inputName, inputInfo, inputLocation, inputType);
                id++;
            }
        });



        return rootView;
    }


        @Override
    public void onDestroyView() {
        super.onDestroyView();
         binding= null;
    }
}

