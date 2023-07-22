package object;

class Class1{
	void display() {
		System.out.print("No parameters passes \n");
	}
	int display(int a) {
		return a;
	}
	double display(double a) {
		return a;
	}
	
	void display(int a,int b) {
		System.out.print("\n"+a*b+"\n");
	}
	void display(int a,double b) {
		System.out.print("\n"+a*b+"\n");
	}
	void display(int a,int b,int c) {
		System.out.print(a*b*c);
	}
	
}

public class Overloading {
	public static void main(String args[]) {
		Class1 c1=new Class1();
		c1.display();
		
		System.out.println(c1.display(1));
		System.out.print(c1.display(1.5));
		c1.display(1,2);
		c1.display(1,2.5);	//int and long cannot be passed
		c1.display(1,2,3);
	}

}
