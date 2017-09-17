package com.ashwindora.j8.basics.createinglambda;


public class CreatingLambdas {
	
	interface Greeting{
		public String sayHello(String g);
	}
	
	public void testGreeting(String s, Greeting g) {
		String result = g.sayHello(s);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		//lambdaExpressing
		//input -> body
		
		//(String s) -> "Hello, "+s;
		
		new CreatingLambdas().testGreeting("Ashwin", (String s) -> "Hello, "+s);
		
		new CreatingLambdas().testGreeting("",  (String p) -> p.isEmpty()?"Did you miss something?": "Hey , "+p);
		
		
	}
	
	

}
