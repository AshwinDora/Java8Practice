package com.ashwindora.j8.basics.methodreferences;

public class ConstructorReferences {
	
	class Movie{
		int id;
		String name;
		public Movie(int id) {
			this.id = id;
		}
		public Movie(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}
	
	interface MovieFactory1{
		public Movie getMovie(int x);
	}
	
	interface MovieFactory2{
		public Movie getMovie(int x, String y);
	}
	
	MovieFactory1 movie = i -> new Movie(i);
	MovieFactory1 movie1 = Movie::new;
	MovieFactory2 movie2 = Movie::new;
	
	public static void main(String[] args) {
		
		
	}

}
