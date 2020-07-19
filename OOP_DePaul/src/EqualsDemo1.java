class StringObject1 { 
	
	public String str; 
	
	public StringObject1(String str) { 
		this.str = str; 
	} 
	
	public String toString() { 
		return str; 
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
		comparisonResult = x.equals(y); 	
		System.out.println(comparisonResult); 
		comparisonResult = y.equals(z);
		System.out.println(comparisonResult); 
	} 
} 

