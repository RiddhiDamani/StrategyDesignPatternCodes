public class SwapStringDemo { 
	
	public static void main(String[] args){ 
		
		String x = "hello"; 
		String y = "world"; 
		swap(x, y); 
		System.out.println(x); 
		System.out.println(y); 
	} 
	
	public static void swap(String a, String b){  // Void -> cannot return value outside this context
		String t = a; 
		a = b; 
		b = t; 
	} 
}
