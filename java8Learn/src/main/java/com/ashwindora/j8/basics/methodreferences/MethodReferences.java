package com.ashwindora.j8.basics.methodreferences;

interface IMovie{
	public boolean check(int id);
}

public class MethodReferences {
	
	public void testMovieStaticMethodRef() {
		IMovie imovie  = id -> id < 100?false:true;
		IMovie imovie2  = MethodReferences::isGreatMovie;
		System.out.println(imovie2.check(100));
		
		MethodReferences ref = new MethodReferences();
		IMovie imovie3  = ref::isWorseMovie;
	}
	
	public static boolean isGreatMovie(int id) {
		return false;
	}
	
	public boolean isWorseMovie(int x) {
		return true;
	}
	
	public static void main(String[] args) {
		new MethodReferences().testMovieStaticMethodRef();
		
	}

}
