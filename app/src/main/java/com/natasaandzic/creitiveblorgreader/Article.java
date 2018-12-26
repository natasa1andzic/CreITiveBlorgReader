package com.natasaandzic.creitiveblorgreader;

public class Article {

	private int imgId=NO_IMAGE;

	private static final int NO_IMAGE=-1;

	private String articleName;

	private String articleDescription;

	public Article(int imgId, String articleName, String articleDescription) {
		this.imgId=imgId;
		this.articleName=articleName;
		this.articleDescription=articleDescription;
	}

	public boolean hasImage() {
		return imgId!= NO_IMAGE;
	}

	public int getImgId() {
		return imgId;
	}

	public void setImgId(int imgId) {
		this.imgId = imgId;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleDescription() {
		return articleDescription;
	}

	public void setArticleDescription(String articleDescription) {
		this.articleDescription = articleDescription;
	}
}
