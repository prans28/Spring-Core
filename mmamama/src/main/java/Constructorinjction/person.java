package Constructorinjction;

public class person {
	
  private String name ; 
  private int age ; 
  private certi c;
  
  public person(String name , int age ,certi c) {
	  this.age = age ; 
	  this.name  = name; 
	  this.c = c;
  }

  
  
  public String toString() {
	  return this.name + ":"+ this.age + ":"+ "{"+this.c.name+"}";
  }

}
