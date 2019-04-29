package com.example.lford.triptracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.backendless.Backendless;

public class LoginActivity extends AppCompatActivity {

    EditText mEmailEditText;
    EditText mPasswordEditText;
    EditText mNameEditText;
    Button mLoginButton;
    TextView mSignUpTextView;
    Button mSignUpButton;

    Backendless.initApp( this,
    getString(R.string.APP_Id),
    getString(R.string.API_KEY));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEmailEditText = (EditText) findViewById(R.id.enter_email);
        mPasswordEditText = (EditText) findViewById(R.id.enter_password);
        mNameEditText = (EditText) findViewById(R.id.enter_name);
        mLoginButton = (Button) findViewById(R.id.login_button);
        mSignUpTextView = (TextView) findViewById(R.id.signup_text);
        mSignUpButton = (Button) findViewById(R.id.signup_button);

        mSignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mSignUpTextView.getText() == getString(R.string.signup_text)) {
                    mNameEditText.setVisibility(View.VISIBLE);
                    mSignUpButton.setVisibility(View.VISIBLE);
                    mLoginButton.setVisibility(View.GONE);
                    mSignUpTextView.setText("Cancel Sign Up");
                }
                else{
                    mNameEditText.setVisibility(View.GONE);
                    mSignUpButton.setVisibility(View.GONE);
                    mLoginButton.setVisibility(View.VISIBLE);
                    mSignUpTextView.setText(R.string.signup_text);
                }
            }
        }

    }


}

