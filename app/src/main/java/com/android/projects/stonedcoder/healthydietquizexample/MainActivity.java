package com.android.projects.stonedcoder.healthydietquizexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    // Your global variables must be defined here Just below the Class name which is in this case is MainActivity !
    double waterAmountPerKg = 0.3;



    EditText nameField , weightInput ;
    Button calculate , submitButton ;

    //RadioGroup and RadioButtons for Question 1 .
    RadioButton radioYes ,  radioNo;


    //CheckBoxes for Question 2 .
     CheckBox vegitables , fruits , fastfood , bread , milk , meat , fish ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Finding all the elements : radioButtons , CheckBoxes , EditText field . That should be
        // done here , as this onCreate() method is called when your activity started ,
        // (As we saw that in activity lifecycle example ).
        //All the views must be found here so that it can display as soon as activity starts .

        nameField = (EditText) findViewById(R.id.name);
        weightInput = (EditText) findViewById(R.id.weightInput);
        calculate = (Button)findViewById(R.id.calculate);
        radioYes = (RadioButton)findViewById(R.id.radio_yes);
        radioNo = (RadioButton)findViewById(R.id.radio_no);
        vegitables = (CheckBox)findViewById(R.id.vegetables);
        fruits = (CheckBox)findViewById(R.id.fruits);
        fastfood = (CheckBox)findViewById(R.id.ff);
        bread = (CheckBox)findViewById(R.id.bread);
        milk = (CheckBox)findViewById(R.id.milk);
        meat = (CheckBox)findViewById(R.id.meat);
        fish = (CheckBox)findViewById(R.id.fish);
        submitButton = (Button)findViewById(R.id.submitButton);




    }

    // Here you'll create methods


    // We're setting an onclick listener in calculate button which will calculate the wateramount .
    public void calculate(){

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueOfName = nameField.getText().toString();
                String valueOfWeight = weightInput.getText().toString();

                double waterAmount = waterAmountPerKg * Double.parseDouble(valueOfWeight) ;

                //Here you'll be needing a textView which can display the result .
                //Create a textview in xml and upadte that here !

            }
        });

    }

    public void questionOne(){

        // Here you'll be handeling the click events on the respective radio buttons .
        boolean yes = radioYes.isChecked();
        boolean no = radioNo.isChecked();

        //Here youll be putting the condition statements which detects which box is checked and
        //you'll update the score variable here .
    }

    public void questionTwo(){

        boolean vegitableIsChecked = vegitables.isChecked();
        boolean fruitsIsChecked = fruits.isChecked();
        boolean fastfoodIsChecked = fastfood.isChecked();
        boolean breadIsChecked = bread.isChecked();
        boolean milkIsChecked = milk.isChecked();
        boolean meatIsChecked = meat.isChecked();
        boolean fishIsChecked = fish.isChecked();

        //Here youll be putting the condition statements which detects which box is checked and
        //you'll update the score variable here .

    }


    public void submit(View view) {

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //here you'll declare all the method names which you want to get executed when the user hits submit button

                questionOne();
                questionTwo();

                //Youll be needing another Text view which display the score after hitting button submit .
                // and set the value of score to that textview , and lastly reset the score .


            }
        });

    }

}
