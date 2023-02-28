package calculatorapp.mainapp;

import calculatorapp.add.Addition;
import calculatorapp.div.Division;
import calculatorapp.mod.Moddivision;
import calculatorapp.mul.Multiplication;
import calculatorapp.sub.Subtraction;

public class CalculatorMainApp {

	public static void main(String[] args) {
		int number1 = 15;
		int number2 = 5;
		int number3 = 4;
		int output = 0;
	Addition add = new Addition();
	output = add.sum(number1, number2);
	System.out.println("Addition output-- "+output);
	
	
	Subtraction sub = new Subtraction();
	output = sub.subtract(number1, number2);
	System.out.println("Subtraction output-- "+output);
	
	Multiplication mul = new Multiplication();
	output = mul.multipy(number1, number2);
	System.out.println("Multiplication output-- "+output);
	
	Division divi = new Division();
	output = divi.division(number1, number2);
	System.out.println("Division output-- "+output);
	
	Moddivision Moddiv = new Moddivision();
	output = Moddiv.mod(number1, number2);
	System.out.println("Moddivision output-- "+output);
	
	output = Moddiv.mod(number1, number3);
	System.out.println("Moddivision output-- "+output);
			
		// TODO Auto-generated method stub

	}

}
