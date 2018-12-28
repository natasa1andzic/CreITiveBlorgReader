package com.natasaandzic.creitiveblorgreader;

public class Article {

	private String title;
	private String image_url;
	private String description;

	public Article(String title, String image_url, String description) {
		this.title = title;
		this.image_url = image_url;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
