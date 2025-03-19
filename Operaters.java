package nandu;

public class Operaters {
	public static void main(String[] args) {
		int a=5, b=8;
		
		//Arithmetic
		System.out.println("Add"+(a+b));
		System.out.println("Sub"+(a-b));
		System.out.println("Mul"+(a*b));
		
		//Relation
		System.out.println("equal to"+(a==b));
		System.out.println("not equal"+(a!=b));
		System.out.println("greater than"+(a>=b));
		System.out.println("less than equal to"+(a<=b));
		
		//Logic
		boolean condition1 = true, condition2 = false;
		
		System.out.println("Logical AND"+(condition1 && condition2));
		System.out.println("Logical OR"+(condition1 || condition2));
		System.out.println("Logical NOT"+(!condition1));
		
		//Unary
		System.out.println("Post Increment"+(a++));
		System.out.println("Pre Increment"+(++a));
		System.out.println("Post Decrement"+(b--));
		System.out.println("Pre Decrement"+(--b));
		
		System.out.println("Unary negation"+(~a));
		System.out.println("Unary negation"+(~b));
		
		//Bitwise
		/***
		 * AND --  &
		 * OR  --  |
		 * NOT --  ~
		 * XOR --  ^
		 */
		
	}

}





