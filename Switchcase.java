package nandu;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		System.out.println("Enter your choice (1/2/3/4):");
		int choice = n.nextInt();
		
		System.out.println("Enter the number1:");
		double n1=n.nextDouble();
		
		System.out.println("Enter the number2:");
		double n2=n.nextDouble();
		
         double result;
         
         switch(choice)

         {
         case 1:
        	 result = n1 + n2;
        	 System.out.println("Result:"+result);
         break;
	 case 2:
    	 result = n1 - n2;
    	 System.out.println("Result:"+result);
    	 break;
	 case 3:
    	 result = n1 * n2;
    	 System.out.println("Result:"+result);
    	 break;
	 case 4: 
		 if(n2 !=0) {
		 
	 
    	 result = n1 / n2;
    	 System.out.println("Result:"+result);
    	 break;
		 }
		 else
		 {
			 System.out.println("Error");
		 }
	default:
		System.out.println("Invalid choice");
    	
    	 
         
         
         
         
         }
}
}