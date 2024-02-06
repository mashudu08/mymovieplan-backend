package com;

import java.util.ArrayList;
import java.util.List;

import com.model.Movie;

public class CheckoutBag {

	public static List<Movie> cart;
	
	static{
		cart = new ArrayList<Movie>();
	}
}
