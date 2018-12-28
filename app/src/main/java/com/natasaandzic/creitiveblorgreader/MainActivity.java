package com.natasaandzic.creitiveblorgreader;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

	private final String ENDPOINT="http://blogsdemo.creitiveapps.com";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.article_list);

		final ListView listView = (ListView) findViewById(R.id.list);

		Retrofit.Builder builder = new Retrofit.Builder()
				.baseUrl(ENDPOINT)
				.addConverterFactory(GsonConverterFactory.create());

		Retrofit retrofit = builder.build();
		BlogClient client = retrofit.create(BlogClient.class);
		Call<List<Article>> call = client.articleList();

		call.enqueue(new Callback<List<Article>>() {
			@Override
			public void onResponse(Call<List<Article>> call, Response<List<Article>> response) {
				List<Article> articles = response.body();
				listView.setAdapter(new ArticleAdapter(MainActivity.this, articles));

			}

			@Override
			public void onFailure(Call<List<Article>> call, Throwable t) {
				Toast.makeText(MainActivity.this, "No internet connection", Toast.LENGTH_SHORT).show();
			}
		});

	}
}
