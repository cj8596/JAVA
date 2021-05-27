package mycaptain;

import java.util.Scanner;

public class Employees {
 
 String name;
 int yoj;
 float salary;
 String address;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the Name :: ");
  name = in.next();
  System.out.print("Enter the Year of Joining :: ");
  yoj = in.nextInt();
  System.out.print("Enter the Salary :: ");
  salary = in.nextFloat();
  System.out.print("Enter the Address :: ");
  address = in.next();
 }
 
 public void display() {
  
  System.out.println("Employee Name = " + name);
  System.out.println("Employee Year of Join = " + yoj);
  System.out.println("Employee salary = " + salary);
  System.out.println("Employee Address = " + address);
 }
 public static void main(String[] args) {
	 
	  Employees e[] = new Employees[3];
	  
	  for(int i=0; i<3; i++) {
	   
	   e[i] = new Employees();
	   e[i].getInput();
	  }
	  
	  System.out.println("**** Data Entered as below ****");
	  
	  for(int i=0; i<3; i++) {
	   
	   e[i].display();
	  }
	 }
}
