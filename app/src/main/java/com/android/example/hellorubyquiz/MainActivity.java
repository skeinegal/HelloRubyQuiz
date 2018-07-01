package com.android.example.hellorubyquiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/** This app quizzes the user on computational thinking knowledge after covering the Hello Ruby ,
 * Adventures in coding illustrated book for children.
 */
public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //When submit button is clicked
    public void submit( View view ) {
        EditText nameField = (EditText) findViewById(R.id.name_edit_text);
        String name = nameField.getText().toString();

        // broadcast the total score to the user.
        Toast.makeText(this, "You scored" + score , Toast.LENGTH_LONG).show();
    }


    public void RadioButtonClicked( View view ) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.answerC:
                score += 1;
        }
    }

    public void CheckBoxClicked( View view ) {

        //Figure out if checkbox Infinite Loops is checked?
        CheckBox InfiniteLoops = (CheckBox) findViewById(R.id.infiniteLoops);
        boolean foreverLoops;
        if (InfiniteLoops.isChecked()) foreverLoops = true;
        else foreverLoops = false;

        //Figure out if checkbox Counter Loops is checked?
        CheckBox CounterLoops = (CheckBox) findViewById(R.id.counterLoops);
        boolean repeatLoops = CounterLoops.isChecked();

        //Figure out if checkbox While Loops is checked?
        CheckBox WhileLoops = (CheckBox) findViewById(R.id.whileLoops);
        boolean doWhileLoops = WhileLoops.isChecked();

        // If all checkboxes are checked add score by 0ne
        score += 1;

    }

//    public void editTextClicked( View view ) {
//        int answer;
//        answer = (EditText) findViewById(R.id.edit_text_view);
//
//
//    }

    /**Question about booleans on a spinner answer*/
  public Spinner getSpinner() {

       Spinner spinner = (Spinner) findViewById(R.id.spinner_answer);

        //Creates an Array adapter using the string array and the default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.true_bool,
               R.layout.support_simple_spinner_dropdown_item);

        //specifying the layout to use
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        return spinner;
    }

}




