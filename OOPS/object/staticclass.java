package object;
class Animal {//top class cannot be static
	class Reptile{
		void display() {
			System.out.println("Reptile");
		}
	}

	  static class Mammal {
	      public void displayInfo() {
	        System.out.println("Mammal");
	      }
	   }
	}



public class staticclass {
	static int b=3;//allocate memory only once during lifetime
	static {
		System.out.println("Static executed");
	}
	
	static int cube(int a) {
		return a*a*a;
	}
	
	public static void main(String args[]) {
		System.out.println(cube(b));
		//nested inner class can be used as a static
		 Animal a= new Animal();
	      Animal.Mammal m = new Animal.Mammal();//for static class 
	      m.displayInfo();
	      Animal.Reptile r = a.new Reptile();//for non static class
	      
	      r.display();
	      

	}
}
