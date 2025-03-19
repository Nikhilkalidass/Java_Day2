package nandu;

public class inc_dec {
	public static void main(String[] args) {
		int a=5, c;
		
		System.out.println("post increment"+(a++));
		System.out.println("post decrement"+(a--));
		System.out.println("pre increment"+(++a));
		System.out.println("pre decrement"+(--a));
		
		c= a++ + ++a + --a;
				
				System.out.println("c="+c);
	}

}
