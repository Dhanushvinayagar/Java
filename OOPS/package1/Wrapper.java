package package1;

public class Wrapper {
	public static void main(String args[]) {
		
		
		Integer a=1;	//object
		System.out.println(a);
	
		//autoboxing primitives to object
		int x=10;
		Integer i=Integer.valueOf(x);
		System.out.println(i);
		Integer j=i;
		System.out.println(j);
		
		//auto unboxing object to primitives
		Integer b=new Integer(3);    
		int u=b.intValue();
		int v=b; 
		    
		System.out.println(b+" "+u+" "+v); 
	}
}
