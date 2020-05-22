package com.gmail.justinxvopro.MyFirstGradleProject;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class TestLib1 {
	private Lib lib = new Lib(1);
	@Test
	public void testLibConstructor() {
		assertTrue(lib.getFlag() == 1);
	}
	@Test
	public void testLibSort() {
		int[] arr = {3, 2, 6, 1, 0};
		
		assertEquals(lib.min(arr), 0);
	}
	@Test
	public void testUrl1() throws MalformedURLException {
		assertTrue(lib.isOk(new URL("https://google.com")));
	}
	@Test
	public void testUrl2() throws MalformedURLException {
		assertTrue(!lib.isOk(new URL("https://https://httpstat.us/404")));
	}
}
