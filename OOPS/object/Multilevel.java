package object;

class Mclass1{
	int a=10;
	void display(){
	System.out.println("Mclass1");
	}
}
class Mclass2 extends Mclass1{
	int b=5;
	void display1(){
		System.out.println("Mclass2");
		System.out.println(super.a);
		}
}
class Mclass3 extends Mclass2{
	void display2(){
		System.out.println("Mclass3");
		System.out.println(super.b);
		super.display();
		}
}



public class Multilevel {
	public static void main(String args[]) {
		Mclass2 m=new Mclass2();
		m.display();
		m.display1();
		Mclass3 m1=new Mclass3();
		m1.display();
		m1.display2();
	}
}
