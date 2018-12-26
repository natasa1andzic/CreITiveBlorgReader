package com.natasaandzic.creitiveblorgreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ArticleActivity extends AppCompatActivity {

	private TextView articleNameTv;
	private ImageView articleImgIv;
	private TextView articleDescTv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_article);

		articleNameTv= findViewById(R.id.articleNameTv);
		articleImgIv = findViewById(R.id.articleImgTv);
		articleDescTv = findViewById(R.id.articleDescTv);
	}
}
