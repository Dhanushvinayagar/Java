package betom;
import java.util.*;

public class arraylist {
	public static void main(String args[]) {
		System.out.println("Arraylist");
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		System.out.print(a);
		System.out.print(a.get(0));
		Iterator <Integer> i = a.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
	}
}
