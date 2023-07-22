package object;

class Hclass1{
	int a=1;
	
}
class Hclass2 extends Hclass1{
	void dispaly() {
		System.out.println(super.a);
	}
}
class Hclass3 extends Hclass1{
	void dispaly() {
		System.out.println(super.a);
	}
}

public class Hierarchial {
	public static void main(String args[]) {
		Hclass2 h=new Hclass2();
		h.dispaly();
		Hclass3 h1=new Hclass3();
		h1.dispaly();
	}
}
