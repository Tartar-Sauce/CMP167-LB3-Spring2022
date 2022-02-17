// Created by Guy Alcantara on February 10th, 2022
import java.util.Scanner;
public class Problem_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);
		/*
		System.out.println("Give me one whole number");
		int num1 = scnr.nextInt();
		System.out.println("Give me another whole number");
		int num2 = scnr.nextInt();
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		
		result = num1*num2;
		System.out.println(num1 + " x " + num2 + " = " + result);
		
		result = num1/num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
		
		result = num1%num2;
		System.out.println(num1 + " % " + num2 + " = " + result);
		*/
		
		System.out.println("Give me two decimals");
		double dub1 = scnr.nextDouble();
		double dub2 = scnr.nextDouble();
		double result2;
		
		
		result2 = Math.pow(dub1, dub2);
		System.out.println(dub1 + " ^ " + dub2 + " = " + result2);
		
		String word = "75";
		int num3 = Integer.parseInt(word);
		System.out.print(num3);
		
		scnr.close();
	}

}
