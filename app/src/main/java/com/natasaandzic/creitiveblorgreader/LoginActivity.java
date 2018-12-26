package com.natasaandzic.creitiveblorgreader;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


	private EditText emailEt;
	private EditText passwordEt;
	private Button loginBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		emailEt = findViewById(R.id.emailEt);
		passwordEt = findViewById(R.id.passwordEt);
		loginBtn = findViewById(R.id.loginBtn);

		loginBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				String email = emailEt.getText().toString().trim();
				String password = passwordEt.getText().toString().trim();

				if (email.equals("candidate@creitive.com") && password.equals("1234567")) {
					Intent i = new Intent(LoginActivity.this, MainActivity.class);
					startActivity(i);
				}
				else {
					final AlertDialog.Builder builder;
						builder = new AlertDialog.Builder(LoginActivity.this);
					builder.setTitle("Login")
							.setMessage("You entered invalid data (email/password), try again")
							.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int which) {

								}
							})
							.show();
				}
			}
		});
	}
}
