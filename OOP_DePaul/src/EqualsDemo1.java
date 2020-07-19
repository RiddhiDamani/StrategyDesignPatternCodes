class StringObject1 { 
	
	public String str; 
	
	public StringObject1(String str) { 
		this.str = str; 
	} 
	
	public String toString() { 
		return str; 
	} 
	
	/*
	 * If you don’t override .equals() in a new class, it will inherit 
	 * from the parent class. In Java, the parent class is implicitly Object 
	 * if no base class is otherwise specified.
	 * The default implementation of .equals() in Object is the same as ==, 
	 * which is why using .equals() in the previous example didn’t make a difference.
	 */
	// Overriding .equals here 
	public boolean equals(Object that) {
		if(!(that instanceof StringObject1)) {
			return false;
		}
		else {
			StringObject1 thatSO = (StringObject1) that;
			return thatSO.str == this.str;   
		}
	 
	}
} 


public class EqualsDemo1 { 
	public static void main(String[] args) { 
		
		int a = 4; 
		int b = 4; 
		boolean comparisonResult = a == b; 
		
		System.out.println(comparisonResult); 
		// The following line does not compile. 
		// comparisonResult = a.equals(b); 
		// System.out.println(comparisonResult); 
		
		StringObject1 x = new StringObject1("hello"); 
		StringObject1 y = new StringObject1("hello"); 
		StringObject1 z = y;
		
		comparisonResult = x == y; 
		System.out.println(comparisonResult); 
		comparisonResult = x.equals(y); 	    // Different in result happens here - of adding the above equals method 
		System.out.println(comparisonResult); 
		comparisonResult = y.equals(z);
		System.out.println(comparisonResult); 
	} 
} 

