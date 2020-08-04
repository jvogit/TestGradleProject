package com.gmail.justinxvopro.MyFirstGradleProject;

import java.io.IOException;
import java.net.URL;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Lib {
	private final int FLAG;
	private final OkHttpClient client;
	
	public Lib(int flag) {
		this.FLAG = flag;
		this.client = new OkHttpClient();
	}
	
	/**
	 * Getter for FLAG field
	 * 
	 * @return FLAG field
	 */
	public int getFlag() {
		return FLAG;
	}
	
	/**
	 * min function
	 * 
	 * @param to - Nonempty
	 * @return lowest value in array
	 */
	public int min(int[] to) {
		int min = to[0];
		for (int i = 1; i < to.length; ++i) {
			if (to[i] < min) min = to[i];
		}
		
		return min;
	}
	
	/**
	 * check to see
	 * 
	 * @param url
	 * @return
	 */
	public boolean isOk(URL url) {
		Request req = new Request.Builder().url(url).build();
		
		try (Response response = this.client.newCall(req).execute()) {
			return response.isSuccessful();
		} catch (IOException e) {}
		
		return false;
	}
	
	public boolean isTrue() {
		return true;
	}
	
}
