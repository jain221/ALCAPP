package com.alulight.alcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class colume_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colume_list);


        Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);


        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

/*
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);


        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        Spinner spinner = (Spinner) findViewById(R.id.spinner3);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);


        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        Spinner spinner = (Spinner) findViewById(R.id.spinner4);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);


        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        Spinner spinner = (Spinner) findViewById(R.id.spinner5);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);


        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        Spinner spinner = (Spinner) findViewById(R.id.spinner6);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);


        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        Spinner spinner = (Spinner) findViewById(R.id.spinner7);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);


        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        Spinner spinner = (Spinner) findViewById(R.id.spinner8);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);


        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        Spinner spinner = (Spinner) findViewById(R.id.spinner9);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);


        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        Spinner spinner = (Spinner) findViewById(R.id.spinner10);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);


        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

*/

    }
}
