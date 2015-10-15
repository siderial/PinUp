package com.ooad.ce.pinup;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mSigninButtonDialog;
    private Button mSignupButtonDialog;
    private Button nextButton;
    private EditText inputNLoop;
    private int nLoop;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSigninButtonDialog = (Button) findViewById(R.id.signin);
        mSignupButtonDialog = (Button) findViewById(R.id.signup);
        nextButton = (Button) findViewById(R.id.next);

        inputNLoop =(EditText)findViewById(R.id.editText);




        mSigninButtonDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();



                View view = inflater.inflate(R.layout.sign_in_dialog, null);
                builder.setView(view);

                final EditText username = (EditText) view.findViewById(R.id.username);
                final EditText password = (EditText) view.findViewById(R.id.password);

                builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Check username password
                        if (username.getText().equals("demo@example.com") &&
                                password.getText().equals("demo")) {
                            Toast.makeText(getApplicationContext(), "Sign in success!",
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Sign in Failed!",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.create();

                builder.show();
            }
        });

        mSignupButtonDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();

                View view = inflater.inflate(R.layout.sign_up_dialog, null);
                builder.setView(view);

                final EditText username = (EditText) view.findViewById(R.id.username);
                final EditText password = (EditText) view.findViewById(R.id.password);

                builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Check username password
                        if (username.getText().equals("demo@example.com") &&
                                password.getText().equals("demo")) {
                            Toast.makeText(getApplicationContext(), "Sign up success!",
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Sign up Failed!",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.create();

                builder.show();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
               Intent myIntent = new Intent(view.getContext(), NewsFeedActivity.class);
                ///parse data to another activity

                myIntent.putExtra("loop",inputNLoop.getText().toString());

                startActivityForResult(myIntent, 0);
            }
        });
    }
}
