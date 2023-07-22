package object;

class Sclass1{
	int a=10;
	Sclass1(){
		System.out.println("Sclass1 constructor");
	}
	void show() {
	System.out.println("Sclass1 method");

	}
	void show1() {
		System.out.println("super method");
	}
}
class Sclass2 extends Sclass1{
	Sclass2(){
		super();
	}
	
	void display() {
		System.out.println("Sclass2");
		System.out.println(super.a);
		super.show1();
	}
	
}
public class singleinherit {
	public static void main(String args[]) {
		Sclass2 s2=new Sclass2();
		s2.show();
		s2.display();
	}
}
