package com.natasaandzic.creitiveblorgreader;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface BlogClient {

	@GET("/blogs")
	Call<List<Article>> articleList();

	@GET("/login")
	Call<User> loginClient(@Header("Authorization") String authHeader);
}
