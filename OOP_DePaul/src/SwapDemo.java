public class SwapDemo { 
	
	private SwapDemo() {} 
	
	static public void main (String[] args) { 
		int x = 42; 
		int y = 27; 
		SwapDemo.swap(x,y); 
		System.out.println(x); 
		System.out.println(y); 
	} 
	
	private static void swap (int a, int b) //a = 42; b = 27
	{ 
		int t = a; // t = 42
		a = b; 		// a = 27
		b = t; 	  // b = 42   // Void is mentioned -> does not return value back to swap method. hence, value is not swaped. 
	} 
} 
