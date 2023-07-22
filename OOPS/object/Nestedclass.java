package object;

class Outer{
	private int a=10;
	
	void display() {
		class Finner{//local inner class
			void msg() {
				System.out.println(a);
			}
		}
		Finner f=new Finner();
		f.msg();
	}
	
	 class Inner{		//inner class can access private also
		void msg() {
			System.out.print(a);
		}
	}
}
public class Nestedclass {
	public static void main(String args[]) {
		Outer c1=new Outer();
		c1.display();
		
		Outer.Inner c2=c1.new Inner();
		c2.msg();
  
	}

}
