package com.natasaandzic.creitiveblorgreader;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ArticleAdapter extends ArrayAdapter<Article> {

	private Context context;
	private List<Article> articles;


	public ArticleAdapter(Context context, List<Article> articles) {
		super(context, R.layout.list_item, articles);
		this.context=context;
		this.articles=articles;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// Check if an existing view is being reused, otherwise inflate the view
		View listItemView = convertView;
		if (listItemView == null) {
			listItemView = LayoutInflater.from(getContext()).inflate(
					R.layout.list_item, parent, false);
		}

		// Get the {@link Word} object located at this position in the list
		Article currentArticle = getItem(position);

		ImageView imgId = (ImageView) listItemView.findViewById(R.id.articleImgTv);
		String photoUri = currentArticle.getImage_url();
		imgId.setVisibility(View.VISIBLE);

		//upisivanje podataka u layout
		Picasso.with(getContext())
				.load(photoUri)
				.placeholder(android.R.drawable.sym_def_app_icon)
				.error(android.R.drawable.sym_def_app_icon)
				.into(imgId);


		TextView title = (TextView) listItemView.findViewById(R.id.articleNameTv);
		title.setText(currentArticle.getTitle());

		TextView description = (TextView) listItemView.findViewById(R.id.articleDescTv);
		description.setText(currentArticle.getDescription());

		return listItemView;
	}
}
