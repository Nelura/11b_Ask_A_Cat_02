package com.cc.java;

public class Tomcat extends SuperCat
{
	private String ageStr;
	
	public Tomcat(String name, String ageStr) {
		super(name);
		this.ageStr = ageStr; 
	}

	 public String tellYourAge(SuperCat felidae) { 
		if (felidae.name != this.name) {
			return this.name + " says to " + felidae.name + ": My age is " + this.ageStr + ".";
		} else {
			return "Yes, sometimes you don't know how old you are, " + this.name + ", you are " + this.ageStr +".";
		}
	}		
	
}
