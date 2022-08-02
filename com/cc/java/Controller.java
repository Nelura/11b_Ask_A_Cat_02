/**
 *  Controller als statische Klasse m. statischen Methoden
 *  d.h. es wird KEINE Instanz gebildet
 */

package com.cc.java;

import java.util.ArrayList;
import java.util.Random;

public class Controller {

	// Deklaration Dogs
	private static ArrayList<Dog> dogsList = new ArrayList<Dog>();
	// Deklaration Cats / Tomcats
	private static ArrayList<SuperCat> catsList = new ArrayList<SuperCat>();
	// Random number
	private static Random random = new Random();
	
	// Dog --> dogsList
	public static void addNewDog(String name){
		dogsList.add(new Dog(name));
	}
	
	// Cat --> catsList / ((SuperCat) new Cat(..)) UpCasting
	public static void addNewCat(String [] arr){
		catsList.add((SuperCat) new Cat(arr[0],arr[1]));
	}
	
	// Tomcat --> catsList / ((SuperCat) new Tomcat(..)) UpCasting
	public static void addNewTomcat(String [] arr){
		catsList.add((SuperCat) new Tomcat(arr[0],arr[1]));
	}
	
	// some Dog ...
	public static Dog getSomeRandomDog(){
		return dogsList.get(random.nextInt(dogsList.size())); 
	}
	
	// some Cat OR Tomcat
	public static SuperCat getSomeRandomFelidae() {
		return catsList.get(random.nextInt(catsList.size()));
	}
	

}
