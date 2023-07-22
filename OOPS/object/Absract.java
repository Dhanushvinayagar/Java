package object;

abstract class Aclass{
	abstract void func();  //must be inherited
	void display() {
		System.out.println("Abstract class");
	}
	
}

class Bclass extends Aclass{
	void func() {
		System.out.println("Bclass");
	}
}

public class Absract {
	public static void main(String args[]) {
		Bclass b=new Bclass();
		b.func();
		b.display();
	}
}
