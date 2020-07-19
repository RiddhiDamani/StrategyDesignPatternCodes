class StringObject{ 
	
	public String str; 
	public StringObject(String str)
	{ 
		this.str = str; 
	} 
	public String toString()
	{ 
		return str;     // this is return the str value
	} 
}


public class SwapStringDemo1 { 
	
	public static void main(String[] args) { 
		
		StringObject x = new StringObject("hello");  // x = "hello" 
		StringObject y = new StringObject("world");  // y = "world"
		swap(x, y); 
		System.out.println(x);    // world
		System.out.println(y);    // hello
	} 
	
	public static void swap(StringObject a, StringObject b) { 
		String t = a.str;   // t = hello
		a.str = b.str;     // a = world
		b.str = t;        // b = hello
	} 
} 


