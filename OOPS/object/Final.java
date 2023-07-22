package object;

final class Fclass{	//class cannot extends 
	final int x=10; 	//x=10 cannot be replaced
	final void run() {	//run() cannot be used in any other class
		System.out.println("X:"+x);
	}
}

public class Final {
	public static void main(String args[]) {
		Fclass f=new Fclass();
		f.run();
	}
}
