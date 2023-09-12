package com.example.firstapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText input;
    Button button;
    String userName;
    ImageView img;
    RadioGroup radiogroup;
    RadioButton green;
    RadioButton red;
    RadioButton yellow;
    LinearLayout linear;
    ToggleButton toggle;
    Spinner spinner;
    ArrayAdapter adapter;
//    CheckBox permission;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.Result);
       button = findViewById(R.id.press);
       input = findViewById(R.id.name);
       img = findViewById(R.id.image1);
//       radiogroup = findViewById(R.id.rgroup);
//       green = findViewById(R.id.green);
//       red = findViewById(R.id.red);
//       yellow = findViewById(R.id.orange);
       linear = findViewById(R.id.layout);
//       toggle = findViewById(R.id.toggleButton);
       spinner = findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this,R.array.countries,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                String country = adapterView.getItemAtPosition(i).toString();
//                text.setText(country);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });


        button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            userName = input.getText().toString();
                            text.setText(userName);
                            img.setImageResource(R.drawable.roni);
                            showDialog();
//                            Toast Message
//                            Toast.makeText(getApplicationContext(),"Here is "+userName,Toast.LENGTH_LONG).show();
//                            Snack Bar Message
/*                            Snackbar.make(linear,"This is "+userName,Snackbar.LENGTH_INDEFINITE)
                                    .setAction("Close", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {

                                        }
                                    }).show(); */
                        }
                    });
//        linearLayout - findViewById(R.id.layout);
//        permission = findViewById(R.id.checkBox);
//        permission.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (permission.isChecked()) {
//                    button.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            userName = input.getText().toString();
////                            text.setText(userName);
//                            img.setImageResource(R.drawable.roni);
//
//                            if (green.isChecked())
//                            {
//                                linear.setBackgroundColor(Color.GREEN);
//                            }else if (red.isChecked())
//                            {
//                                linear.setBackgroundColor(Color.RED);
//                            }
//                            else if(yellow.isChecked())
//                            {
//                                linear.setBackgroundColor(Color.YELLOW);
//                            }
//                            else {
//                                linear.setBackgroundColor(Color.WHITE);
//                            }
//                        }
//                    });
//                }
//            }
//        });

//        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b)
//                {
////                    linear.setBackgroundColor(Color.WHITE);
//                    img.setVisibility(Button.INVISIBLE);
//
//                }else{
////                    linear.setBackgroundColor(Color.BLACK);
//                    img.setVisibility(Button.VISIBLE);
//
//                }
//            }
//        });

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                button.setTextColor(Color.GREEN);
//                text.setText("I Have Done My magic");
//                button.setBackgroundColor(Color.WHITE);
//                button.setText("Have You Seen Magic");
//            }
//        });
//        text.setTextColor(Color.BLACK);

//        text.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                text.setTextColor(Color.WHITE);
//                text.setBackgroundColor(Color.BLACK);
//            }
//        });
    }

    private void showDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Delete").setMessage("Are You Sure Want To delete the line?").setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                text.setText("");
            }
        }).show();
        alertDialog.create();
    }
}