package com.mongia.billing.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class Calc{
	
	Calc(){
		System.out.println("Calc Cons Call");
	}
	public int add(int x, int y) {
		return x + y;
	}
	public int sub(int x, int y) {
		return x - y;
	}
	public int mul(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
}
class ScCalc{
	ScCalc(){
		System.out.println("ScCalc Cons Call");
	}
}
class PrCalc{
	PrCalc(){
		System.out.println("Pr Calc Cons Call");
	}
}
public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		//Calc c = new Calc();
		System.out.println("Enter the classname to call");
		Scanner s = new Scanner(System.in);
		String className = s.next();
		Object object = Class.forName(className).newInstance();
		System.out.println("Enter the Method Name");
		String methodName = s.next();
		Method method = object.getClass().getDeclaredMethod(methodName, int.class, int.class);
		Object result = method.invoke(object, 10,20);
		System.out.println("Result is "+result);
		
		
		
		
		System.exit(0);
		try {
		
		int e = 10/0;
		String  name = null;
		System.out.println(name.toUpperCase());
		int x [] = new int[10];
		System.out.println(" i am at 8 ");
		x[100] = 200;
		System.out.println("I am at 10");
		}
		catch(ArithmeticException e) {
			
		}
		catch(NullPointerException e) {
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
		}
		catch(Exception e) {
			
		}
		String path = "/Users/amit/Documents/CoreJava330WEndAug/billing/src/com/mongia/billing/dao/Test.java";
		try {
			FileInputStream fs = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
