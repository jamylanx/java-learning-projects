class Employee{
private String Name;
private int EmpID;
private int Age;

public int getAge(){
return Age;
}
public String getName(){
return Name;
}
public int getEmpID(){
return EmpID;
}
public void setAge(int newAge){
Age = newAge;
}
public void setName(String newName){
Name = newName;
}
public void setEmpID(int newEmpID){
EmpID = newEmpID;
}
}

public class Encap1{
public static void main(String [] args){

Employee e = new Employee();
e.setName("Richard");
e.setAge(37);
e.setEmpID(12465789);

System.out.println("Employee's Name: " + e.getName());
System.out.println("Employee's Age: " + e.getAge());
System.out.println("Employee's ID: " + e.getEmpID());
}
}
