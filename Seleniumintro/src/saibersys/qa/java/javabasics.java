package saibersys.qa.java;

import saibersys.qa.java2.Employee;
import saibersys.qa.java2.Mammal;
import saibersys.qa.java2.Salary;

public class javabasics {
	
	public static void main(String args[]){
		javabasics obj1 = new javabasics();
		obj1.noreturn();
		obj1.noreturnparameter(10);
		System.out.println(obj1.withreturn());
		String str=obj1.withreturnparameter(20);
		System.out.println(str);
		staticmethod();
		try{
			System.out.println(1/0);
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("try block has 1/0 so it will throw exception");
		}
		Mammal m = new Mammal();  //class from different class
		m.eat();
		
		Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	    Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
	    System.out.println("Call mailCheck using Salary reference --");
	    s.mailCheck();
	    System.out.println("\n Call mailCheck using Employee reference--");
	    e.mailCheck();
		
	}
	
	public static void staticmethod(){
		System.out.println("this is a static method");
	}
	
	public void noreturn(){
		System.out.println("Void method with no parameters");
	}
	
	public void noreturnparameter(int x){
		System.out.println("voidmethod with parameter x = "+x);
	}
	public String withreturn(){
		return "return method with no parameters";
	}
	
	public  String withreturnparameter(int x){
		return "return method with parameter x = "+x;
	}
}
