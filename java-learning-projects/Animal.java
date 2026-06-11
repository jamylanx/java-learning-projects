public static void main(String args){
class Animal{

 private boolean carnivore;

 private String eats;

 private int noOfLegs;

 public Animal(){}

 public Animal(boolean car, String rawFood, int legs){
 	this.carnivore = car;
 	this.eats = rawFood;
 	this.noOfLegs = legs;
 }

 public boolean isCarnivore(){
  return carnivore;
 }

 public void setCarnivore(boolean carnivore)
 {
 this.carnivore = carnivore;
 }

 public String getEats(){
  return eats;
 }

 public void setEats(String eats){
 this.eats = eats;
 }

 public int getNoOfLegs(){
  return noOfLegs;
 }

 public void setNoOfLegs(int noOfLegs){
  this.noOfLegs = noOfLegs;
 }

 }
 }



