package com.natasaandzic.creitiveblorgreader;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArticleAdapter extends ArrayAdapter<Article> {


	public ArticleAdapter(Context context, ArrayList<Article> articles) {
		super(context, 0, articles);
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
		if(currentArticle.hasImage()) {
			imgId.setImageResource(currentArticle.getImgId());
			imgId.setVisibility(View.VISIBLE);
		}
		else imgId.setVisibility(View.GONE);

		TextView articleNameTv = (TextView) listItemView.findViewById(R.id.articleNameTv);
		articleNameTv.setText(currentArticle.getArticleName());

		TextView articleDescTv = (TextView) listItemView.findViewById(R.id.articleDescTv);
		articleDescTv.setText(currentArticle.getArticleDescription());

		return listItemView;
	}
}
