package Constructorinjction;

import java.util.List;

public class person {
	
  private String name ; 
  private int age ; 
  private certi c;
  private List<String> list;
  
  public person(String name , int age ,certi c ,List<String> list) {
	  this.age = age ; 
	  this.name  = name; 
	  this.c = c;
	  this.list=list;
  }

  
  
  public String toString() {
	  return this.name + ":"+ this.age + ":"+ "{"+this.c.name+"}"+list;
  }

}
