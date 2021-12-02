package training;

import java.util.Scanner;

public class Expense {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
      System.out.println("enter branding expenses");
      double brand=sc.nextDouble();
  System.out.println("enter travel expenses:");
  double travel=sc.nextDouble();
  System.out.println("enter food expenses");
  double food=sc.nextDouble();
  System.out.println("enter logistic expenses:");
  double logistic=sc.nextDouble();
  System.out.printf("Total expenses: ");
  double total = brand+travel+food+logistic;
  System.out.printf("Rs. %.2f  ",total);
 
 
	System.out.printf("\nBranding expense percent: %.2f  ",(brand/total)*100);
	System.out.printf("\nTravel expense percent: %.2f ",(travel/total)*100);
	System.out.printf("\nFood expense percent: %.2f ",(food/total)*100);
	System.out.printf("\nLogistics expense percent:  %.2f",(logistic/total)*100);
  
  
 
 
}
}