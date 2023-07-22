package object;


interface GPI {
	default void show()
	{
		System.out.println("Default GPI");
	}
}

interface Inter1 extends GPI {
}
interface Inter2 extends GPI {
}
class TestClass1 implements Inter1, Inter2 {

}
public class Hybrid {

	public static void main(String args[])
	{
		TestClass1 d = new TestClass1();
		d.show();
	}
}
