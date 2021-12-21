package myPackage;

import java.util.Scanner;

public class DemoConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner (System.in);
		 
 // 1----- Check weather a year is leap year or common year
		 
         /* int year ;
		 System.out.println("Enter a Year : ");
		 year = sc.nextInt();
		 if(((year%4==0)&&(year%100!=0))||year%400==0) {
			 System.out.println("LEAP YEAR");
		 }
		 else {
			 System.out.println("COMMON YEAR");
		 } */
		 
		 
// 2----- program for check a number is even or add
		 
		 /*int a;
		 System.out.println("Enter a number : ");
		 a = sc.nextInt();
		 if(a % 2 == 0) {
			 System.out.println("Even number");
		 }
		 else {
			 System.out.println("Odd number");
		 } */
		 
 // 3---- using ternary operator to check weather a number is even or odd
		 
		/* int number;
		 System.out.println("Enter a number : ");
		 number = sc.nextInt();
		 // using ternary operator
		 String output = (number % 2 ==0)?"even number":"odd number";
		 System.out.println(output); */
		 
		 
 // 4--- Using if-else-if ladder to check user grade
		 
		/* int marks;
		 System.out.println("Enter your Marks : ");
		 marks = sc.nextInt();
		 if(marks<50) {
			 System.out.println("Fail");
		 }
		 else if(marks>=50 && marks<60) {
			 System.out.println("D Grade");
		 }
		 else if(marks>=60 && marks<70) {
			 System.out.println("C Grade");
		 }
		 else if(marks>=70 && marks<80) {
			 System.out.println("B Grade");
		 }
		 else if(marks>=80 && marks<90) {
			 System.out.println("A Grade");
		 }
		 else if(marks>=90 && marks<100) {
			 System.out.println("A+ Grade");
		 }
		 else {
			 System.out.println("Invalid Marks");
		 } */
		 
		 
// 5------java nested if example
		 
		/* int age , weight ;
		 System.out.println("Enter Your Age : ");
		 age = sc.nextInt();
		 System.out.println("Enter Your Weight : ");
		 weight = sc.nextInt();
		 // using nested if
		 if(age>=18) {
			 if(weight>50) {
				 System.out.println("You are eligible to Donate blood");
			 }
			 else {
				 System.out.println("You are not eligible to donate Blood... Age must be greater than 18 & weight will be more than 50");
		 }
		 
		 } */
		 
		 
// 6------ Switch Statements for add , sub , mul , div 
		 
	        // here declaring variable;
	       /*int a,b,opt,add,sub,mul,div;
	        // Here we print the output
	        System.out.println("Enter first number : ");
	        // here we taking input from user for a
	        a = sc.nextInt();
	        System.out.println("Enter Second number : ");
	        // here we taking input from user for b
	        b = sc.nextInt();
	        
	        // here using while loop until the condition is true
	        while(true){
	            
	             // here we printing arithmetic operator to choose which operation you want and press the button 
	            System.out.println("Enter 1 for Addition"); 
	            System.out.println("Enter 2 for Substraction");
	            System.out.println("Enter 3 for Multiplication");
	            System.out.println("Enter 4 for Divison");
	            System.out.println("Enter 5 for Exit");

	            // here we creating and button object By using Switch Case Statements for taking input from useer 
	            opt = sc.nextInt();
	            // here we using switch case statement
	            switch(opt){
	                case 1 : add = a+b;
	                System.out.println("Result :" + add);
	                break;
	                case 2 : sub = a-b;
	                System.out.println("Result :" + sub);
	                break;
	                case 3 : mul = a*b;
	                System.out.println("Result :" + mul);
	                break;
	                case 4 : div = a/b;
	                System.out.println("Result :" + div);
	                break;
	                case 5 : System.exit(0);
	            } 
	        } */
		 
// 7--- Switch Statements with Strings
		 /*
		 // declaring variable integer as month
		 int month;
		 System.out.println("Enter month :");
		 // using Scanner to take input from user 
		 month = sc.nextInt();
		
		// using Switch case statements to find month which user can input
		 switch(month) {
		 case 1 : 
		 System.out.println("January");
		 break;
		 case 2 : 
		 System.out.println("feburary");	 
		 break;
		 case 3 :
		 System.out.println("March");
		 break;
		 case 4 : 
		 System.out.println("April");
		 break;
		 case 5 : 
		 System.out.println("May");
		 break;
		 case 6 : 
	     System.out.println("June");
	     break;
		 case 7 : 
	     System.out.println("July");
	     break;
		 case 8 : 
		 System.out.println("August");
		 break;
		 case 9 : 
		 System.out.println("September");
		 break;
		 case 10 : 
		 System.out.println("October");
		 break;
		 case 11 : 
		 System.out.println("November");
		 break;
		 case 12 : 
		 System.out.println("December");
		 break;
			 
		 default :System.out.println("invalid Month");
		 }  */
		 
		 
// 8-----Java Program to demonstrate the use of Java Switch  
		  

		  /*  int level;
		    System.out.println("Enter your level");
		    level=sc.nextInt();
		    //Using String in Switch expression  
		    switch(level){    
		    //Using String Literal in Switch case  
		    case 1 :
		    	System.out.println("Beginner");
		    break;    
		    case 2 : 
		    	System.out.println("Expert");
		    break;    
		    case 3 :
		    	System.out.println("Pro");
		    break;    
		    default:
		    System.out.println("Invalid button");  
		    break;  
		    }    */
		 
		 
// 9-----Java Program to demonstrate the use of Wrapper class  
		  
		
		        /*    Integer age = 18;        
		            switch (age)  
		            {  
		                case (16):            
		                    System.out.println("You are under 18.");  
		                    break;  
		                case (18):                
		                    System.out.println("You are eligible for vote.");  
		                    break;  
		                case (65):                
		                    System.out.println("You are senior citizen.");  
		                    break;  
		                default:  
		                    System.out.println("Please give the valid age.");  
		                    break;  
		            }    */         
		         
		     
		  
		  
		 
		
		 
		 
	            
	        }
		 
		  }

	


