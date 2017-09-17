package com.ashwindora.j8.basics.targettype;

public class TargetType {
	
	interface Email{
		public String getEmailId(String name);
	}
	
	public String getAssociateEmailId(String name, Email email){
		
		return email.getEmailId(name);
	}
	
	public static void main(String[] args) {
		System.out.println(new TargetType().getAssociateEmailId("Ashwin", (String name) -> name+"@testemail.com"));
	}

}
