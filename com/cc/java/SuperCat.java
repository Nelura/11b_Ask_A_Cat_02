package com.cc.java;

public class SuperCat extends Pet{

	protected String name;
	
	public SuperCat(String name) {
		this.name = name;
	}

	// Frag irgendeine Katze --> Namen
	public String askACatItsName() {	
		return Controller.getSomeRandomFelidae().getName(this);
	}
	
	
	// Frag irgendeine Katze --> Alter
	// (Cat) felidae | (Tomcat) felidae :: Downcasting
	public String askACatHerAge() {
		SuperCat felidae = Controller.getSomeRandomFelidae();
		if (felidae instanceof Cat) {
			return (((Cat) felidae).tellYourAge(this));	
		} else {
			return (((Tomcat) felidae).tellYourAge(this));
		}
	}
	
	// Frag irgendeine Katze --> Name
	// (Dog) pet | (SuperCat) pet :: Downcasting
	public String getName(Pet pet) {
		if (pet instanceof Dog) 
		{	
			return "Sorry " + ((Dog) pet).getName() + ", you're not a cat!";
		}
		else {
			if (((SuperCat) pet).name != this.name) {
				return "O.K. " + ((SuperCat) pet).name + ", my name is: " + name + "."; 
			} else {
				return "Yes, sometimes you don't know who you are, " + ((SuperCat) pet).name + ".";
			}
		}
	}
	
	@Override
	public String petSounds() {
		return name + ": Meeeoow!";	
	}

}
