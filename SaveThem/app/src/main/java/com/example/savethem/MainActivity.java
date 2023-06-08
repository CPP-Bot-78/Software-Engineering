package com.example.savethem;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;


import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;


import com.example.savethem.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int id=0; //suggestionId
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Settings don't work rn... You have greetings from SaveThem Developers though!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_encyclopedia, R.id.nav_eshop,R.id.nav_mkolist,R.id.nav_eshop,R.id.nav_suggestion,R.id.nav_qr)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        //theodore
        Button buttonApplySuggestion = findViewById(R.id.buttonApplySuggestion);
        buttonApplySuggestion.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            setContentView(R.layout.fragment_suggestion_form);
            EditText editText1 = findViewById(R.id.InsertSpeciesName);
            EditText editText2 = findViewById(R.id.suggestionLocation);
            EditText editText3 = findViewById(R.id.SuggestionInfo);
            EditText editText4 = findViewById(R.id.suggestionAnimalType);
            String inputName = editText1.getText().toString();
            String inputLocation = editText2.getText().toString();
            String inputInfo = editText3.getText().toString();
            String inputType = editText4.getText().toString();
            //suggestion(id, loggedInUser.getUserId(), inputName, inputInfo, inputLocation, inputType);
            id++;
        }
    });


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


}