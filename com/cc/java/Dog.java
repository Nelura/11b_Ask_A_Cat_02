package com.cc.java;

public class Dog extends Pet {

	private String name;

	/**
	 * @param name
	 * 
	 */
	public Dog(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	// Frag irgendeine Katze --> Namen
	public String askACatItsName() {
		return Controller.getSomeRandomFelidae().getName(this);
	}

	@Override
	public String petSounds() {
		return name + ": Bark!";	
	}
	
	
	
}
