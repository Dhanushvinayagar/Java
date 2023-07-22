package object;
import java.util.*;

public class object1 {
	
	
	public static void main(String[] args) {
		object1 ob=new object1();
		ob.fact(5);
		fact1(5);
	}
	 void fact(int n) {
		int pro=1;
		for(int i=1;i<=n;i++) {
			pro=pro*i;
		}
		System.out.print(pro);
	}
	static void fact1(int n) {
		int pro=1;
		for(int i=1;i<=n;i++) {
			pro=pro*i;
		}
		System.out.print(pro);
	}

}
