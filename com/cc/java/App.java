package com.cc.java;

public class App {

  public static void main(String[] args) {
      
    // Controller als statische Klasse
    
    // Namenslisten  --> Array
    String [] dogNames = {"Fifi", "Boo", "Cassie", "Bonzo"};
    String [][] catAttributes = {{"Suzan","26"},{"Grizabella","29"}};
    String [][] tomcatAttributes = {{"Alonzo","30"},{"RumTumTugger","45"}};
    
    // Init Dogs
    for (int i = 0; i < dogNames.length; i++) {
      Controller.addNewDog(dogNames[i]);
    } 
    
    // Init Cats
    for (int i = 0; i < catAttributes.length; i++) {
      Controller.addNewCat(catAttributes[i]);
    }
    
    // Init Tomcats
    for (int i = 0; i < tomcatAttributes.length; i++) {
      Controller.addNewTomcat(tomcatAttributes[i]);
    }
    
    output("----- Cats/Dogs: Name?------");
    // Hund --> Katze/Kater: Name??
    output(Controller.getSomeRandomDog().askACatItsName());		
    // Katze/Kater --> Katze/Kater: Name??
    output(Controller.getSomeRandomFelidae().askACatItsName());
    output("");

    output("----- Cat/Tomcat: Age? ----");
    // Katze/Kater --> Katze/Kater: Alter??
    output(Controller.getSomeRandomFelidae().askACatHerAge());
    output(Controller.getSomeRandomFelidae().askACatHerAge());
    output(Controller.getSomeRandomFelidae().askACatHerAge());
    output(Controller.getSomeRandomFelidae().askACatHerAge());
    output(Controller.getSomeRandomFelidae().askACatHerAge());
    output("");
    
   output("------ PetSounds ----------");
   output(Controller.getSomeRandomDog().petSounds());
   output(Controller.getSomeRandomFelidae().petSounds());
    
  }

  public static void output(String outputStr) {
    System.out.println(outputStr);
    }


}
