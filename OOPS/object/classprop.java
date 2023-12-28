package object;

class Default{
	int a=9;
	void display() {
		System.out.print("No constructor used:");
		System.out.print(a+"\n");
	}
}

class Myclass{
	Myclass() {
		System.out.print("Default Constructor"+"\n");
	}
	int u=20,v;
	void show() {
		System.out.print("Show sum:");
		System.out.print(u);
		
	}
}
class Newclass{
	int v,u,z;
	Newclass(int a,int b){
		 v=a;
		 u=b;
	}
	Newclass(){
//		System.out.print("\n"+"Default Constructor with  parameter constructor ,sum:");
//		System.out.print(v+u+z);
	}
	Newclass(int a,int b,int c){
		 v=a;
		 u=b;
		 z=c;
	}
	void display() {
		System.out.print("\n"+"Constructor with parameters ,sum:");
		System.out.print(v+u+z);
	}
	
}
class Thisword{
	int a,b;
	Thisword(int a,int b){
		this.a=a;
		this.b=b;
	}
	void display() {
		System.out.print("\n"+"This sum:");
		System.out.print(a+b);
	}
}

public class classprop {
	public static void main(String args[]) {
		//A constructor is assigned default when not created
			Default d= new Default();
			d.display();
		//A Java constructor cannot be abstract, static, final, and synchronized
			Myclass m=new Myclass();
			System.out.print("m.u:"+m.u);
			m.show();
		//Parameterized constructor	
			Newclass n=new Newclass(2,3);
			n.display();
			
			Newclass ne=new Newclass();
			ne.u=n.u;//if not assigned u=0 and v=0;
			ne.v=n.v;
			ne.display();
			
			
			Newclass na=new Newclass(2,3,4);
			na.display();
		//usage of this keyword
			Thisword t=new Thisword(5,6);
			t.display();
	}
}
