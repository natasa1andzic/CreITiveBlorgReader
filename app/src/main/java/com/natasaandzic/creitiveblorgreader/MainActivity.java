package com.natasaandzic.creitiveblorgreader;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	private final String ENDPOINT="http://blogsdemo.creitiveapps.com/login";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.article_list);

		final ArrayList<Article> articles = new ArrayList<Article>();

		ArticleAdapter adapter = new ArticleAdapter(this, articles);

		ListView listView = (ListView) findViewById(R.id.list);

		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				Article word = articles.get(position);
	}



});
	}
}
